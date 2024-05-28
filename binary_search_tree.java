import javax.swing.tree.TreeNode;

public class binary_search_tree {
    /**
     * Node
     */
    public class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }

    }

    public Node root;

    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;

        } else if (value > root.data) {
            root.right = insert(root.right, value);
        } else {
            root.left = insert(root.left, value);
        }

        return root;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public Node deleteNode(Node root, int value) {
        if (root == null) {
            return root;
        } else {
            if (root.data == value) {

            }
        }
        return root;
    }

    public void preOrderTrevarsal(Node root) {
        if (root == null) {
            return;
        }
        System.err.println(root.data);
        preOrderTrevarsal(root.left);

        preOrderTrevarsal(root.right);
    }

    public void postOrderTrevarsal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTrevarsal(root.left);
        postOrderTrevarsal(root.right);
        System.out.println(root.data);
    }

    public void inOrderTrevarsal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTrevarsal(root.left);
        System.out.println(root.data);
        inOrderTrevarsal(root.right);
    }

    void inOrder(Node root, int level) {
        if (root == null) {
            return;
        }
        level++;
        inOrder(root.left, level);
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }

        System.out.println(root.data);
        inOrder(root.right, level);
    }

    public Node searchNode(Node root, int val) {
        Node temp;
        if (root == null) {
            return root;
        }
        if (root.data == val) {
            return root;
        } else if (root.data > val) {
            temp = searchNode(root.left, val);
        } else {
            temp = searchNode(root.right, val);
        }
        return temp;
    }

    public boolean isValid(Node root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValid(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        } else {
            boolean left = isValid(root.left, min, root.data);
            if (left) {
                return isValid(root.right, root.data, max);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        binary_search_tree bst = new binary_search_tree();

        bst.insert(4);
        bst.insert(2);
        bst.insert(1);

        bst.insert(3);

        bst.insert(6);
        bst.insert(7);
        bst.insert(5);
        // bst.preOrderTrevarsal(bst.root);
        // System.out.println("post order trevarsal is here");
        // bst.postOrderTrevarsal(bst.root);
        // System.out.println("inorder is here ");

        // bst.inOrderTrevarsal(bst.root);

        // System.out.println("the node you were looking was-> " +
        // bst.searchNode(bst.root, 7).data);

        // System.out.println(bst.isValid(bst.root));

        bst.inOrder(bst.root, 0);

    }
}
