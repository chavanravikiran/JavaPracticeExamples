package Java8Feature_InterviewQuestions;

//Input [10,10,12,8,2,9,2,5,19,1];
//output [10,10],[12,8],[19,1]
public class CognizantInterviewQuestion2 {
	public static void main(String[] args) {
		Integer arr[]= {10,10,12,8,2,9,2,5,19,1};
		Integer sum = 20;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+arr[j] == sum) {
					System.out.println("["+arr[i]+ ", " +arr[j]+"]");
				}
			}
		}
	}
}
