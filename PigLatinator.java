/*
 * Name: Ashli Dominguez
 * 
 * Purpose: To convert text to Pig Latin
 */
public class PigLatinator {
    // Method to convert an entire sentence to Pig Latin
    public static String convertSentenceToPigLatin(String englishSentence) {
        // Split the sentence into words based on spaces
        String[] words = englishSentence.split("\\s+");
        // Initialize a StringBuilder to construct the Pig Latin sentence
        StringBuilder pigLatinBuilder = new StringBuilder();

        // Loop through each word in the sentence
        for (String word : words) {
            // Convert the word to Pig Latin
            String pigLatinWord = convertWordToPigLatin(word);
            // Append the converted word and a space to the StringBuilder
            pigLatinBuilder.append(pigLatinWord).append(" ");
        }

        // Return the constructed sentence, trimmed to remove any trailing spaces
        return pigLatinBuilder.toString().trim();
    }

    // Method to convert a single word to Pig Latin
    private static String convertWordToPigLatin(String englishWord) {
        // Special case for the word "OF"
        if (englishWord.equalsIgnoreCase("of")) {
            return "FOAY";
        }

        // Check if the word is empty and return it as it is if so
        if (englishWord.isEmpty()) {
            return englishWord;
        }

        // Convert the word to uppercase for consistent formatting
        englishWord = englishWord.toUpperCase();
        // Get the first character of the word
        char firstLetter = englishWord.charAt(0);

        // Check if the first character is a vowel or if the word is a single character
        if (isVowel(firstLetter) || englishWord.length() == 1) {
            // For words starting with a vowel or single characters, just append "AY" to the end
            return englishWord + "AY";
        } else {
            // For words starting with a consonant, move the first character to the end and append "AY"
            return englishWord.substring(1) + firstLetter + "AY";
        }
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char character) {
        // Define a string containing all vowels for easy checking
        String vowels = "AEIOU";
        // Check if the character is contained in the string of vowels
        return vowels.indexOf(character) != -1;
    }
}
