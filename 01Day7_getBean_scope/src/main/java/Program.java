import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/config/student.xml");
		Student stu1 = con.getBean("stu", Student.class);
		Student stu2 = con.getBean("stu", Student.class);
		
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu1 == stu2);
	}
}
