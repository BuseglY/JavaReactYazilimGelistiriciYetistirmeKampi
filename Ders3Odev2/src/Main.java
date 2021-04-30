
public class Main {

	public static void main(String[] args) {
		User user=new User();
		Instructor instructor=new Instructor();
		Student student=new Student();
		
		student.setFirstName("Buse");
		student.setLastName("Yılmaz");
		student.setAge(23);
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getAge());
		
		StudentManager studentManager=new StudentManager();
		studentManager.logedIn();
		studentManager.takeAttendance();
		studentManager.exitDone();
		

	}

}
