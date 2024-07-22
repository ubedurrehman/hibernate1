package entity;

import java.sql.*;

public class FirstJDBC {


        private static Connection con;

        public static Connection getConnection () {
            try {


                if (con == null) {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "root");

                }else {
                    System.out.println("Failed to connect to database!");
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
            return con;
        }

}
