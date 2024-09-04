import java.util.Scanner;

public class lowerCase_hashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = in.next();

        //precompute
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++ ;
        }

        System.out.println("Enter the no. of characters to check: ");
        int q = in.nextInt();
        System.out.println("Enter the character with spaces to check: ");
        while(q-- > 0){
            char c = in.next().charAt(0);

            //fetch
            System.out.println("Alphabet "+ c + " repeats: " + hash[c - 'a'] + " times");
        }
        in.close();
    }
}




//OUTPUT -->
// Enter the string: 
// sdjhhsytsghf
// Enter the no. of characters to check: 
// 3
// Enter the character with spaces to check: 
// s f g 
// Alphabet s repeats: 3 times
// Alphabet f repeats: 1 times
// Alphabet g repeats: 1 times