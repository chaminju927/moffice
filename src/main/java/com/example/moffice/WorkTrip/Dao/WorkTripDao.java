package com.example.moffice.WorkTrip.Dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.moffice.WorkTrip.Vo.WorkTrip;

	@Mapper 
	public interface WorkTripDao {

//	 Worker getWorker(int no);
	 Object getList(String startDate, String endDate);
	 void insert(WorkTrip worktrip);
//	 void delete(int no);
//	 void update(Worker worker);

	}

