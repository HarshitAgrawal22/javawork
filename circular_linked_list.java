public class circular_linked_list {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "the value is " + this.val;
        }
    }

    Node head;
    Node last;

    void show() {
        for (Node temp = head; temp != last; temp = temp.next) {
            System.out.println(temp.val);
        }
        System.out.println(last.val);
    }

    void addNode(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = last = temp;
            return;
        }
        temp.next = head;
        head = temp;
        last.next = head;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = head;
        last = temp;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next != null) {
            last.next = head.next;
            head = head.next;
            return;
        }

    }

    void addLast(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = last = temp;
            return;
        }

        last.next = temp;
        last = temp;
        last.next = head;
    }

    boolean isCircular() {
        Node temp = head, temp2 = head;
        while (temp.next != null) {
            if (temp == temp2) {
                return true;
            }
            temp = temp.next;
            temp2 = temp2.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        circular_linked_list cll = new circular_linked_list();
        cll.addNode(0);
        cll.addNode(10);
        cll.addNode(101);
        cll.addNode(11011);
        cll.addNode(1110111);
        cll.addNode(111101111);

        cll.addLast(12);
        cll.addLast(15);
        cll.deleteFirst();
        cll.deleteLast();
        cll.show();

        System.out.println(
                cll.isCircular());
    }
}
