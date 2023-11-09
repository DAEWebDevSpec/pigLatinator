/*
 * Name: Ashli Dominguez
 * 
 * Purpose: To convert text to Pig Latin..
 */
import java.util.Scanner;

public class a5main {
    public static void main(String[] args) {
        // MAKE a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for a sentence to convert into Pig Latin
        System.out.println("Enter a sentence to convert to Pig Latin:");
        // Read the user's input sentence
        String englishSentence = scanner.nextLine();
        // Close the Scanner object as it's not needed anymore
        scanner.close();

        // Use the PigLatinator class to convert the sentence to Pig Latin
        String pigLatinSentence = PigLatinator.convertSentenceToPigLatin(englishSentence);
        // Print the converted Pig Latin sentence
        System.out.println("Pig Latin:");
        System.out.println(pigLatinSentence);
    }
}
