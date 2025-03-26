import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.AnotherBean;
import com.spring.EchoBean;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean eb = con.getBean("echoBean", EchoBean.class);
		AnotherBean ab = eb.getAnotherBean();
		List<Integer> list = eb.getList();
		
		System.out.println(ab);
		System.out.println(list);
	}

}
