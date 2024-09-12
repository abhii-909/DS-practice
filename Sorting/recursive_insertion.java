public class recursive_insertion {
    // Recursive function to insertion sort
    static void insertionSort(int[] arr, int n) {
        // Base case: if n <= 1, the array is already sorted
        if (n <= 1) {
            return;
        }

        // Recursively sort the first n-1 elements
        insertionSort(arr, n - 1);

        // Insert the nth element into its correct position
        int last = arr[n - 1];
        int j = n - 2;

        // Move elements that are greater than 'last' to one position ahead
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int[] arr = {14, 9, 15, 12, 6, 0, 13};
        int n = arr.length;

        System.out.println("Before insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        insertionSort(arr, n);

        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//OUTPUT -->
// Before insertion sort: 
// 14 9 15 12 6 0 13 

// After insertion sort: 
// 0 6 9 12 13 14 15 