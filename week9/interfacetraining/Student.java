package interfacetraining;

public class Student {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public void studyInCampus() {
        System.out.println(this.name + " is studying on campus.");
    }
}
