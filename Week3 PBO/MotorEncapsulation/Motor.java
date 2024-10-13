package MotorEncapsulation;

public class Motor {
    
    public int speed=0;
    public boolean motorOn=false;

    public void startEngine(){
        motorOn=true;
    }
    public void turnOffEngine(){
        motorOn=false;
        speed=0;
    }

    public void increaseEngine(){
        if (motorOn==true){
            if (this.speed == 100) {
                System.out.println("Maximum speed of the motor is 100!");
            } else {
                this.speed += 5;
            }
        }
        else{
            System.out.println("Motor cycle off");
        }
    }

    public void statusPrint(){
        if (motorOn==true){
            System.out.println("Motor cycle On");
        }
        else{
            System.out.println("Motor cycle Off");
        }
        System.out.println("Speed: "+speed+"\n");
    }
}
