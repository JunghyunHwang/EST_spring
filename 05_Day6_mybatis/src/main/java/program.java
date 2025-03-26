import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.dto.DeptDTO;
import com.service.DeptService;

public class program {

	public static void main(String[] args) {
		testCRUD();
		
		System.out.println("No prob");
	}
	
	private static void testCRUD() {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:com/config/dept.xml");
		DeptService service = context.getBean("deptService", DeptService.class);
		
		DeptDTO dto = new DeptDTO(99, "영업", "제주");
		
		int n = service.add(dto);
		service.update(new DeptDTO(99, "aa", "aa"));
		
		List<DeptDTO> list = service.select();
		for (DeptDTO d : list) {
			System.out.println(d);
		}
	}
}
