public class Course{
	private String courseTitle;
	private double feesPerStudent;
	private int noOfStudents = 0;
	private String []studentNames = new String [100];
	private static int courseCount = 0;
	
	public Course(String ct, double fps, int nos, int cc){
		this.courseTitle = ct;
		this.feesPerStudent = fps;
		this.noOfStudents = nos;
		this.courseCount = cc;
	}
        
	public Course(String ctitle, double fees){
                courseTitle = ctitle;
                feesPerStudent = fees;
                courseCount++;
	}
	
        public double calcFeesCollected(){
            return feesPerStudent* noOfStudents;
        }
        
	public void addStudent(String studname){
	 	studentNames[noOfStudents] = studname;
	 	noOfStudents++;
        }

        public String getCourseTitle() {
            return courseTitle;
        }

        public void setCourseTitle(String title) {
            this.courseTitle = title;
        }

        public double getFeesPerStudent() {
            return feesPerStudent;
        }

        public void setFeesPerStudent(double feesPerStudent) {
            this.feesPerStudent = feesPerStudent;
        }

        public int getNoOfStudents() {
            return noOfStudents;
        }

        public void setNoOfStudents(int noOfStudents) {
            this.noOfStudents = noOfStudents;
        }

        public String[] getStudentNames() {
            return studentNames;
        }

        public void setStudentNames(String[] studentNames) {
            this.studentNames = studentNames;
        }

        public static int getCourseCount() {
            return courseCount;
        }

        public static void setCourseCount(int count) {
            courseCount = courseCount + count;
        }
        
	public String toString(){
                return String.format("Course : %s \nFees Collected for each student : %.2f\nNumber of Student : %d\nThis Course have : %d", courseTitle, feesPerStudent, noOfStudents,courseCount);
	}

}
