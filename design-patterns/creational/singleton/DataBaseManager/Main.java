import java.sql.Connection;
import java.sql.SQLException;

class Main{
    public static void main(String[] args) {
        DataBaseConnectionManager dbManager = DataBaseConnectionManager.getInstance();
        try(Connection connection = dbManager.connectDB()){
            if(connection != null || !connection.isClosed()){
                System.out.println("Connectuon success");
            }
        }catch(SQLException e){
            System.out.println("Connection failed.");
        }

    }
}