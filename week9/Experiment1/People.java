package Experiment1;

public class People {
    
    private String name;
    private Animel pet;

    public People(String name) {
        this.name = name;
    }

    public void setPet(Animel pet) {
        this.pet = pet;
    }

    public void takePetToWalk() {
        System.out.println("My name is " + this.name);
        System.out.println("My pet move by: ");
        this.pet.move();
        System.out.println("------------------");
    }
}