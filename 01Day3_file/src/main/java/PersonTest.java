import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericApplicationContext ac = new GenericXmlApplicationContext("file:\\c:\\upload\\person.xml");
		Person p1 = ac.getBean("peron", Person.class);
		System.out.println(p1);
		System.out.println(p1.getInfo());
	}
}
