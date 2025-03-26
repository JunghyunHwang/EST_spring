import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class Program2 {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		DeptService ds = con.getBean("deptService", DeptService.class);
		DeptDAO dao = ds.getDao();
		System.out.println(dao.getList());
		
		DeptService ds2 = con.getBean("deptService2", DeptService.class);
		DeptDAO dao2 = ds2.getDao();
		System.out.println(dao2.getList());
	}

}
