

class Employee{

    private String name;
    private String role;

    public Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setRole(String role){
        this.role = role;
    }

    public String getName(){
        return this.name;
    }
    public String getRole(){
        return this.role;
    }

    public Employee clone(){
        System.out.println("Employee clone()");
        return new Employee(this.name, this.role);
    }

    public void display(){
        System.out.println("name - " +this.name +"\n" +"role - " +this.role);
    }
}