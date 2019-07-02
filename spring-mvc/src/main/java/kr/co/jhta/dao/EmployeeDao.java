package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	public List<Employee> getEmployeesByDepartmentId(int departmentId) {
		return template.queryForList("getEmployeesByDepartmentId", departmentId);
	}
	
	public Employee getEmployeeByEmployeeId(int id) {
		return (Employee) template.queryForObject("getEmployeeByEmployeeId", id);
	}
	
	public void addEmployee(Employee employee) {
		template.insert("addEmployee", employee);
	}
}
