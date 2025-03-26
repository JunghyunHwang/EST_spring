import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class Program2 {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/spring/config2.xml");
		DeptService ds = con.getBean("deptService", DeptService.class);
		DeptDAO dao = ds.getDao();
		System.out.println(dao.getList());
	}
	
	private static void testUtil() {
		
	}
}
