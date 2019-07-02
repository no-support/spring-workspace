package kr.co.jhta.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Customer;

public class CustomerDao {

	private SqlMapClientTemplate template;
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	public List<Customer> getAllCustomers() {
		return template.queryForList("getAllCustomers");
	}
	
	public Customer getCustomerById(int id) {
		return (Customer) template.queryForObject("getCustomerById", id);
	}
	
	public Customer searchCustomers(HashMap<String, Object> param) {
		return (Customer) template.queryForObject("searchCustomers", param);
	}
	
	public void insertCustomer(Customer customer) {
		template.insert("insertCustomer", customer);
	}
	
	public void updateCustomer(Customer customer) {
		template.update("updateCustomer", customer);
	}
	
	public void deleteCustomerById(int id) {
		template.delete("deleteCustomerById", id);
	}
	
}
