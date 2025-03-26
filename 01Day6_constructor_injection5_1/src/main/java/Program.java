import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		DeptService service = context.getBean("deptService", DeptService.class);
		System.out.println(service.getList());
	}
	
}
