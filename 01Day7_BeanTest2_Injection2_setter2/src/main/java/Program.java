import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.AnotherBean;
import com.spring.EchoBean;

public class Program {

	public static void main(String[] args) {
		testDefaultconstructor();
		testSetterInjection();
	}
	
	private static void testDefaultconstructor() {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean eb = context.getBean("echoBean", EchoBean.class);
		
		AnotherBean ab = eb.getAnother();
		System.out.println(ab.getName());
		System.out.println(ab.getAge());
	}
	
	private static void testSetterInjection() {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean echo2 = context.getBean("echoBean2", EchoBean.class);
		AnotherBean ab = echo2.getAnother();
		System.out.println(ab.getName());
		System.out.println(ab.getAge());
	}
}
