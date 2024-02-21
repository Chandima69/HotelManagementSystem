/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dao.custom.impl;

import chandima.layered.dao.CrudUtil;
import chandima.layered.dao.custom.FacilityDao;
import chandima.layered.entitiy.FacilityEntity;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Student
 */
public class FacilityDaoImpl implements FacilityDao {

    @Override
    public boolean save(FacilityEntity t) throws Exception {
        return CrudUtil.executeUpdate("insert into Facilities(FacilityID,FacilityName,Description) values(?,?,?)",               
                t.getFacilityID(),
                t.getFacilityName(),
                t.getDescription()
                );
    }

    @Override
    public boolean update(FacilityEntity t) throws Exception {
        return CrudUtil.executeUpdate("update Facilities set FacilityName=?,Description=? where FacilityID=?",               
                t.getFacilityName(),
                t.getDescription(),
                t.getFacilityID()
                );
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("delete from Facilities where FacilityID=?", id);
    }

    @Override
    public FacilityEntity get(String id) throws Exception {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM Facilities where FacilityName=?", id);
        System.out.println("Starting FacilityEntities from FacilityDaoImpl");
        if (rs.next()) {
            System.out.println("Returning FacilityEntities from FacilityDaoImpl");
            return new FacilityEntity(
                    rs.getString("FacilityID"),
                    rs.getString("FacilityName"),
                    rs.getString("Description")
            );//System.out.println("RoomID: "+rs.getString("RoomID"));        
        } else {
            System.out.println("Returning NULL from FacilityDaoImpl");
            return null;
        }
    }

    @Override
    public List<FacilityEntity> getAll() throws Exception {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM Facilities");
        List<FacilityEntity> facilityEntitys = new ArrayList<>();

        while (rs.next()) {
            facilityEntitys.add(new FacilityEntity(
                    rs.getString("FacilityID"),
                    rs.getString("FacilityName"),
                    rs.getString("Description")
            ));//System.out.println("RoomID: "+rs.getString("RoomID"));
        }
        System.out.println("Returning FacilityEntities from FacilityDaoImpl");
        return facilityEntitys;
    }

}
