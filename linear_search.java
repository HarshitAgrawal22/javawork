/**
 * linear_search
 */
public class linear_search {

    public static void main(String[] args) {
        // System.err.println("hello".compareTo("yello"));
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // String[] arr2 = { "harshit", "jeevanshi", "ayushi", "himanchu", "tiwari" };
        // for (int i = 0; i < arr2.length; i++) {
        // for (int j = 0; j < arr2.length - i - 1; j++) {
        // if (arr2[j].compareTo(arr2[j + 1]) > 0) {
        // String temp = arr2[j];
        // arr2[j] = arr2[j + 1];
        // arr2[j] = temp;
        // }
        // }
        // }
        // System.out.println(binary_search(arr, 6));
        // System.out.println(recursive_binary(arr, 6, 0, arr.length));
        // for (int i = 0; i < arr2.length; i++) {
        // System.err.println(arr2[i]);
        // }
        // System.out.println(binary_String_search(arr2, "himanchu"));

        int newArr[] = { 9, 5, 2, 3, 7, 1, 8, 3, 4, 0 };
        // sort(newArr, 0, newArr.length - 1);
        quickSort(newArr, 0, newArr.length - 1);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    private static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    /*
     * The main function that implements QuickSort()
     * arr[] --> Array to be sorted,
     * low --> Starting index,
     * high --> Ending index
     */
    static void sort(int arr[], int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is
             * now at right place
             */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (high > low) {// checking if the length of array is more than 1

            int pi = quick_partition(arr, low, high);
            // getting the middle part of the array or we can say the pivot
            quickSort(arr, pi + 1, high);
            // using recursion to apply the sorting in two forms
            quickSort(arr, low, pi - 1);
        }
    }

    private static int quick_partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (pivot > arr[j]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;

        return i;
    }

    private static int binary_search(int[] arr, int target) {
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int recursive_binary(int arr[], int target, int start, int end) {
        int mid = (start + end) / 2;
        if (start == end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }

        else if (arr[mid] > target) {
            return recursive_binary(arr, target, start + 1, mid);
        } else {
            return recursive_binary(arr, target, mid, end - 1);
        }
    }

    private static int binary_String_search(String[] arr, String target) {
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid].equals(target)) {
                return mid;
            } else if (arr[mid].compareTo(target) < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}