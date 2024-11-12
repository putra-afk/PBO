package interfacetraining;

public class Undergraduated extends Student implements ICumlaude {
    public Undergraduated(String name) {
        super(name);
    }

    @Override
    public void graduate() {
        System.out.println("Undergraduate student graduated with thesis.");
    }

    @Override
    public void getHighGPA() {
        System.out.println("GPA is above 3.51");
    }
}
