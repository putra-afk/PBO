package interfacetraining;

public class Postgraduated extends Student implements ICumlaude, IAchievers {
    public Postgraduated(String name) {
        super(name);
    }

    @Override
    public void graduate() {
        System.out.println(this.name + " has completed their thesis/dissertation and graduated.");
    }

    @Override
    public void getHighGPA() {
        System.out.println("GPA is above 3.71");
    }

    @Override
    public void winTheCompetition() {
        System.out.println(this.name + " won the competition.");
    }

    public void publishTheJournal() {
        System.out.println(this.name + " published the journal.");
    }
}