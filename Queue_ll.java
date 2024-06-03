public class Queue_ll {

    /**
     * Node
     */
    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {
            return "The value at this node is ->" + this.val;
        }
    }

    Node first, last;

    void add(int val) {
        Node temp = new Node(val);
        if (first == null) {
            first = last = temp;
            return;
        }
        last.next = temp;

        last = temp;
        return;

    }

    int remove() {
        if (first == null) {
            System.out.println("the list is empty");
            return -1;

        }

        Node temp = first;
        first = first.next;
        return temp.val;

    }

    void peek() {
        System.out.println(first);
    }

    void display() {
        for (Node i = first; i != last; i = i.next) {
            System.out.println(i.val);
        }
    }

    public static void main(String[] args) {
        Queue_ll que = new Queue_ll();
    }
}
