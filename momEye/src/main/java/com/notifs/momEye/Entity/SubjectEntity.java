package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_subjects")
public class SubjectEntity {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int subjectid;
		
		private String code;
		private String room;
		private String subjectname;
		
		public SubjectEntity() {}
		
		public SubjectEntity(int subjectid, String code, String room, String subjectname) {
			super();
			this.subjectid = subjectid;
			this.code = code;
			this.room = room;
			this.subjectname = subjectname;
		}

		public int getSubjectid() {
			return subjectid;
		}

		/*public void setSubjectId(int subjectId) {
			this.subjectId = subjectId;
		}*/

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getRoom() {
			return room;
		}

		public void setRoom(String room) {
			this.room = room;
		}

		public String getSubjectName() {
			return subjectname;
		}

		public void setSubjectName(String subjectname) {
			this.subjectname = subjectname;
		}
}
