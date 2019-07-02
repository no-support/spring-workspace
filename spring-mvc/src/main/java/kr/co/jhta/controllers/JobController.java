package kr.co.jhta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.JobDao;
import kr.co.jhta.vo.Job;

@Controller
@RequestMapping("/job")
public class JobController {

	@Autowired
	private JobDao jobDao;
	
	@RequestMapping("/form.do")
	public String form() {
		return "job/form";
	}
	
	@RequestMapping("/add.do")
	public String add(Job job) {
		
		// 입력값 유효성 체크 수행
		jobDao.addJob(job);
		
		return "redirect:list.do";
	}
	
	@RequestMapping("detail.do")
	public String detail(String id, Model model) {
		Job job = jobDao.getJobById(id);
		model.addAttribute("job", job);
		
		return "job/detail";
	}
	
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		List<Job> jobList = jobDao.getAllJobs();
		model.addAttribute("jobs", jobList);
	
		return "job/list";
	}
}
