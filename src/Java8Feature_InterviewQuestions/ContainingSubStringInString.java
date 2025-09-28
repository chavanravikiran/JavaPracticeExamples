package Java8Feature_InterviewQuestions;

// Given subString is present or not in String return
public class ContainingSubStringInString {
    public static void main(String[] args) {

        String originalString = "ILoveIndiaAndIndiaIsBestCountryInWorld";
        String subString = "and";

        usingTraditionalWay(originalString, subString);
    }

    private static void usingTraditionalWay(String originalString, String subString) {
        int originalLength = originalString.length();
        int subStringLength = subString.length();

        for (int i = 0; i <= originalLength - subStringLength; i++) {
            String temp = ""; // reset for each new start index
            for (int j = i; j < i + subStringLength; j++) {
                temp += originalString.charAt(j);
            }
            if (temp.equals(subString)) {
                System.out.println("Substring found at index " + i);
                return;
            }
        }
        System.out.println("Substring not found!");
    }
}
