/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.controller;

import chandima.layered.dto.RoomDto;
import chandima.layered.service.ServiceFactory;
import chandima.layered.service.custom.RoomService;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Student
 */
public class RoomController {

    RoomService roomService=(RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);
    public List<RoomDto> getAllRooms() throws Exception {
        System.out.println("executing from controller");
        return roomService.getAll();
    }

    public RoomDto selectRoom(String roomID) throws Exception {
        return roomService.getRoom(roomID);
    }

    public String saveRoom(RoomDto roomDto) throws Exception {
        return roomService.savRoom(roomDto);
    }

    public String updateRoom(RoomDto roomDto) throws Exception {
        return roomService.updateRoom(roomDto);
    }

    public String deleteRoom(String roomID) throws Exception {
        return roomService.deleteRoom(roomID);
    }

    public List<RoomDto> getAllRoomsForDate(String date)throws Exception  {
        return roomService.getAllForDate(date);
    }
    
}
