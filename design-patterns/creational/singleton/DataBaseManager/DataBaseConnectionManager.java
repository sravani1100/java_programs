import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DataBaseConnectionManager{

    private static DataBaseConnectionManager instance = null;

    public DataBaseConnectionManager(){}

    public Connection connectDB() throws SQLException{
        Connection connection = DriverManager.getConnetion("jdbc:mysql://localhost:3306/Employee",
                                                            "employee",
                                                            "java@123");
        System.out.println("connection  created");
        return connection;
    }

    public static DataBaseConnectionManager getInstance(){
        if(instance == null){
            synchronized (DataBaseConnectionManager.class){
                if(instance == null){
                    instance = new DataBaseConnectionManager();
                    System.out.println("Instance created");
                }
            }
        }
        return instance;
    }
}