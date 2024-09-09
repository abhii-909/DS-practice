//Probem statement: Given an  array n = {13, 46, 24, 52, 20, 9} apply bubble sort and arrange it in ascending order.

public class bubble_sort {
    static void bubbleSort(int arr[], int n) {

        //the algorithm
        for (int i = n-1 ; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]){

                    //SWAP
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
