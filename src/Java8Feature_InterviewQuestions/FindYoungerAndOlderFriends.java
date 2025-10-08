package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindYoungerAndOlderFriends {
	public static void main(String[] args) {
		Friends Friends1 = new Friends("Ravi","IT",28L);
		Friends Friends2 = new Friends("Avi","Chaivala",30L);
		Friends Friends3 = new Friends("Ravikiran","Founder",30L);
		Friends Friends4 = new Friends("kiran","Civil",16L);
		Friends Friends5 = new Friends("Raveer","Hero",14L);
		
		ArrayList<Friends> FriendsList = new ArrayList<>(Arrays.asList(Friends1,Friends2,Friends3,Friends4,Friends5));
		
		System.out.println(FriendsList.stream()
			.collect(Collectors.partitioningBy(x->x.getAge()>18))
			.entrySet().stream()
			.collect(Collectors.toMap(x->x.getKey() ? "Younger" : "Older ", x->x.getValue()))
		);
	}
}

class Friends{
	
	private String name;
	private String department;
	private Long age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Friends(String name, String department, Long age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Friends [name=" + name + ", department=" + department + ", age=" + age + "]";
	}
}

