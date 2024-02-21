/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dao.custom.impl;

import chandima.layered.dao.CrudUtil;
import chandima.layered.dao.custom.UserDao;
import chandima.layered.entitiy.UserEntity;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class UserDaoImpl implements UserDao {

    @Override
    public boolean save(UserEntity t) throws Exception {
        return CrudUtil.executeUpdate("Insert into user(UserID,UserPassword,Uname,UserAge,CategoryName) values(?,?,?,?,?)", 
                t.getUserID(),
                t.getUserPassword(),
                t.getUname(),
                t.getUserAge(),
                t.getCategoryName()
                );
    }

    @Override
    public boolean update(UserEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserEntity get(String id) throws Exception {
        System.out.println("result set:"+id);
        ResultSet rs = CrudUtil.executeQuery("select * from user where UserID=?", id);
        System.out.println(rs.toString());
        if (rs.next()) {           
                   return new UserEntity(
                    rs.getString("UserID"),
                    rs.getString("UserPassword"),
                    rs.getString("Uname"),
                    rs.getInt("UserAge"),
                    rs.getString("CategoryName")
            );
                     
        }
       else{
           System.out.println("Error in get in UserDaoImpl");
           return null;
       }
    }

    @Override
    public List<UserEntity> getAll() throws Exception {
        ResultSet rs = CrudUtil.executeQuery("select * from user");
        List<UserEntity> userEntitys = new ArrayList<>();

        while (rs.next()) {
            userEntitys.add(new UserEntity(
                    rs.getString("UserID"),
                    rs.getString("UserPassword"),
                    rs.getString("Uname"),
                    rs.getInt("UserAge"),
                    rs.getString("CategoryName")
            ));
        }

        return userEntitys;
    }

}
