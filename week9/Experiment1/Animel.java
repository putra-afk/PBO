package Experiment1;

public abstract class Animel{

    private int age;

    protected Animel() {
        this.age = 0;
    }

    public void ageIncreased(){
        this.age += 1;
    }

    public abstract void move();
}