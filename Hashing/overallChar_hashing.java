import java.util.*;

public class overallChar_hashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = in.next();

        //precompute
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++ ;
        }

        System.out.println("Enter the no. of char to be checked: ");
        int q =in.nextInt();
        System.out.println("Enter the chars with spaces: ");
        while(q-- > 0){
            char c = in.next().charAt(0);

            //fetch
            System.out.println("Character "+ c + " repeats: " + hash[c]+ " times");
        }
        in.close();
    }
}


//OUTPUT -->
// Enter the string: 
// ABCCCDabbbcd 
// Enter the no. of char to be checked: 
// 6
// Enter the chars with spaces: 
// A C D a b c
// Character A repeats: 1 times
// Character C repeats: 3 times
// Character D repeats: 1 times
// Character a repeats: 1 times
// Character b repeats: 3 times
// Character c repeats: 1 times