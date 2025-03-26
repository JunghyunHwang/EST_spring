import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu = con.getBean("stu", Student.class);
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		
		Map<String, Cat> map = stu.getMapCat();
		
		for (Cat c : map.values()) {
		    System.out.printf("Name: %s, Age: %d\n", c.getName(), c.getAge());
		}
		
		Properties prop = stu.getPhones();
		
		Enumeration<?> e = prop.propertyNames();
		
		while (e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key + " = " + prop.getProperty(key));
		}
		
		Set<String> xxx = prop.stringPropertyNames();
		for (String key2 : xxx) {
			System.out.println(prop.get(key2));
		}
		
		System.out.println("No prob");
	}

}
