import java.util.*;

class hashMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //precompute:
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;

            // fetching from the map
            if (mp.containsKey(key)) freq = mp.get(key);
            freq++;

            // inserting into the map
            mp.put(key, freq); 
        }

        System.out.println("Enter the no. of elements to be checked: ");
        int q = in.nextInt();
        System.out.println("Enter the no. to be checked: ");
        while (q-- > 0) {
            int number = in.nextInt();
            // fetch:
            if (mp.containsKey(number)) System.out.println("Number "+ number +" repeats: "+ mp.get(number) + " times");
            else System.out.println("Number " + number + " repeats: " + 0 + " times");
        }
        in.close();
    }
}

//OUTPUT -->
// Enter the number of elements: 
// 4
// Enter the elements: 
// 1 2 2 3
// Enter the no. of elements to be checked: 
// 4 
// Enter the no. to be checked: 
// 1 2 3 4
// Number 1 repeats: 1 times
// Number 2 repeats: 2 times
// Number 3 repeats: 1 times
// Number 4 repeats: 0 times


