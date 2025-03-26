import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class Program {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:person.xml");
		Person p1 = ac.getBean("person", Person.class);
		
		System.out.println(p1);
		System.out.println(p1.getInfo());
	}

}
