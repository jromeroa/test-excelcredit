import java.util.HashMap;
import java.util.Map;

public class StringManipulation {

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
