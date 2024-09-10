//Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.


public class selection_sort{
    static void select_sort(int arr[] , int n){
        for (int i = 0; i < n-1; i++) {
            int mini = i;
            for (int j = i; j < n; j++) {
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }

            //SWAP -->
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        select_sort(arr, n);
    }
}

// OUTPUT -->
// Before selection sort: 
// 13 46 24 52 20 9 

// After selection sort: 
// 9 13 20 24 46 52 