
public class Main{
    public static void main(String[] args) {
        Registry registryObj = new Registry();

        registryObj.register("Dev", new Employee("Sravani", "Dev"));
        registryObj.register("Test", new Employee("Asvitha", "Test"));

        Employee emp = registryObj.getClone("Dev");
        emp.setName("Seetha");

        System.out.println("name - " +emp.getName() +"\n" +"role - "+emp.getRole());

    }
}
