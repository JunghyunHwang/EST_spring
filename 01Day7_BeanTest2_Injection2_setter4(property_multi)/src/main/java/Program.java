import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person first = con.getBean("first", Person.class);
		Person second = con.getBean("second", Person.class);
		
		System.out.println(first);
		System.out.println(second);
	}
	
}