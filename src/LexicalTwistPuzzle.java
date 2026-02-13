import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        WordValidator validator = new WordValidator();
        LexicalAnalyzer analyzer = new LexicalAnalyzer();

        System.out.println("Lexical Twist Puzzle");

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        if (!validator.isValidWord(word1) || !validator.isValidWord(word2)) {
            System.out.println("Invalid input! Please enter single words only.");
            scanner.close();
            return;
        }

        if (analyzer.isTwistPair(word1, word2)) {

            System.out.println("Words form a lexical twist pair.");

            String transformed = analyzer.transformWord(word1);
            System.out.println("Transformed Word: " + transformed);

            String combined = word1 + word2;
            int[] counts = analyzer.countVowelsAndConsonants(combined);

            System.out.println("Vowel Count: " + counts[0]);
            System.out.println("Consonant Count: " + counts[1]);

            System.out.println(analyzer.getTwistCategory(counts[0], counts[1]));

        } else {
            System.out.println("Words do not form a lexical twist pair.");
        }

        scanner.close();
    }
}
