package StringExample;

//Reverse Words in a Sentence-
//Write a Java method that takes a sentence as input and returns the sentence with words reversed, but letters in each word stay in place.
//Input: "Java is fun" --> Output: "fun is Java"

class ReverseWordsInSentence{
	public static void main(String args[]){
		String sentence = "Java is fun";
		String [] words = sentence.split(" ");
		String reverse = "";
		
		for (int i=words.length -1; i>=0; i--){
			reverse += words[i] +" ";
		}
		System.out.println("Original Sentence is -"+sentence);
		System.out.println("Reverse Sentence is -"+reverse);
	}
}