package Java8Feature_InterviewQuestions;

//{2,7,11,6,8}
//Target =9
//Output 0,1
//Target 18
// Output 1 2
//		  2 3

public class TCSQuestionsNo3 {
	public static void main(String[] args) {
		int a[] = {2,7,11,7,8};
		int target = 18;
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]+a[j] == target) {
					System.out.println(i +" "+ j);
				}
			}
		}
			
	}
}
