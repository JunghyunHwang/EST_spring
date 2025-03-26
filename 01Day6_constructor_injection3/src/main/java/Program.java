import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext ac = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person satoru = ac.getBean("xxx", Person.class);
		System.out.printf("Name: %s, Age: %d\n", satoru.getName(), satoru.getAge());
	}

}
