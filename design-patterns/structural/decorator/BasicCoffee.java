
public class BasicCoffee implements Coffee{

    @Override
    public int cost(){
        return 30;
    }

    @Override
    public String description(){
        return "Basic Coffee with";
    }
}