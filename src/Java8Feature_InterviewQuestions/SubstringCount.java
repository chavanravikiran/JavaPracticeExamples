package Java8Feature_InterviewQuestions;

public class SubstringCount {
    public static void main(String[] args) {
        String str = "whatisyournamewhatisyoursurnamewhatisfathersname";
        String sub = "what";

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length();
        }

        System.out.println("Count of '" + sub + "' = " + count);
    }
}
