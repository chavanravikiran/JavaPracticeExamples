package StringExample;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Madam";
        boolean result = isPalindrome(str);
        System.out.println(result);  // Output: true
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
