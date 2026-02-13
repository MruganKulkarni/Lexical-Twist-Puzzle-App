public class LexicalAnalyzer {

    public boolean isTwistPair(String word1, String word2) {
        String reversed = new StringBuilder(word1).reverse().toString();
        return reversed.equals(word2);
    }

    public String transformWord(String word) {
        return word.toUpperCase();
    }

    public int[] countVowelsAndConsonants(String combined) {

        int vowels = 0;
        int consonants = 0;

        for (char ch : combined.toLowerCase().toCharArray()) {

            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public String getTwistCategory(int vowels, int consonants) {

        if (vowels > consonants) {
            return "Vowel Dominant Twist!";
        } else if (consonants > vowels) {
            return "Consonant Dominant Twist!";
        } else {
            return "Balanced Twist!";
        }
    }
}
