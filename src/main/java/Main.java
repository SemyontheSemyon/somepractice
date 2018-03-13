import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:test","sa","");
            Statement statement = connection.createStatement();
            statement.execute("CREATE  TABLE Person(id INTEGER, name VARCHAR )");
            statement.execute("INSERT INTO Person VALUES (0, 'Lily')");
            statement.execute("INSERT INTO Person VALUES (1, 'Robin')");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Person");
            while(resultSet.next()) System.out.println(resultSet.getString("name"));
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println(connection.isClosed());

        } catch (Exception e) {
            System.out.println("lul");
        }
    }
}
