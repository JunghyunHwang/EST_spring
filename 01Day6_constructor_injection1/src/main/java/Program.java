import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext ac = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		Person p1 = ac.getBean("person", Person.class);
		System.out.println(p1);
		
		Person p2 = ac.getBean("basicPerson", Person.class);
		System.out.println(p2);
	}

}
