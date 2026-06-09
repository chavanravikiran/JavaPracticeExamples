package BasicQuestion;

public class ObjectCreationTesting {
	
	public static void main(String[] args) {
	
		Student1 s1 = new Student1(50,"Rushi");
		Student1 s2 = new Student1();
//		s2.studentId=11;
//		s2.studentName="Kiran";
		
		Student1 s3 = s2;
//		s3.studentId=10;
//		s3.studentName="Ravi";
		
		System.out.println(s2);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}
}

class Student1 {
	
	private int studentId;
	private String studentName;
	
	@Override
	public String toString() {
		return "Student1 [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	
	public Student1() {
		studentId = 30;
		studentName = "Swapnil";
	}


	public Student1(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	
}
