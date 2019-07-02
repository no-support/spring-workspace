package kr.co.jhta.dao;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Job;

public class JobDao {

	private SqlMapClientTemplate template;
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	public Job getJobById(String jobId) {
		return (Job) template.queryForObject("getJobById", jobId);
	}
	
	public List<Job> getAllJobs() {
		return template.queryForList("getAllJobs");
	}
}
