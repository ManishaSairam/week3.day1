package org.student;

	import org.department.Department;

	public class Student extends Department {
		
		private void studentName(String name) {
			System.out.println("The name of the student is "+name);
		}
		
		private void studentDept() {
			System.out.println("The dept is computer science");
		}
		
		public void studentId() {
			System.out.println("My id 110634");
		}

		public static void main(String[] args) {
			
			Student details = new Student();
			
			details.collegeName("MADRAS UNIVERSITY");
			details.collegeCode();
			details.collegeRank();
			
			details.deptName("BSC COMPUTER SCIENCE");
			
			details.studentName("MANISHA SAIRAM");
			details.studentDept();
			details.studentId();

		}

	}

