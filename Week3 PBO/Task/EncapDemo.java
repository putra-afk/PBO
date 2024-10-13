package Task;

public class EncapDemo {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        int validatedAge = Math.max(age, 18);
        validatedAge = Math.min(validatedAge, 30);
        this.age = validatedAge;
    }
}