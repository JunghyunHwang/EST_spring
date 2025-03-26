import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class Program {

	public static void main(String[] args) {
		
		testInsert();
	}
	
	private static void test() {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/config/config.xml");
		TestDAO dao = con.getBean("dao", TestDAO.class);
		List<TestDTO> list = dao.select();
		
		for (TestDTO d : list) {
			System.out.println(d);
		}
	}
	
	private static void testSelectByName() {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/config/config.xml");
		TestDAO dao = con.getBean("dao", TestDAO.class);
		List<TestDTO> list = dao.selectByName("홍길동");
		
		for (TestDTO d : list) {
			System.out.println(d);
		}
	}
	
	private static void testInsert() {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/config/config.xml");
		TestDAO dao = con.getBean("dao", TestDAO.class);
		dao.insert(99, "사토루", "Tokyo");
		List<TestDTO> list = dao.selectByName("사토루");
		
		for (TestDTO d : list) {
			System.out.println(d);
		}
	}
}
