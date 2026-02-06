
public class SMSObserver implements Observer{

    public void update(String message){
        System.out.println("SMS recieved : " +message);
    }
}