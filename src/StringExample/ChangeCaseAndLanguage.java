package StringExample;

import java.util.Locale;

//we will convert string str into lowercase letter using using TURKISH and ENGLISH languages.
public class ChangeCaseAndLanguage {

	public static void main(String[] args) {
		String str = new String("I LIKE IT");
		System.out.println("Original string: " + str);
		
		// Create Locales with language "tr" for turkish and "en" for english.
		Locale turkish = Locale.forLanguageTag("tr");
		Locale english = Locale.forLanguageTag("en");

		// Converting string str into lowercase letter using turkish and english
		// languages.
		String toLowerCaseTr = str.toLowerCase(turkish);
		String toLowerCaseEn = str.toLowerCase(english);
		System.out.println("Lowercase letters in turkish: " + toLowerCaseTr);
		System.out.println("Lowercase letters in english: " + toLowerCaseEn);
	}
}
