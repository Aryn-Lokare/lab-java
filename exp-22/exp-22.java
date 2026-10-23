// Requires MySQL Connector/J. Create the database java_practicals first.
// Stored procedure to create in MySQL:
// DELIMITER $$
// CREATE PROCEDURE count_students(OUT total INT)
// BEGIN SELECT COUNT(*) INTO total FROM students; END$$
// DELIMITER ;
import java.sql.*;

class exp22 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_practicals";
        String user = System.getenv().getOrDefault("DB_USER", "root");
        String password = System.getenv().getOrDefault("DB_PASSWORD", "");
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            con.setAutoCommit(false);
            try (PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO students (id, name, course) VALUES (?, ?, ?)")) {
                ps.setInt(1, 100); ps.setString(2, "Transaction Demo"); ps.setString(3, "Java");
                ps.executeUpdate();
                con.commit();
                System.out.println("Transaction committed.");
            } catch (SQLException e) {
                con.rollback();
                System.out.println("Transaction rolled back: " + e.getMessage());
            } finally {
                con.setAutoCommit(true);
            }

            try (CallableStatement cs = con.prepareCall("{CALL count_students(?)}")) {
                cs.registerOutParameter(1, Types.INTEGER);
                cs.execute();
                System.out.println("Student count: " + cs.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println("JDBC error: " + e.getMessage());
            System.out.println("Ensure students table and count_students procedure exist.");
        }
    }
}
