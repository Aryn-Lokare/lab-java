// Requires MySQL Connector/J on the classpath and a MySQL database named java_practicals.
// Set DB_USER and DB_PASSWORD environment variables before running.
import java.sql.*;

class exp21 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_practicals";
        String user = System.getenv().getOrDefault("DB_USER", "root");
        String password = System.getenv().getOrDefault("DB_PASSWORD", "");
        String create = "CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY, name VARCHAR(80), course VARCHAR(50))";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {
            stmt.executeUpdate(create);
            stmt.executeUpdate("INSERT INTO students (id, name, course) VALUES (1, 'Asha', 'Computer Engineering') ON DUPLICATE KEY UPDATE name=VALUES(name)");
            try (PreparedStatement ps = con.prepareStatement("INSERT INTO students (id, name, course) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE name=VALUES(name), course=VALUES(course)")) {
                ps.setInt(1, 2); ps.setString(2, "Rahul"); ps.setString(3, "IT");
                ps.executeUpdate();
            }
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {
                while (rs.next()) System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("course"));
            }
            try (PreparedStatement ps = con.prepareStatement("UPDATE students SET course=? WHERE id=?")) {
                ps.setString(1, "Computer Engineering"); ps.setInt(2, 2);
                ps.executeUpdate();
            }
            try (PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE id=?")) {
                ps.setInt(1, 2); ps.executeUpdate();
            }
            System.out.println("CRUD operations completed.");
        } catch (SQLException e) {
            System.out.println("JDBC error: " + e.getMessage());
            System.out.println("Check MySQL service, database, credentials and Connector/J classpath.");
        }
    }
}
