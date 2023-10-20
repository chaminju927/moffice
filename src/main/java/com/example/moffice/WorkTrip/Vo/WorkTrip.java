package com.example.moffice.WorkTrip.Vo;

import java.sql.Date;
import lombok.Data;

//@Getter
//@Setter
@Data
public class WorkTrip {
	//private Integer no;
		private String type;
		private Boolean confirm;
		private String name;
		private Integer workerNo;
		private String position;
		
		
		private Date startDate;
		private Date endDate;
		
//		public Integer getNo() {
//			return no;
//		}
//		public void setNo(Integer no) {
//			this.no = no;
//		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Boolean getConfirm() {
			return confirm;
		}
		public void setConfirm(Boolean confirm) {
			this.confirm = confirm;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getWorkerNo() {
			return workerNo;
		}
		public void setWorkerNo(Integer workerNo) {
			this.workerNo = workerNo;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public Date getStartDate() {
			return startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public Date getEndDate() {
			return endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		
		
	}


