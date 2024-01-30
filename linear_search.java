/**
 * linear_search
 */
public class linear_search {

    public static void main(String[] args) {
        System.err.println("hello".compareTo("yello"));
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        String[] arr2 = { "harshit", "jeevanshi", "ayushi", "himanchu", "tiwari" };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - i - 1; j++) {
                if (arr2[j].compareTo(arr2[j + 1]) > 0) {
                    String temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j] = temp;
                }
            }
        }
        System.out.println(binary_search(arr, 6));
        System.out.println(recursive_binary(arr, 6, 0, arr.length));
        for (int i = 0; i < arr2.length; i++) {
            System.err.println(arr2[i]);
        }
        System.out.println(binary_String_search(arr2, "himanchu"));
    }

    private static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int binary_search(int[] arr, int target) {
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return -1;
    }

    private static int recursive_binary(int arr[], int target, int start, int end) {
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        else if (arr[mid] > target) {
            return recursive_binary(arr, target, start, mid);
        } else {
            return recursive_binary(arr, target, mid, end);
        }
    }

    private static int binary_String_search(String[] arr, String target) {
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid].equals(target)) {
                return mid;
            } else if (arr[mid].compareTo(target) < 0) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return -1;
    }

}