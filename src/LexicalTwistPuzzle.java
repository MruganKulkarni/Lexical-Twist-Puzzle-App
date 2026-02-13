import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.next();

        System.out.print("Enter second word: ");
        String word2 = scanner.next();

        System.out.println("First Word: " + word1);
        System.out.println("Second Word: " + word2);

        scanner.close();
    }
}
