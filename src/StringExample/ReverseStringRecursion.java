package StringExample;

public class ReverseStringRecursion {

    // Recursive method to reverse string
    public static String reverse(String str) {
        // Base condition
        if (str.isEmpty()) {
            return str;
        }
        // Recursive call: remove first char and reverse the rest
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String text = "hello";
        String reversed = reverse(text);
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}
