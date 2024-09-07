// You are given an array arr[] containing positive integers. These integers can be from 1 to p, and some numbers may be repeated or absent. Your task is to count the frequency of all numbers that lie in the range 1 to n.

// Input: n = 2, arr[] = [8, 9], p = 9
// Output: [0, 0]
// Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0 times. Since here P=9, but there are no 9th Index present so can't count the value.

//(GFG PROBLEM)

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class freqOfLimitedRangeArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array (N): ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the maximum value (P): ");
        int P = sc.nextInt();

        System.out.println("Original array: " + Arrays.toString(arr));

        // Call the function
        freq_count(arr, N, P);
        System.out.println("Modified array with frequencies: " + Arrays.toString(arr));
        sc.close();
    }

    public static void freq_count(int arr[], int N, int P) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if(i <= P){
                map.put(i , map.getOrDefault(i,0)+1);
            }
        }

        for (int j = 0; j < N; j++) {
            int freq = map.getOrDefault(j+1 , 0);
            arr[j] = freq;
        }
    }
}



//OUTPUT -->
// Enter the size of the array (N): 
// 7
// Enter the elements of the array: 
// 2 2 3 4 5 5 7
// Enter the maximum value (P): 
// 5
// Original array: [2, 2, 3, 4, 5, 5, 7]
// Modified array with frequencies: [0, 2, 1, 1, 2, 0, 0]


//The array has 7 elements, but since P = 5, you are only interested in counting the frequencies of numbers from 1 to 5. Any element greater than 5 will be ignored.

//The remaining elements are set to 0 because we are only interested in numbers up to P = 5.