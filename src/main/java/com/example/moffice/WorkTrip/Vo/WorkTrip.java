package com.example.moffice.WorkTrip.Vo;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class WorkTrip {
		private Integer no;
		private String workType;
		private Boolean confirm;
		private Integer workerNo;
		private String position;
		private String part;
		private String name;
		private Date enrollDate;
		private String reason;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date startDate;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date endDate;
		public String getWorkType() {
			return workType;
		}
		public void setWorkType(String workType) {
			this.workType = workType;
		}
		public Boolean getConfirm() {
			return confirm;
		}
		public void setConfirm(Boolean confirm) {
			this.confirm = confirm;
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
		public String getPart() {
			return part;
		}
		public void setPart(String part) {
			this.part = part;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getEnrollDate() {
			return enrollDate;
		}
		public void setEnrollDate(Date enrollDate) {
			this.enrollDate = enrollDate;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
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
		public Integer getNo() {
			return no;
		}
		public void setNo(Integer no) {
			this.no = no;
		}
		

	}


