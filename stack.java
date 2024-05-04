public class stack {

    public class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {

            return "the value at this node is ->" + head.val;
        }

    }

    Node head;

    boolean isEmplty() {
        return head == null ? true : false;
    }

    void peek() {
        System.out.println(head);
    }

    void display() {
        for (Node i = head; i != null; i = i.next) {
            System.out.println(i.val);
        }
    }

    int pop() {
        if (head == null) {
            System.out.println("list is empty");
            return -1;
        }

        Node temp = head;
        head = head.next;
        return temp.val;

    }

    void push(int val) {

        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
        return;
    }

    public static void main(String[] args) {
        stack s = new stack();
        System.out.println(
                s.isEmplty());
        s.push(0);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        System.out.println(
                s.isEmplty());
        s.peek();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}

// P Q R M N O T