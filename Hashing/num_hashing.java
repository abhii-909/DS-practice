//CODE TO FIND THE FREQUENCY OF ENTERED NUMBER IN A GIVEN ARRAY


import java.util.*;

public class num_hashing{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //precompute
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("Enter the no. of elements to be checked: ");
        int q = in.nextInt();
        
        System.out.println("Enter the elements with a space: ");
        while(q-- != 0){
            int numbers = in.nextInt();

            //fetching
            System.out.println("Number " + numbers + " repeats: "+ hash[numbers]+" times.");
        }
        in.close();
    }
}




//OUTPUT:-
// Enter the size of array: 
// 5
// Enter the values: 
// 1 2 2 3 3   
// Enter the no. of elements to be checked: 
// 4
// Enter the elements with a space: 
// 0 2 3 5 
// Number 0 repeats: 0 times.
// Number 2 repeats: 2 times.
// Number 3 repeats: 2 times.
// Number 5 repeats: 0 times.