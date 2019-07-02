package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Job;

@Repository
public class JobDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	public void addJob(Job job) {
		template.insert("addJob", job);
	}
	
	public List<Job> getAllJobs(){
		return template.queryForList("getAllJobs");
	}
	
	public Job getJobById(String jobId) {
		return (Job) template.queryForObject("getJobById", jobId);
	}
}
