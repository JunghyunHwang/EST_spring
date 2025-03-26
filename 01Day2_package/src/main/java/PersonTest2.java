import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		
		Person p = ctx.getBean("peron", Person.class);
		System.out.println(p);
		System.out.println(p.getInfo());
		
		Person p2 = ctx.getBean("person", Person.class);
		System.out.println(p);
		System.out.println(p.getInfo());
	}
}
