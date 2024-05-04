public class doubly_linked_list {
    class Node {
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;

        }

        @Override
        public String toString() {
            return this.val + "  is value stored in this Node ";
        }
    }

    void addFirst(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
        length++;

    }

    boolean ispalindrome() {
        if (head == null) {
            return true;
        }
        Node s = head;
        Node l = tail;
        while (s != l) {
            if (s.val != l.val) {
                return false;
            }
        }

        return true;
    }

    void addLast(int val) {
        Node temp = new Node(val);

        if (tail == null) {
            head = tail = temp;
            return;
        }

        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        length++;
    }

    void show_backward() {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        for (Node pointer = tail; pointer != null; pointer = pointer.prev) {
            System.out.println(pointer.val);
        }

    }

    void sort() {
        Node tempTail = tail;
        for (Node temp = head; temp != tail; temp = temp.next) {
            for (Node pointer = head; pointer != tempTail; pointer = pointer.next) {
                if (pointer.val > pointer.next.val) {
                    int var = pointer.next.val;
                    pointer.next.val = pointer.val;
                    pointer.val = var;
                }
            }
            tempTail = tempTail.prev;
        }
    }

    Node binary_search(int val) {
        sort();
        return binary_helper(length, head, tail, val);
        // return new Node(12);

    }

    Node binary_helper(int length, Node start, Node end, int targetValue) {

        int currentLength = length / 2;
        Node middleNode = end;
        if (start == end || start == middleNode) {
            return null;

        }
        if (start.val == targetValue) {
            return start;
        }
        if (end.val == targetValue) {
            return end;
        }
        for (int i = 0; i < currentLength - 1; i++) {

            middleNode = middleNode.prev;
        }
        if (middleNode.val == targetValue) {
            return middleNode;
        }
        if (middleNode.val > targetValue) {
            return binary_helper(currentLength, start, middleNode, targetValue);

        } else {
            return binary_helper(currentLength, middleNode, end, targetValue);

        }
    }

    void show_forward() {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        for (Node pointer = head; pointer != null; pointer = pointer.next) {
            System.out.println(pointer.val);
        }

    }

    Node head;
    int length = 0;
    Node tail;

    public static void main(String[] args) {
        doubly_linked_list dll = new doubly_linked_list();
        dll.addFirst(0);
        dll.addFirst(10);
        dll.addFirst(1110);
        dll.addFirst(1101);
        dll.addFirst(1102);
        dll.addFirst(1104);
        dll.addLast(1500);
        dll.sort();
        dll.show_forward();
        System.out.println(dll.length + "asds");
        System.out.println(dll.binary_search(10));
        dll.show_forward();

    }
}
