public class ll_test {
    /**
     * Node
     */
    public class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

    void addFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        } else {

            temp.next = head;
            head = temp;
        }
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        } else {
            head = head.next;
        }
    }

    void addLast(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        } else {

            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = temp;
            return;
        }
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List khaali hai");
            return;
        } else {
            Node pointer = head;
            while (pointer.next.next != null) {
                pointer = pointer.next;
            }
            pointer.next = null;
        }
    }

    void printList() {
        for (Node i = head; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }

    public static void main(String[] args) {
        ll_test test = new ll_test();
        test.addFirst(0);
        test.addFirst(1);
        test.addFirst(2);
        test.addFirst(3);
        test.addFirst(4);
        test.addFirst(5);
        test.addFirst(6);
        test.addLast(7);
        test.addLast(8);
        test.addLast(9);
        test.deleteLast();
        test.printList();
    }

}
