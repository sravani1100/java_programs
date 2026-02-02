

public class Main{

    public static void main(String[] args) {

        LoggerImpl logger1 = LoggerImpl.getInstance();
        LoggerImpl logger2 = LoggerImpl.getInstance();


        logger1.setLogFiles("app.log");

        logger1.log("INFO", "Application started");
        logger2.log("DEBUG", "This is a debug message");

        logger1.flush();
        System.out.println("Same reference? " +(logger1 == logger2 ));
        logger1.clear();
    }
}