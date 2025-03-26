import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person p1 = con.getBean("person", Person.class);
		
		System.out.println(p1);
	}
	
}
