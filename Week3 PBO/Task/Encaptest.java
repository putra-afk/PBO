package Task;

public class Encaptest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(16);
        encap.setAge(35);

        System.out.println("Name: " + encap.getName());
        System.out.println("Age: " + encap.getAge());
    }
}