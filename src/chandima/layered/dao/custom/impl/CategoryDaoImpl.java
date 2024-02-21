/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dao.custom.impl;

import chandima.layered.dao.CrudUtil;
import chandima.layered.dao.custom.CategoryDao;
import chandima.layered.entitiy.CategoryEntity;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Student
 */
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public boolean save(CategoryEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        System.out.println("Value in get(id) DaoImpl id:"+id);
        ResultSet rs=CrudUtil.executeQuery("SELECT * FROM roomCategories WHERE CategoryName=?", id);
        if(rs.next()){            
             return new CategoryEntity(
                    rs.getString("CategoryName"),
                    rs.getString("Description")
            );
        }
        else{
            return null;
        }
    }

    @Override
    public List<CategoryEntity> getAll() throws Exception {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM roomCategories");
        List<CategoryEntity> categoryEntitys = new ArrayList<>();

        while (rs.next()) {
            System.out.println("Adding data to entity in DaoImpl");
            categoryEntitys.add(new CategoryEntity(
                    rs.getString("CategoryName"),
                    rs.getString("Description")
            ));//System.out.println("RoomID: "+rs.getString("RoomID"));
        }
        System.out.println("Returning CategoryEntities from CategoryDaoImpl");
        return categoryEntitys;
    }
    
}
