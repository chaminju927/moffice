package com.example.moffice.WorkTrip.Service;

import java.util.List;

import com.example.moffice.WorkTrip.Vo.WorkTrip;

public interface WorkTripService {

	//WorkTrip get(int no);
	Object getAllWorkTrip(String startdate, String endDate);
	void add(WorkTrip workTrip);
	//void delete(int no);
	//void update(Worker worker);
	
}
