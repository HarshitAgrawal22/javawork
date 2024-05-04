public class fibbo {
    public static void main(String[] args) {
        System.out.println(fibb(50));
    }

    private static int count = 0;

    public static int fibb(int target) {
        if (target == 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        }
        return fibb(target - 1) + fibb(target - 2);
    }
}
