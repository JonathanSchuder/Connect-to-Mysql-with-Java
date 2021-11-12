package de.schnellfeuerxd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL {

    // Used XAMPP as Database
    private static final String host ="localhost";
    private static final String port = "3306";
    private static final String database = "example";
    private static final String username = "root";
    private static final String password = "";

    private static Connection con;

    public static boolean isConnected() {
        return (con == null ? false : true);
    }

    public static Connection getConnection() {
        return con;
    }

    public static void connect() throws SQLException, ClassNotFoundException {

        if(!isConnected()) {
            try {

                /*
                Add this to your pom.xml

                <dependency>
                    <groupId>mysql</groupId>
                    <artifactId>mysql-connector-java</artifactId>
                    <version>5.1.39</version>
                </dependency>
                 */

                Class.forName("com.mysql.jdbc.Driver");

                con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
                System.out.println("[MySQL] Connected!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void disconnect() {
        if (isConnected()) {
            try {
                con.close();
                System.out.println("[MySQL] Disconnected!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    // Basic query function
    public static void update(String qry) {
        try {
            PreparedStatement ps = con.prepareStatement(qry);
            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
