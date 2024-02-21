/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chandima.layered.dao.custom;

import chandima.layered.dao.CrudDao;
import chandima.layered.entitiy.RoomEntity;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Student
 */
public interface RoomDao extends CrudDao<RoomEntity, String> {

    public List<RoomEntity> getAllForDate(String date)throws Exception ;
    
}
