public class double_circular {
    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = this.prev = null;

        }

        @Override
        public String toString() {
            // TODO Auto-generated method
            return "the value is" + this.val;
        }
    }

    Node head;
    Node tail;

    void addFirst(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
        tail.next = head;
    }

    void deleteNode(int val) {
        for (Node i = head; i != tail; i = i.next) {
            if (i.next.val == val) {
                i.next = i.next.next;
                i.next.next.prev = i;
                break;
            }
        }
    }

    void addLast(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
            return;
        }

        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        tail.next = head;
    }

    void show_backward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        for (Node i = tail; i != head; i = i.prev) {
            System.out.println(i.val);
        }
        System.out.println(head.val);
    }

    void show_forward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        for (Node i = head; i != tail; i = i.next) {
            System.out.println(i.val);
        }
        System.out.println(tail.val);
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("the list is already empty");
            return;
        }
        if (head.next != null) {

            tail.next = head.next;
            head = head.next;
            head.prev = tail;
            return;
        }

    }

    void deleteLast() {
        if (head == null) {
            System.out.println("head is null brother");
            return;
        }
        if (head.prev != null && tail.next != null) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }

    }

    public static void main(String[] args) {
        double_circular dcl = new double_circular();
        dcl.addFirst(12);
        dcl.addFirst(13);
        dcl.addFirst(14);
        dcl.addFirst(15);
        dcl.addLast(100);
        dcl.addLast(101);
        dcl.deleteNode(13);
        dcl.show_backward();
        dcl.show_forward();
    }
}
