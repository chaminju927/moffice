package com.example.moffice.WorkTrip.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.moffice.WorkTrip.Service.WorkTripService;
import com.example.moffice.WorkTrip.Vo.WorkTrip;

@RequestMapping(value = "/worktrip")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class WorkTripController {
	
	@Autowired private WorkTripService workTripService;	
	
	@PostMapping
	  public void insert(@RequestBody WorkTrip workTrip) {
		System.out.println("post요청 도착 +"+ workTrip );
		workTripService.add(workTrip); 
	    //return "redirect:/";
	 }

//	@GetMapping("/{no}")
//	public Worker list(@PathVariable("no") int no) {
//		System.out.println(no);
//		return workerService.get(no);
//	}
//	
	@GetMapping("/list")
	public Object list(@RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate) {
		System.out.printf("startDate:", startDate);
		System.out.printf("endDate:", endDate);
		return workTripService.getAll(startDate, endDate);
		
	}

//	@PutMapping("/update")
//	public void update(@RequestBody Worker worker) {
//		System.out.println("update요청: " + worker.getName()+ worker.getEmail()+ worker.getPhone());
//		workerService.update(worker);
//		//return worker;
//	}
//
//	  @DeleteMapping("/{no}")
//	  public String delete(@PathVariable int no) {
//	    System.out.println("삭제 번호 : " + no);
//	    workerService.delete(no);
//	    return "deleted Successfully";
//	    //return null;
//	  }
}
