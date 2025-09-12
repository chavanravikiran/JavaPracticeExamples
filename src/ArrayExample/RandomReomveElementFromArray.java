package ArrayExample;

public class RandomReomveElementFromArray {
	public static void main(String[] args) {
		int a[]= {2,3,5,7,8,1};
//		int randomNo = (int) (Math.random() * a.length);
		int randomNo = 2;
        System.out.println("Random number: " + randomNo +" "+a.length);
        int count=0;
        
        for(int i=0; i<a.length-1;i++) {
        	if(a[i] == randomNo) {
        		count = count + 1;
        	}
        }
        
        int b[] = new int[a.length-count];
        int j = 0;
        
        for (int i = 0; i < a.length-1; i++) {
        	if(a[i] != randomNo) {
        		b[j] = a[i];
                j++;
        	}
			
		}
        for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
        
	}
}
