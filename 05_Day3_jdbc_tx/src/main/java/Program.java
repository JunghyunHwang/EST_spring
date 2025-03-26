import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// test2();
		
		testRollback();
		
		System.out.println("No prob");
	}
	
	private static void testDefault() {
		TestDAO dao = new TestDAO();
		
		ArrayList<TestDTO> list = dao.select();
		
		for (TestDTO t : list) {
			System.out.println(t);
		}
	}
	
	private static void test2() {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:test.xml");
		
		TestDAO dao = con.getBean("dao", TestDAO.class);
		ArrayList<TestDTO> list = dao.select();
		
		for (TestDTO t : list) {
			System.out.println(t);
		}
	}
	
	private static void testRollback() {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:test.xml");
		
		TestDAO dao = con.getBean("dao", TestDAO.class);
		dao.insert(10, "pppp", "ppppp");
		
		ArrayList<TestDTO> list = dao.select();
		
		for (TestDTO t : list) {
			System.out.println(t);
		}
	}

}
