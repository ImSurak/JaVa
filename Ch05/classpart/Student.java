package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentIM = new Student();
		studentIM.studentName = "ÀÓ¼ö¶ô";
		
		System.out.println(studentIM.studentName);
		System.out.println(studentIM.getStudentName());
		
	}

}
