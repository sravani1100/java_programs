
public class Facade{

    private DVDPlayer player = new DVDPlayer();
    private Projector projector = new Projector();
    private Sound sound = new Sound();

    public void onHomeTheatre(){
        player.on();
        projector.on();
        sound.on();
    }
}