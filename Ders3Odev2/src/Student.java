public class Student extends User {
	int numberOfCoursesAttended;//katýldýðý kurs sayýsý
	int numberOfActivitiesCompleted;//Tamamlanan etkinlik sayýsý(yüzdesi)
	
	public Student() {
		super();
	}
	public Student(int id, String firstName, String lastName, int age, String email, String password,
			int numberOfCoursesAttended, int numberOfActivitiesCompleted) {
		super(id, firstName, lastName, age, email, password);
		this.numberOfCoursesAttended = numberOfCoursesAttended;
		this.numberOfActivitiesCompleted = numberOfActivitiesCompleted;
	}
	//getters
	public int getNumberOfCoursesAttended() {
		return numberOfCoursesAttended;
	}

	public int getNumberOfActivitiesCompleted() {
		return numberOfActivitiesCompleted;
	}
	
}
