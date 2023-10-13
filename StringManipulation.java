import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter the word(s) you want to know about in number of consonants and vowels: ");
            String input = scanner.nextLine();
            Map<String, Integer> result = countVowelsConsonants(input);
            // Print the result 
            System.out.println(result); 
            System.out.print("Do you want to continue? (yes/no): ");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Goodbye!");
        scanner.close();
    }

    public static Map<String, Integer> countVowelsConsonants(String input) {
        Map<String, Integer> result = new HashMap<>();
        // Delete whitespace
        input = input.replaceAll("\\s", ""); 
        // Convert to lowercase the input
        input = input.toLowerCase(); 

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        result.put("vowels", vowels);
        result.put("consonants", consonants);

        return result;
    }
}
