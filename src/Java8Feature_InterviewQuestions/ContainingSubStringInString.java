package Java8Feature_InterviewQuestions;

//Given subString is present or not in String return  
public class ContainingSubStringInString {
	public static void main(String[] args) {
		
		String originalString = "ILoveIndiaAndIndiaIsBestCountryInWorld";
		String subString = "Best";
		
		usingTraditionalWay(originalString,subString);
	}

	private static void usingTraditionalWay(String originalString, String subString) {
		long originalLength= originalString.length();
		long subStringLength= subString.length();
		
		String temp = "";
		 for (int i = 0; i <= originalLength - subStringLength; i++) {
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
