//Problem:  Given an array of size n, sort the array using Merge Sort.

import java.util.*;

public class merge_sort {
    private static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); //temp array
        int left = low;
        int right = mid + 1;

        //storing elements in temp in sorted order
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left still remain
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right still remain
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        // putting all elements in temp
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);     //left half
        mergeSort(arr, mid+1, high);  //right half
        merge(arr, low, mid, high);   //merging sorted halves
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        merge_sort.mergeSort(arr, 0, n-1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// OUTPUT -->
// Before sorting array: 
// 9 4 7 6 3 1 5 

// After sorting array: 
// 1 3 4 5 6 7 9 
