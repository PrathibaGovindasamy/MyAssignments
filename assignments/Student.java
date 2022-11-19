package week3.day1.assignments;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Prathiba");
	}
	public void studentDept() {
		System.out.println("BCA");
	}
	public void studentId() {
		System.out.println("206");
	}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}
}

