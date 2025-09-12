package BasicQuestion;

import com.google.gson.Gson;

public class ConvertGsonToObjectAndViceVarsa {
	public static void main(String[] args) {
		Gson gson = new Gson();
		Person person = new Person();  // Works now
        person.key = 1;
        person.name = "Ravi";

        String json = gson.toJson(person);
        System.out.println(json);
        
        Person person1 = gson.fromJson(json,Person.class);
        System.out.println(person1.toString());
	}
	
	
	public static class Person{
		int key;
		String name;
		
		public Person() {
		}

		public Person(int key, String name) {
			super();
			this.key = key;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Person [key=" + key + ", name=" + name + "]";
		}
	}
}
