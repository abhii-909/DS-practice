//THE ONLY DIFFERENCE IS IN RECURSIVE BUBBLE SORT WE USE RECURSION TO TRAVERSE THRU THE LIST AND SHIFT THE LARGEST ELEMENT TO IT'S CORRECT POSITION i.e last AND RECURSIVELY CALL THE FUNCTION FOR THE REST OF THE ARRAY WHEREAS IN THE INTERATIVE APPROACH WE USE LOOPS

//IF WE TALK ABOUT THE COMPLEXITIES THE TIME COMPLEXITY OF BOTH THE METHODS IS SAME i.e O(n^2) IN WORST AND AVG CASES BUT THE RECURSIVE BUBBLE SORT USES A LIL MORE SPACE COMPARED TO THE ITERATIVE METHOD SO IT HAS MORE SPACE COMPLEXITY.

class recursive_bubble {
    // Recursive function for bubble sort
    static void bubbleSort(int arr[], int n) {
        // Base case: If the size of the array is 1, it's already sorted
        if (n == 1) {
            return;
        }

        // One pass of bubble sort (largest element moves to the end)
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i + 1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursively call the function for the rest of the array
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr, n);
        
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


//OUTPUT -->
// Original array: 
// 64 34 25 12 22 11 90

// Sorted array: 
// 11 12 22 25 34 64 90 