/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chandima.layered.service.custom;

import chandima.layered.dto.RoomDto;
import chandima.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Student
 */
public interface RoomService extends SuperService {
    public String savRoom(RoomDto roomDto)throws Exception;
    public String updateRoom(RoomDto roomDto)throws Exception;
    public String deleteRoom(String roomID)throws Exception;
    public RoomDto getRoom(String roomID)throws Exception;
    List<RoomDto>getAll()throws Exception;
}
