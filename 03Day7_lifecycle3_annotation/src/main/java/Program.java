import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:echo.xml");
		
		Student stu = con.getBean("stu", Student.class);
		stu.getInfo();
		con.close();
	}

}
