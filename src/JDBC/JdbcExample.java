package JDBC;
    import java.sql.*;

    public class JdbcExample {
        public static void main(String[] args) {
            // JDBC driver and database URL
            String jdbcDriver = "com.mysql.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3306/cape_codd";

            // Database credentials
            String username = "root";
            String password = "michaeljosh7";

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try {
                // Register the JDBC driver
                Class.forName(jdbcDriver);

                // Open a connection
                connection = DriverManager.getConnection(databaseUrl, username, password);

                // Execute a query
                String query = "SELECT * FROM buyer";
                statement = connection.createStatement();
                resultSet = statement.executeQuery(query);

                // Process the result set
                while (resultSet.next()) {
//                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("BuyerName");
                    String department = resultSet.getString("Department");
                    String Supervisor = resultSet.getString("Supervisor");
//                    double salary = resultSet.getDouble("salary");

                    System.out.println(" Name: " + name + ", Department: " + department + ", Supervisor: "+ Supervisor);
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            } finally {
                // Close all resources
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }