//Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.


public class insertion_sort {
    static void insertionSort(int[] arr, int n){
        for (int i = 0; i <= n-1; i++) { //moves left to right and treats each element as the one to be "inserted" into its correct position.
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){   //The loop ensures that the current element (arr[i]) is inserted into its correct position by
                                                 //continuously swapping it backward until it reaches the right spot.
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
    }
}

// OUTPUT --> 
// Before insertion sort: 
// 14 9 15 12 6 0 13 

// After insertion sort: 
// 0 6 9 12 13 14 15 