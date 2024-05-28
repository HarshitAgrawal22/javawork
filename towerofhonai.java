public class towerofhonai {

    static void towerOfHunoi(int noOfTowers, char start, char end, char help) {

        if (noOfTowers == 1) {
            System.out.println(" taking disk from " + start + " to " + end);
            return;
        }
        towerOfHunoi(noOfTowers - 1, start, help, end);
        System.out.println("moving disk from disk " + start + " to " + end);
        towerOfHunoi(noOfTowers - 1, help, end, start);
    }

    public static void main(String[] args) {
        towerOfHunoi(3, 's', 't', 'h');
    }
}
