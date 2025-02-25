package StringExample;

public class StringOperationsExample {
    public static void main(String[] args) {
    	// 1. Creating Strings
        String str1 = "Hello";
        String str2 = new String("World");

        // 2. Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        // Using concat() method
        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

        // 3. Getting Length
        System.out.println("Length of str1: " + str1.length());

        // 4. Character at Index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 5. Substring
        System.out.println("Substring (1,4) of str1: " + str1.substring(1, 4));

        // 6. Contains
        System.out.println("Does str1 contain 'lo'? " + str1.contains("lo"));

        // 7. Equals & Equals Ignore Case
        System.out.println("str1 equals 'hello': " + str1.equals("hello"));
        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

        // 8. Convert to Upper and Lower Case
        System.out.println("Upper case: " + str1.toUpperCase());
        System.out.println("Lower case: " + str1.toLowerCase());

        // 9. Trim Spaces
        String str3 = "  Java Programming  ";
        System.out.println("Trimmed: '" + str3.trim() + "'");

        // 10. Replace Characters
        System.out.println("Replace 'l' with 'w' in str1: " + str1.replace("l", "w"));

        // 11. Split a String
        String str4 = "apple,banana,orange";
        String[] fruits = str4.split(",");
        System.out.println("Splitting str4:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 12. Convert String to Integer
        String numStr = "123";
        int num = Integer.parseInt(numStr);
        System.out.println("Integer + 1: " + (num + 1));

        // 13. Convert Integer to String
        int num2 = 456;
        String numStr2 = String.valueOf(num2);
        System.out.println("Integer converted to String: " + numStr2);
    }
}


