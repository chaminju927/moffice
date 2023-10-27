package com.example.moffice.WorkTrip.Service.ServiceImpl;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moffice.WorkTrip.Dao.WorkTripDao;
import com.example.moffice.WorkTrip.Service.WorkTripService;
import com.example.moffice.WorkTrip.Vo.WorkTrip;

@Service
public class DefaultWorkTripService implements WorkTripService {

	@Autowired(required=true) WorkTripDao workTripDao;
	
//	@Override
//	public WorkerTrip get(int no) {
//		return WorkerTripDao.getWorkerTrip(no);
//	}
//
	
	  @Override
	  public void add(WorkTrip workTrip) {
	    workTripDao.insert(workTrip);
	  }

	@Override
	public void delete(int no) {
		workTripDao.delete(no);
	}

	@Override
	public List<WorkTrip> getAllWorkTrip(Date startDate, Date endDate) {
		return workTripDao.getList(startDate, endDate);
	}

//	@Override
//	public void update(WorkerTrip workerTrip) {
//		WorkerTripDao.update(WorkerTrip);
//		//return WorkerTrip;	
//	}
//
	
	

}