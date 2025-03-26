import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person p = con.getBean("one", Person.class);
		
		System.out.println(p.getCat().getName() + "\t" + p.getCat().getAge());
		System.out.println(p.getDog().getName() + "\t" + p.getDog().getAge());
	}
	
}