package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		ArrayList<Users> userList = new ArrayList<>();
		userList.add(new Users("Ravikiran","621360932898","BRSPC1159C"));
		userList.add(new Users("Ravi","62136093234","GSPC1159C"));
		userList.add(new Users("kiran","62136093234","BFJPC1159C"));
		
		Map<Object, Long> map =userList.stream()
		.collect(Collectors.groupingBy(x->x.getUuid(),Collectors.counting()));
		
		System.out.println(map.entrySet().stream().sorted()
			.filter(x->x.getValue() > 1)
//			.distinct()
			.collect(Collectors.toList())
		);
		
	}
}


//select uuid ,count(*) from users group by uuid having count(*)>1;