import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person p1 = con.getBean("person", Person.class);
		
		System.out.printf("Name: %s, Age: %d\n", p1.getName(), p1.getAge());
		
		System.out.println("No prob");
	}

}
