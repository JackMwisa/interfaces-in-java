package CollegeApp;

public class Student extends CollegePerson implements LearningPerson {
    private int academicYear;

    
    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    // Implement the studyAtHome method from LearningPerson interface
    @Override
    public void studyAtHome() {
        System.out.println(name + " " + surname + " is studying at home.");
    }

    // Override goToCollege method to include academic year
    @Override
    public void goToCollege() {
        super.goToCollege();
        System.out.println("Academic Year: " + academicYear);
    }
}
