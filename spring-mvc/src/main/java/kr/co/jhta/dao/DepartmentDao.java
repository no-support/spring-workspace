package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Department;

@Repository
public class DepartmentDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	public List<Department> getAllDepartments() {
		return template.queryForList("getAllDepartments");				
	}
}
