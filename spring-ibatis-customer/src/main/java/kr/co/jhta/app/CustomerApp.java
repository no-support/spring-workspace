package kr.co.jhta.app;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.CustomerDao;
import kr.co.jhta.vo.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);

		CustomerDao customerDao = ctx.getBean(CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			System.out.println("1.전체조회  2. 고객조회 3.검색 4.등록 5.수정 6.삭제 0.종료");
			System.out.println("------------------------------------------------------");
			
			System.out.print("메뉴선택> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Customer> customers = customerDao.getAllCustomers();
				for (Customer c:customers) {
					System.out.println(c.getId());
					System.out.println(c.getName());
					System.out.println(c.getNick());
					System.out.println(c.getTel());
					System.out.println(c.getEmail());
					System.out.println(c.getAddr());
					System.out.println(c.getPoint());
					System.out.println(c.getCreateDate());
					System.out.println("-------------------------------");
				}
				
			} else if (menu == 2) {
				System.out.println("조회할 고객 번호 입력 > ");
				int id = scanner.nextInt();
				Customer c = customerDao.getCustomerById(id);
				System.out.println(c.getId());
				System.out.println(c.getName());
				System.out.println(c.getNick());
				System.out.println(c.getTel());
				System.out.println(c.getEmail());
				System.out.println(c.getAddr());
				System.out.println(c.getPoint());
				System.out.println(c.getCreateDate());
				
			} else if (menu == 3) {
				System.out.println("검색할 옵션 입력(번호/이름/닉네임) > ");
				String option = scanner.next();
				System.out.println("키워드 입력 > ");
				String keyword = scanner.next();
				HashMap<String, Object> param = new HashMap<String, Object>();
				param.put("option", option);
				param.put("keyword", keyword);
				
				Customer c = customerDao.searchCustomers(param);
				System.out.println(c.getId());
				System.out.println(c.getName());
				System.out.println(c.getNick());
				System.out.println(c.getTel());
				System.out.println(c.getEmail());
				System.out.println(c.getAddr());
				System.out.println(c.getPoint());
				System.out.println(c.getCreateDate());
				
			} else if (menu == 4) {
				System.out.println("이름 입력 > ");
				String name = scanner.next();
				System.out.println("별명 입력 > ");
				String nick = scanner.next();
				System.out.println("전화번호 입력 > ");
				String tel = scanner.next();
				System.out.println("이메일 입력 > ");
				String email = scanner.next();
				System.out.println("주소 입력 > ");
				String addr = scanner.next();
				
				Customer customer = new Customer();
				customer.setName(name);
				customer.setNick(nick);
				customer.setTel(tel);
				customer.setEmail(email);
				customer.setAddr(addr);
				
				customerDao.insertCustomer(customer);
				
			} else if (menu == 5) {
				System.out.println("수정할 고객번호 입력 > ");
				int id = scanner.nextInt();
				System.out.println("갱신할 닉네임 입력 > ");
				String nick = scanner.next();
				System.out.println("갱신할 전화번호 입력 > ");
				String tel = scanner.next();
				System.out.println("갱신할 이메일 주소 입력 > ");
				String email = scanner.next();
				System.out.println("갱신할 거주지 입력 > ");
				String addr = scanner.next();
				System.out.println("갱신할 포인트 입력 > ");
				int point = scanner.nextInt();
				
				Customer customer = new Customer();
				customer.setId(id);
				customer.setNick(nick);
				customer.setTel(tel);
				customer.setEmail(email);
				customer.setAddr(addr);
				customer.setPoint(point);
				
				customerDao.updateCustomer(customer);
				
			} else if (menu == 6) {
				System.out.println("삭제할 고객 번호 입력 > ");
				int id = scanner.nextInt();
				customerDao.deleteCustomerById(id);
				
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
}
