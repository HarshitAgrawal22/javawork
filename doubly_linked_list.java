public class doubly_linked_list {
    class Node {
        Node next;
        Node prev;
        int val;
        static int length = 0;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
            length++;
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
        for (Node temp = head; temp != tail; temp = temp.next) {
            for (Node pointer = head; pointer != tail; pointer = pointer.next) {
                if (pointer.val > pointer.next.val) {
                    int var = pointer.next.val;
                    pointer.next.val = pointer.val;
                    pointer.val = var;
                }
            }
        }
    }

    Node binary_search(int val) {
        sort();
        return binary_helper(head.length, head, tail, val);
        // return new Node(12);

    }

    Node binary_helper(int length, Node start, Node end, int targetValue) {

        int currentLength = length / 2;
        Node middleNode = end;

        if (start.val == targetValue) {
            return start;
        }
        if (end.val == targetValue) {
            return end;
        }
        for (int i = 0; i < currentLength; i++) {

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
        System.out.println(dll.head.length + "asds");
        System.out.println(dll.head.val);
        System.out.println(dll.binary_search(1500));
    }
}
