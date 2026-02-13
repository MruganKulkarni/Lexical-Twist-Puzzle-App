import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        // Validate single-word constraint
        if (word1.contains(" ") || word2.contains(" ")) {
            System.out.println("Invalid input! Please enter single words only.");
            scanner.close();
            return;
        }

        System.out.println("First Word: " + word1);
        System.out.println("Second Word: " + word2);

        scanner.close();
    }
}
