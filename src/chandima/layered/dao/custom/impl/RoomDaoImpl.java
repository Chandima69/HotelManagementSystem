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
import java.util.Date;

/**
 *
 * @author Student
 */
public class RoomDaoImpl implements RoomDao {

    @Override
    public boolean save(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("insert into room(RoomID,CategoryName,NoOfPersons,FloorNumber,Price,Availability) values(?,?,?,?,?,?)",
                t.getRoomID(),
                t.getCategoryName(),
                t.getNoOfPersons(),
                t.getFloorNumber(),
                t.getPrice(),
                t.isAvailablity()
        );
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("update room set CategoryName=?,NoOfPersons=?,FloorNumber=?,Price=?,Availability=? where RoomID=?",
                t.getCategoryName(),
                t.getNoOfPersons(),
                t.getFloorNumber(),
                t.getPrice(),
                t.isAvailablity(),
                t.getRoomID()
        );
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("delete from room where roomID=?", id);
    }

    @Override
    public RoomEntity get(String id) throws Exception {
        System.out.println("Value in DaoImpl id:" + id);
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM room WHERE RoomID=?", id);
        if (rs.next()) {
            return new RoomEntity(
                    rs.getString("RoomID"),
                    rs.getString("CategoryName"),
                    rs.getInt("NoOfPersons"),
                    rs.getString("FloorNumber"),
                    rs.getDouble("Price"),
                    rs.getBoolean("Availability")
            );
        } else {
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
                    rs.getDouble("Price"),
                    rs.getBoolean("Availability")
            ));
            System.out.println("RoomID: " + rs.getString("RoomID"));
        }
        System.out.println("Returning roomEntities from roomDaoImpl");
        return roomEntitys;
    }

    @Override
    public List<RoomEntity> getAllForDate(String date) throws Exception {
        ResultSet rs_all = CrudUtil.executeQuery("SELECT * FROM room");
        List<RoomEntity> roomEntitys = new ArrayList<>();

        while (rs_all.next()) {
            ResultSet rs_reserved = CrudUtil.executeQuery("SELECT * FROM Room WHERE RoomID IN ( SELECT RoomID FROM ReservedRooms WHERE ReservationID IN (SELECT ReservationID FROM ChakInDetails WHERE CheckInDate = ? ))", date);
            System.out.println("=" + rs_all.getString("RoomID"));//+", "+rs_reserved.getString("RoomID"));
            boolean reserved = false;
            while (rs_reserved.next()) {
                System.out.println(rs_reserved.getString("RoomID") + "=" + rs_all.getString("RoomID"));
                if (rs_all.getString("RoomID").equals(rs_reserved.getString("RoomID"))) {
                    reserved = true;
                }
            }
            if (reserved == false) {
                System.out.println("RoomID: " + rs_all.getString("RoomID"));
                roomEntitys.add(new RoomEntity(
                        rs_all.getString("RoomID"),
                        rs_all.getString("CategoryName"),
                        rs_all.getInt("NoOfPersons"),
                        rs_all.getString("FloorNumber"),
                        rs_all.getDouble("Price"),
                        rs_all.getBoolean("Availability")
                ));
            }
        }
        System.out.println("Returning roomEntities from roomDaoImpl");
        return roomEntitys;
    }

}
