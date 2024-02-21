/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dao.custom.impl;

import chandima.layered.dao.CrudUtil;
import chandima.layered.dao.custom.RoomPackageDao;
import chandima.layered.entitiy.RoomPackageEntity;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class RoomPackageDaoImpl implements RoomPackageDao{

    @Override
    public boolean save(RoomPackageEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(RoomPackageEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RoomPackageEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<RoomPackageEntity> getAll() throws Exception {
         ResultSet rs = CrudUtil.executeQuery("SELECT * FROM roomPackage");
        List<RoomPackageEntity> roomPackageEntitys = new ArrayList<>();
        
        while (rs.next()) {
            roomPackageEntitys.add(new RoomPackageEntity(
                    rs.getString("PackageName"),
                    rs.getString("PackageDescription"),
                    rs.getString("PriceRate")
            ));System.out.println("Package Name: "+rs.getString("PackageName"));
        }
        System.out.println("Returning roomEntities from roomDaoImpl");
        return roomPackageEntitys;
    }
    
}
