import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:test","sa","");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
