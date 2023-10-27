package com.example.moffice.WorkTrip.Controller;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moffice.WorkTrip.Service.WorkTripService;
import com.example.moffice.WorkTrip.Vo.WorkTrip;

@RequestMapping(value = "/worktrip")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class WorkTripController {
	
	@Autowired private WorkTripService workTripService;	
	
	@PostMapping
	  public String insert(@RequestBody WorkTrip workTrip) {
		System.out.println("post요청 도착 +"+ workTrip.getName());
		workTripService.add(workTrip); 
	    return "insert success!";
	 }

	@GetMapping("/list")
	public Object list(
			@Param("startDate")Date startDate,
			@Param("endDate") Date endDate) {
		System.out.println(startDate);
		System.out.println(endDate);
		return workTripService.getAllWorkTrip(startDate, endDate);
	}
	
	@DeleteMapping("/{no}")
	public String delete(@PathVariable int no) {
		System.out.println("삭제 번호 : " + no);
		workTripService.delete(no);
		return "deleted!!";
	}
	
//	@GetMapping("/{no}")
//	public Worker list(@PathVariable("no") int no) {
//		System.out.println(no);
//		return workerService.get(no);
//	}
//	

//	@PutMapping("/update")
//	public void update(@RequestBody Worker worker) {
//		System.out.println("update요청: " + worker.getName()+ worker.getEmail()+ worker.getPhone());
//		workerService.update(worker);
//		//return worker;
//	}

}
