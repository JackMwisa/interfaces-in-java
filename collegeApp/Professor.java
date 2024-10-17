package CollegeApp;

public class Professor extends CollegePerson implements TeachingPerson {
    private String teachingSubject;


    public Professor(String name, String surname, int collegeId, String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }

    // Implement the teachToOtherPeople method from TeachingPerson interface
    @Override
    public void teachToOtherPeople() {
        System.out.println(name + " " + surname + " is teaching " + teachingSubject + " to other people.");
    }

    // Override goToCollege method to include teaching subject
    @Override
    public void goToCollege() {
        super.goToCollege();
        System.out.println("Teaching Subject: " + teachingSubject);
    }
}
