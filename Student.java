package assignment.day;

public class Student {
	public void getStudentInfo() {
		System.out.println("hi,good moring");
	}
	
	void getStudentInfo(int id) {
		
	}
	
	 protected void getStudentInfo(int id, String name) {
		
	}
	
	 public void getStudentInfo(String email, int phoneNumber) {
		
	}

	public static void main(String[] args) {
		
		Student mom = new Student();
		mom.getStudentInfo();
		mom.getStudentInfo(1234567);
		mom.getStudentInfo(12345, "MANISHA");
		mom.getStudentInfo("aaa@gmail.com", 755028072);
		}

}


