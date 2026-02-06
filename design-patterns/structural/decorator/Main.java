

public class Main{
    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(new SugarDecorator(coffee));
        //coffee = new SugarDecorator(coffee);

        System.out.println(coffee.description());
        System.out.println(coffee.cost());
    }
}