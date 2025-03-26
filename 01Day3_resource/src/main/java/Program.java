import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class Program {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:stu.xml");
		Student s = (Student)ctx.getBean("student");
		s.setName("Satoru");
		s.setAge(30);
		System.out.println(s);
		
		Student s2 = (Student)ctx.getBean("student");
		s2.setName("Yuji");
		s2.setAge(18);
		System.out.println(s);
	}

}
