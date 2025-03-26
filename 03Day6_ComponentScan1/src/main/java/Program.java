import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:dept.xml");
		
//		DeptService s1 = con.getBean("deptService", DeptService.class);
		DeptService s2 = con.getBean(DeptService.class);
		System.out.println(s2.getInfo());
	}

}
