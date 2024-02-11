/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dao.custom.impl;

import chandima.layered.dao.CrudUtil;
import chandima.layered.dao.custom.RoomDao;
import chandima.layered.entitiy.RoomEntity;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class RoomDaoImpl implements RoomDao {

    @Override
    public boolean save(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("insert into room(RoomID,CategoryName,NoOfPersons,FloorNumber,Price) values(?,?,?,?,?)", 
                t.getRoomID(),
                t.getCategoryName(),
                t.getNoOfPersons(),
                t.getFloorNumber(),
                t.getPrice()
                );
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("update room set CategoryName=?,NoOfPersons=?,FloorNumber=?,Price=?where RoomID=?", 
                t.getCategoryName(),
                t.getNoOfPersons(),
                t.getFloorNumber(),
                t.getPrice(),
                t.getRoomID()
                );
    }

    @Override
    public boolean delete(String id) throws Exception {
       return CrudUtil.executeUpdate("delete from room where roomID=?", id);
    }

    @Override
    public RoomEntity get(String id) throws Exception {
        System.out.println("Value in DaoImpl id:"+id);
        ResultSet rs=CrudUtil.executeQuery("SELECT * FROM room WHERE RoomID=?", id);
        if(rs.next()){            
             return new RoomEntity(
                    rs.getString("RoomID"),
                    rs.getString("CategoryName"),
                    rs.getInt("NoOfPersons"),
                    rs.getString("FloorNumber"),
                    rs.getDouble("Price")
            );
        }
        else{
            return null;
        }
       
    }

    @Override
    public List<RoomEntity> getAll() throws Exception {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM room");
        List<RoomEntity> roomEntitys = new ArrayList<>();
        
        while (rs.next()) {
            roomEntitys.add(new RoomEntity(
                    rs.getString("RoomID"),
                    rs.getString("CategoryName"),
                    rs.getInt("NoOfPersons"),
                    rs.getString("FloorNumber"),
                    rs.getDouble("Price")
            ));System.out.println("RoomID: "+rs.getString("RoomID"));
        }
        System.out.println("Returning roomEntities from roomDaoImpl");
        return roomEntitys;
    }

}
