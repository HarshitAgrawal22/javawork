public class stack_array {

    int max;
    int stack[];
    int top;

    stack_array(int max) {
        this.max = max;
        top = -1;
        stack = new int[max];
    }

    void push(int val) {
        if (top == stack.length - 1) {
            System.out.println("the stack is full");
            return;
        }
        top++;
        stack[top] = val;

    }

    int pop() {
        if (top == -1) {
            System.out.println("the stack is empty");
            return -1;
        }
        int val = stack[top];
        top--;
        return val;
    }

    void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    int peek(int index) {
        if (top == -1) {
            System.out.println("the stack is empty");
            return -1;
        }

        return stack[index];
    }

    boolean isEmpty() {
        return top == -1 ? true : false;
    }

    boolean isFull() {
        return top == stack.length - 1 ? true : false;
    }

    int search(int val) {
        int start = 0, end = stack.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (stack[mid] == val) {
                return mid;
            } else if (stack[mid] > val) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        stack_array Stack = new stack_array(10);
        Stack.push(0);
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(0);
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(30);
        Stack.printStack();
        System.out.println(Stack.peek(4));
        System.out.println(Stack.search(30));
        System.out.println(Stack.isFull());
        System.out.println(Stack.isEmpty() + "\n\n\n\n");
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();

        Stack.pop();
        System.out.println(Stack.isFull());
        System.out.println(Stack.isEmpty());
        Stack.printStack();
    }
}
