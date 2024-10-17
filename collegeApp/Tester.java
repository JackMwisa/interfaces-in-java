package CollegeApp;

public class Tester {
    public static void main(String[] args) {
        // Create objects of Student, Professor, and Assistant
        Student student = new Student("John", "Doe", 123, 2);
        Professor professor = new Professor("Alice", "Smith", 456, "Mathematics");
        Assistant assistant = new Assistant("Bob", "Brown", 789, true);

        // Call goToCollege for each object
        System.out.println("Student:");
        student.goToCollege();
        
        System.out.println("\nProfessor:");
        professor.goToCollege();
        
        System.out.println("\nAssistant:");
        assistant.goToCollege();

        // Call the implemented methods from the interfaces
        System.out.println("\nInterface Methods:");
        student.studyAtHome();           // LearningPerson method for Student
        professor.teachToOtherPeople();  // TeachingPerson method for Professor
        assistant.studyAtHome();         // LearningPerson method for Assistant
        assistant.teachToOtherPeople();  // TeachingPerson method for Assistant
    }
}
