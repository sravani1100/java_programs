

public class Prototype{

    private String name;
    private String role;

    public Prototype(String name, String role){
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

    public Prototype clone(){
        return new Prototype(this.name, this.role);
    }

}