import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.EchoBean;

public class Program {

	public static void main(String[] args) {
		testContext();
	}
	
	private static void testDefault() {
		EchoBean echoBean = new EchoBean();
		echoBean.setEcho("Satoru");
		System.out.println(echoBean.getEcho());
	}

	private static void testContext() {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:com/spring/echo.xml");
		EchoBean echo = context.getBean("echoBean", EchoBean.class);
		
		System.out.println(echo.getEcho());
		System.out.println(echo.sayHello());
		
		EchoBean echo2 = context.getBean("echoBean2", EchoBean.class);
		
		System.out.println(echo2.getEcho());
		System.out.println(echo2.sayHello());
	}
}
