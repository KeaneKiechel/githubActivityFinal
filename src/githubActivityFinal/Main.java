package githubActivityFinal;

public class Main {

	public static void main(String[] args) {
		 
		Teacher t1 = new Teacher();
		Student s1 = new Student();
		
		s1.name = "Al-Raffy Sarip";
		s1.idNumber = "2020-0509";
		
		t1.name = "Mohammad Yassin L. Macarambon";
		t1.idNumber = "2020-4023";
		
		System.out.println("Student's Name: " + s1.idNumber + " " + s1.name);
		System.out.println("Teacher's Name: " + t1.idNumber + " " + t1.name);

	}

}
