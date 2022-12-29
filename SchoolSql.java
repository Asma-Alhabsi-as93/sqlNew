package sqlpackage;

import java.util.ArrayList;
import java.util.List;



public class SchoolSql {
	String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	List<StudentSql> StudentList = new ArrayList<StudentSql>();

	public List<StudentSql> getStudentList() {
		return StudentList;
	}

	public void setStudentList(List<StudentSql> studentList) {
		StudentList = studentList;
	}
}
