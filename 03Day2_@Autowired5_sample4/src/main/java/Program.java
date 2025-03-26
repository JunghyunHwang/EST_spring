import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/config/config.xml");
		DeptService s = con.getBean("service", DeptService.class);
		
		System.out.println(s.getDao());
		System.out.println(s.getDriver());
		System.out.println(s.getUrl());
		System.out.println(s.getUsername());
		System.out.println(s.getPassword());
	}

}
