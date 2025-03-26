import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Student;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:echo1.xml", "classpath:echo2.xml");
		Student stu = con.getBean("stu", Student.class);
		System.out.println(stu);
	}

}
