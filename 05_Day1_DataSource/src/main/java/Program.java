import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:com/config/config.xml");
		TestDAO dao = con.getBean("dao", TestDAO.class);
		ArrayList<TestDTO> list = dao.select();
		
		for (TestDTO s : list) {
			System.out.println(s);
		}
		
		dao.delete(5);
		
		list = dao.select();
		
		for (TestDTO s : list) {
			System.out.println(s);
		}
	}

}
