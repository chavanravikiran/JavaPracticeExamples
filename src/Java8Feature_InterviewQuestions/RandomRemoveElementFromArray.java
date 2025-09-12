package Java8Feature_InterviewQuestions;

import java.util.Arrays;

public class RandomRemoveElementFromArray {
	public static void main(String[] args) {
		int[] a = {2, 3, 5, 7, 8, 1};
		
		int randomNo = 2;
        System.out.println("Random number: " + randomNo +" and array lentgh is "+a.length);
		
		usingStream(randomNo,a);
		usingTraditionalWay(2,a);
	}
	
	private static void usingStream(int randomNo,int[] a) {
		int[] b = Arrays.stream(a)
                .filter(x -> x != randomNo)
                .toArray();
		System.out.println("----------------Using Stream---------------------");
		printArray(b);
	}

	public static void usingTraditionalWay(int randomNo,int []a){
		int count=0;
	    
	    for(int i=0; i<a.length-1;i++) {
	    	if(a[i] == randomNo) {
	    		count = count + 1;
	    	}
	    }
	    
	    int b[] = new int[a.length-count];
	    int j = 0;
	    
	    for (int i = 0; i < a.length; i++) {
            if (a[i] != randomNo) {
                b[j] = a[i];
                j++;
            }
        }
		System.out.println("----------------Using Stream---------------------");
		printArray(b);
	}
	
	
	 private static void printArray(int[] b) {
		 for(int i = 0; i < b.length; i++) {
			 System.out.println(b[i]);
		 }
	 }


}

