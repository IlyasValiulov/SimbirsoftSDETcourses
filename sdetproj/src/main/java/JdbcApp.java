import java.sql.*;

public class JdbcApp {

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connect();
            createTableEx();
            insertEx();
            readEx();
            updateEx();
            readEx();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            disconnect();
        }
    }

    private static void connect() throws SQLException {
        System.out.println("Открывается соединение с БД");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/simbirsoftsdetcourses", "postgres", "");
        statement = connection.createStatement();
    }

    private static void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Соединение закрыто");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTableEx() throws SQLException {
        statement.executeUpdate("""
                CREATE TABLE IF NOT EXISTS person (
                 id SERIAL PRIMARY KEY,
                 name TEXT,
                 age INTEGER
                 );""");
    }

    private static void readEx() throws SQLException {
        try (ResultSet rs = statement.executeQuery("SELECT * FROM person;")) {
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " +
                        rs.getInt(3));
            }
        }
    }

    private static void insertEx() throws SQLException {
        statement.executeUpdate("INSERT INTO person (name,age) VALUES ('Ramil', 18);");
        statement.executeUpdate("INSERT INTO person (name,age) VALUES ('Garif', 19);");
        statement.executeUpdate("INSERT INTO person (name,age) VALUES ('Ilmir', 17);");
        statement.executeUpdate("INSERT INTO person (name,age) VALUES ('Ainur', 20);");
    }

    private static void updateEx() throws SQLException {
        String name = "Ainur";
        int age = 21;
        String sql = String.format("UPDATE person SET age = %d WHERE name = '%s'", age, name);
        statement.executeUpdate(sql);
    }
}
