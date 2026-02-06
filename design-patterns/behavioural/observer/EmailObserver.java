
public class EmailObserver implements Observer{

    public void update(String message){
        System.out.println("Email received : " +message);
    }
}