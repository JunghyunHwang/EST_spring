import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Animal;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
//		GenericXmlApplicationContext ac = new GenericXmlApplicationContext(
//				"classpath:com/kkk/*.xml");
		
		GenericXmlApplicationContext ac = new GenericXmlApplicationContext(
				"classpath:com/kkk/multi.xml");
		
		Person p = ac.getBean("person", Person.class);
		Animal a = ac.getBean("animal", Animal.class);
		
		System.out.println(p.getName());
		System.out.println(a.getName());
	}

}
