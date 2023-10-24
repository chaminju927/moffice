package com.example.moffice.WorkTrip.Service;


import java.sql.Date;
import java.util.List;

import com.example.moffice.WorkTrip.Vo.WorkTrip;

public interface WorkTripService {

	//WorkTrip get(int no);
	List<WorkTrip> getAllWorkTrip(Date startDate, Date endDate);
	void add(WorkTrip workTrip);
	void delete(int no);
	//void update(Worker worker);
	
}
