/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dao;

import chandima.layered.db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Student
 */
public class CrudUtil {

    private static PreparedStatement getPreparedStatement(String sql, Object... args) throws Exception {

        try {
            Connection connection = DBConnection.getInstance().getConnection();
            System.out.println("Database Connected");
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            System.out.println("Statement Prepared.");
            if (args != null) {
                for (int i = 0; i < args.length; i++) {
                    preparedStatement.setObject(i + 1, args[i]);
                   // System.out.println("srgs is not-null loop:"+i);
                }
            } else {
                System.out.println("srgs is null");
            }
           System.out.println("Prepared Statement:" + preparedStatement.toString()+"End");
            return preparedStatement;
        } catch (Exception e) {
            System.err.println("Error:" + e);
            return  null;
        }
    }

    public static boolean executeUpdate(String sql, Object... args) throws Exception {
        return getPreparedStatement(sql, args).executeUpdate() > 0;
    }

    public static ResultSet executeQuery(String sql, Object... args) throws Exception {
        System.out.println("SQL" + sql + ", arg:" + args.toString());
        ResultSet rs = getPreparedStatement(sql, args).executeQuery();
        if(rs!=null){
        System.out.println("Returning Execute Query: "+rs.toString());
        return rs;
        }
        else{
             System.out.println("Returning Execute Query: null");
            return null;
        }
    }
}
