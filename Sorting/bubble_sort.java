//Probem statement: Given an  array n = {13, 46, 24, 52, 20, 9} apply bubble sort and arrange it in ascending order.

public class bubble_sort {
    static void bubbleSort(int arr[], int n) {

        //the algorithm
        for (int i = n-1 ; i >= 0; i--) {
            //adding this condition makes the code more optimal with better TC.
            int didswap = 0;
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]){

                    //SWAP
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = 1;
                // We will check in the first iteration if any swap is taking place. (eg; 2, 3, 5, 15, 20) 
                //If the array is already sorted no swap will occur and we will break out from the loops. 
                //Thus the iteration of the outer loop will be just 1. And our overall time complexity will be O(N).
                }
            }
            if(didswap == 0){
                break;
            }
        }
        //making the code presentable
        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        //presentation again
        System.out.println("Before bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //calling the function
        bubbleSort(arr, n);
    }
}


//OUTPUT -->
// Before bubble sort: 
// 13 46 24 52 20 9 

// After bubble sort: 
// 9 13 20 24 46 52 
