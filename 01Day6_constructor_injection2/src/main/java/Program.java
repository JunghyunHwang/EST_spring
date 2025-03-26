import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext ac = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person p1 = ac.getBean("xxx", Person.class);
		Person p2 = ac.getBean("xxx2", Person.class);
		Person p3 = ac.getBean("xxx3", Person.class);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
