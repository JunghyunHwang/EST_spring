import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.OrderDTO;
import com.entity.ProductDTO;
import com.service.ProductService;

public class Program {

	public static void main(String[] args) {
		test();
	}
	
	private static void test() {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("dept.xml");
		
		ProductService service = con.getBean("deptService", ProductService.class);
		
		System.out.println("====== 상품 목록 ======");
		List<ProductDTO> list = service.selectProduct();
		for (ProductDTO d : list) {
			System.out.println(d);
		}
		
		System.out.println("====== 주문 목록 ======");
		List<OrderDTO> oList = service.selectOrder();
		for (OrderDTO o : oList) {
			System.out.println(o);
		}
		
		System.out.println("====== 5개 상품을 주문합니다 ======");
		try {
			service.addORder("p01", 5);
		} catch (Exception e) {
			System.out.println("Rollback 됨");
		}
		
		System.out.println("주문");
		
		list = service.selectProduct();
		for (ProductDTO d : list) {
			System.out.println(d);
		}
		
		oList = service.selectOrder();
		for (OrderDTO o : oList) {
			System.out.println(o);
		}
	}
}
