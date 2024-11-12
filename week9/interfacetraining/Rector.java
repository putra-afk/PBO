package interfacetraining;

public class Rector {
    public void giveCumlaudeCertificate(ICumlaude student) {
        System.out.println("I am the Rector, awarding a Cum Laude certificate.");
        System.out.println("Congratulations! Please introduce yourself...");
        
        student.graduate();
        student.getHighGPA();
        
        System.out.println("--------------------------------------------");
    }

    public void giveCertificateOfTopStudent(IAchievers student) {
        System.out.println("I am the Rector, awarding a Top Student certificate.");
        System.out.println("Congratulations! How did you achieve this honor?");
        
        student.winTheCompetition();
        student.publishTheJournal();
        
        System.out.println("--------------------------------------------");
    }
}