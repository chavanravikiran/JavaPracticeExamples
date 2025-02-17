package StringExample;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Ravikiran Aniruddh Chavan";
        int count = countVowels(str);
        System.out.println(count);  // Output: 3
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }
}
