package ObjectClass;

public class OutputTracing {
	public static void main(String[] args) {
		StudentClass s1 = new StudentClass();
		StudentClass s2 = s1;
		StudentClass s3 = new StudentClass();

		s1.name = "Ravi";
		s2.name = "Kiran";

		System.out.println(s1.name);//kiran	//Both references point to the same object.

		StudentClass.display();//no need to create new object on static method
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1 == s2);//true

		System.out.println(s1.equals(s3));//false
		System.out.println(s1 == s3); //false
		
		
	}
}

class StudentClass {
	String name;

	private StudentClass(String name) {//constructor is not static final only constructor is only public, protected & private are permitted
		this.name = name;
	}

	public StudentClass() {

	}
	
	
	static void display(){
		System.out.println("static display method called");
	}
}