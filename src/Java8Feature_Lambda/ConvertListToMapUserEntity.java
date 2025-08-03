package Java8Feature_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToMapUserEntity {
	public static void main(String[] args) {
		User user1 = new User(1, "Ravi", 25L);
        User user2 = new User(2, "Kiran", 30L);
        User user3 = new User(3, "Chavan", 28L);
        User user4 = new User(4, "Ravi", 28L);
        
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        System.out.println(
        		userList.stream()
        		.collect(Collectors.toMap(x->x.getName(),x->x.getAge(),(existing,duplicate)->duplicate))
        );
        
	}
}


class User{
	
	public Integer id;
	public String name;
	public Long age;
	
	public User(Integer id, String name, Long age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public User() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
	
	
}