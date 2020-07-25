public class Testcourse{
  public static void main(String[] args) {
  	
  	Course stud1 = new Course("Introduction to Computer", 250.00);
  	
  	String[] students = stud1.getStudentNames();
  	
  	stud1.addStudent("Ali Said");
  	stud1.addStudent("Wong Ken");
  	stud1.addStudent("Peter Lim");
  	
  	System.out.println("Course Title : "+ stud1.getCourseTitle());
  	System.out.println("Fees per student : " + stud1.getFeesPerStudent());
  	System.out.printf("\n");
        
  	for(int i=0; i<stud1.getNoOfStudents();i++){
  		System.out.println(students[i]);
  	}
        
  	System.out.printf("\n");
  	System.out.printf("The total amount of the fees are %.2f\n\n", stud1.calcFeesCollected());
  	
  	Course stud2 = new Course(stud1.getCourseTitle(), stud1.getFeesPerStudent(), stud1.getNoOfStudents(), stud1.getCourseCount());
  	System.out.println(stud2);
  }
}
