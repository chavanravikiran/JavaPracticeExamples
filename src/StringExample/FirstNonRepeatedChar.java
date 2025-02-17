package StringExample;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "ravikiran";
        char result = firstNonRepeatedCharacter(str);
        System.out.println(result);  // Output: w
    }

    public static char firstNonRepeatedCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                return currentChar;
            }
        }
        return '\0';  // No non-repeated character
    }
}
