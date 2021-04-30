public class Instructor extends User {
	int totalCourse;//kurs say�s�
	int totalLesson;//ders say�s�
	
	public Instructor() {
		super();
	}
	public Instructor(int id, String firstName, String lastName, int age, String email, String password,
			int totalCourse, int totalLesson) {
		super(id, firstName, lastName, age, email, password);
		this.totalCourse = totalCourse;
		this.totalLesson = totalLesson;
	}
	//setter & getter
	public int getTotalCourse() {
		return totalCourse;
	}
	public void setTotalCourse(int totalCourse) {
		this.totalCourse = totalCourse;
	}
	public int getTotalLesson() {
		return totalLesson;
	}
	public void setTotalLesson(int totalLesson) {
		this.totalLesson = totalLesson;
	}

}
