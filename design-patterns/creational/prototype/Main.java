

public class Main{

    public static void main(String[] args) {
        Prototype prototype = new Prototype("Sravani", "Dev");

        System.out.println(prototype.getName() +" " +prototype.getRole());

        Prototype cloned = prototype.clone();
        cloned.setName("Ashu");
        System.out.println(cloned.getName() +" " +cloned.getRole());

    }

}