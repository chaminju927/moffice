package com.example.moffice.WorkTrip.Dao;


import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.moffice.WorkTrip.Vo.WorkTrip;

	@Mapper 
	public interface WorkTripDao {

//	 Worker getWorker(int no);
	 List<WorkTrip> getList(@Param("startDate")Date startDate,
				@Param("endDate")Date endDate);
	 void insert(WorkTrip worktrip);
	 void delete(int no);
//	 void update(Worker worker);

	}

