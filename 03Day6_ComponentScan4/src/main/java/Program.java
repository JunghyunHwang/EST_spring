import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.EchoBean;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean eb = con.getBean("echoBean", EchoBean.class);
		System.out.println(eb.getOne());
		System.out.println(eb.getTwo());
		
		eb.getOne().one();
		eb.getTwo().two();
	}

}
