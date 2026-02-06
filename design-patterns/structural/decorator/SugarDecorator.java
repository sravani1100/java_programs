
class SugarDecorator extends CoffeeDecorator{


    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    public int cost(){
        return coffee.cost() + 20;
    }

    public String description(){
        return coffee.description() + " sugar,";
    }
}