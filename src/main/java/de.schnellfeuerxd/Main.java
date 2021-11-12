package de.schnellfeuerxd;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MySQL.connect();

        MySQL.update("DELETE * FROM example");

        MySQL.disconnect();
    }
}
