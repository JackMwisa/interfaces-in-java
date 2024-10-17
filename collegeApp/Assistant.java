package CollegeApp;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    // Implement the studyAtHome method from LearningPerson interface
    @Override
    public void studyAtHome() {
        System.out.println(name + " " + surname + " is studying at home and preparing for a PhD.");
    }

    // Implement the teachToOtherPeople method from TeachingPerson interface
    @Override
    public void teachToOtherPeople() {
        System.out.println(name + " " + surname + " is teaching while preparing to become a PhD.");
    }

    // Override goToCollege method to include PhD status
    @Override
    public void goToCollege() {
        super.goToCollege();
        System.out.println("Is Going To Be a PhD: " + (isGoingToBeAPhD ? "Yes" : "No"));
    }
}
