package evaluation.entity;

public class Major {
	private int majorid;
	private String majornumber;
	private String majorname;
	private int facultyid;
	
	public int getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}
	public int getMajorid() {
		return majorid;
	}
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}
	public String getMajornumber() {
		return majornumber;
	}
	public void setMajornumber(String majornumber) {
		this.majornumber = majornumber;
	}
	public String getMajorname() {
		return majorname;
	}
	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}
	
	private Faculty faculty;

	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	

}
