import java.util.Scanner;

public class upperCase_hashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = in.next();

        //precompute
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'A']++ ;
        }

        System.out.println("Enter the no. of chars to be checked: ");
        int q = in.nextInt();
        System.out.println("Enter the chars with space: ");
        while(q-- > 0){
            char c = in.next().charAt(0);

            //fetch
            System.out.println("Alphabet "+ c + " repeats: "+ hash[c -'A']+ " times");
        }
        in.close();
    }
}



//OUTPUT-->
// Enter the string: 
// ABHGHGHJDF
// Enter the no. of chars to be checked: 
// 3
// Enter the chars with space: 
// A G H
// Alphabet A repeats: 1 times
// Alphabet G repeats: 2 times
// Alphabet H repeats: 3 times