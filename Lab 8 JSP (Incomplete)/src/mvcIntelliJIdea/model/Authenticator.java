package mvcIntelliJIdea.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Authenticator {
    private Statement stmt;
    static int users=0;

    public Authenticator() {
        connect();
    }

    public void connect() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
            stmt = con.createStatement();
        } catch(Exception ex) {
            System.out.println("eroare la connect:"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    public String authenticate(String username, String password) {
        ResultSet rs;
        String result = "error";
        System.out.println(username+" "+password);
        try {
            rs = stmt.executeQuery("select * from users where user='"+username+"' and password='"+password+"'");
            if (rs.next()) {
                users++;
                System.out.println(users);
                if(users<=2)
                { result = "success";}
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}