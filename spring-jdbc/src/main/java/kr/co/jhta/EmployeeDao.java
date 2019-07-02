package kr.co.jhta;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
}
