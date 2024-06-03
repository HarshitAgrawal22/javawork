public class linked_list extends Object {
    Node head;

    /**
     * Innerlinked_list
     */
    public class Node<dataType extends Integer> {
        dataType val;
        Node next;

        Node(dataType val) {
            this.val = val;
            this.next = null;

        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "the value at this node is " + this.val;
        }
    }

    void show(Node head) {

        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.val);
        }
    }

    void addLast(int val) {
        Node point = new Node(val);
        if (head == null) {
            head = point;
            return;
        }

        Node pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        pointer.next = point;

    }

    void addFirst(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    void deleteNode(int val) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        if (head.val != val) {
            Node pointer = head;
            while (pointer.next.val != val) {
                pointer = pointer.next;
            }

            pointer.next = pointer.next.next;
        } else {
            head = head.next;
        }

    }

    void sortLinkedList() {
        if (head != null) {
            for (Node i = head; i != null; i = i.next) {
                for (Node j = head; j.next != null; j = j.next) {
                    if (j.val > j.next.val) {
                        int temp = j.val;
                        j.val = j.next.val;
                        j.next.val = temp;
                    }
                }
            }
        } else {
            System.out.println("list empty hai lala ji ");
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

    void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node point = head;
            while (point.next.next != null) {
                point = point.next;
            }
            point.next = null;
        }
    }

    Node reversNode(Node pointer) {
        if (pointer.next == null) {

            return pointer;
        }
        Node prev = pointer;
        pointer.next.next = prev;
        return reversNode(pointer.next);
    }

    public static void main(String[] args) {
        linked_list l = new linked_list();
        l.addLast(16);
        l.addLast(15);
        l.addLast(12);
        l.addLast(13);
        l.addLast(14);
        l.addFirst(11);
        l.addFirst(10);
        l.addFirst(17);
        l.addFirst(1010);
        l.addFirst(101);
        l.sortLinkedList();
        l.deleteFirst();

        l.deleteNode(1010);
        l.deleteLast();
        // l.reversNode(l.head);
        l.show(l.head);
    }

}
