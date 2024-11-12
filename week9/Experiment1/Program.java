package Experiment1;

public class Program {
    public static void main(String[] args) {
        Cat asiaCat = new Cat();
        Fish dolphin = new Fish();

        People hammam = new People("Hammam");
        People ben = new People("Ben");

        hammam.setPet(asiaCat);
        ben.setPet(dolphin);

        hammam.takePetToWalk();
        ben.takePetToWalk();
    }
}