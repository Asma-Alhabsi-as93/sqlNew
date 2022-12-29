package sqlpackage;

public class StudentSql {
	String StdName;
    String studentEmail;
    int studId;
    int age;
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
