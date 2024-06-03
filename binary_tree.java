public class binary_tree {

    void addData(int val) {
        head = insert(head, val);
    }

    Node insert(Node temp, int val) {

        if (temp == null) {
            return new Node(val);
        } else if (val > temp.val) {
            temp.right = insert(temp.right, val);
            return temp;
        }
        temp.left = insert(temp.left, val);
        return temp;
    }

    void display(Node temp) {

        if (temp == null) {
            return;
        }

        System.out.println(temp.val);
        display(temp.left);
        display(temp.right);

    }

    static Node head;

    protected class Node {
        Node left, right;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        binary_tree bTree = new binary_tree();
        bTree.addData(4);
        bTree.addData(3);
        bTree.addData(5);
        bTree.addData(6);
        bTree.addData(2);
        bTree.addData(1);
        bTree.addData(7);
        bTree.display(head);
    }
}
