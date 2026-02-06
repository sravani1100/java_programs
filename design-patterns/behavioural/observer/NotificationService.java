import java.util.List;
import java.util.ArrayList;

public class NotificationService implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String message;

    public void addObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void setMessage(String message){
        this.message = message;
        notifyObserver();
    }
    public void notifyObserver(){
        for(Observer o : observers){
            o.update(message);
        }
    }
}