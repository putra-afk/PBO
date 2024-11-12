package interfacetraining;

public class Program {
    public static void main(String[] args) {
        Rector rector = new Rector();

        // Instantiate Undergraduated and Postgraduated students
        Undergraduated undergradStudent = new Undergraduated("Alice");
        Postgraduated postgradStudent = new Postgraduated("Bob");

        // Awarding Cum Laude certificates
        rector.giveCumlaudeCertificate(undergradStudent);
        rector.giveCumlaudeCertificate(postgradStudent);

        // Awarding Top Student certificate to the Postgraduated student
        rector.giveCertificateOfTopStudent(postgradStudent);
    }
}