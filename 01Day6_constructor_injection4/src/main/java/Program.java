import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class Program {

	public static void main(String[] args) {
		Person p = new Person("Satoru", 30, new Cat("나비", 2));
		System.out.println(p.getName());
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person p1 = context.getBean("xxx", Person.class);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		Cat c = p1.getCat();
		System.out.println(c);
		
		Cat a = context.getBean("pet", Cat.class);
		System.out.println(a);
	}
	
}
