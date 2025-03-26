import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/config/config.xml");
		DeptService s = con.getBean("service", DeptService.class);
		List<String> list = s.getList();
		System.out.println(list);
	}

}
