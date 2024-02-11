/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.service.custom.impl;

import chandima.layered.dao.DaoFactory;
import chandima.layered.dao.custom.RoomDao;
import chandima.layered.dto.RoomDto;
import chandima.layered.entitiy.RoomEntity;
import chandima.layered.service.custom.RoomService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class RoomServiceImpl implements RoomService {

    private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOM);

    @Override
    public String savRoom(RoomDto roomDto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(
                roomDto.getRoomID(),
                roomDto.getCategoryName(),
                roomDto.getNoOfPersons(),
                roomDto.getFloorNumber(),
                roomDto.getPrice()
        );
        if (roomDao.save(roomEntity)) {
            return "Successfully Saved..!";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateRoom(RoomDto roomDto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(
                roomDto.getRoomID(),
                roomDto.getCategoryName(),
                roomDto.getNoOfPersons(),
                roomDto.getFloorNumber(),
                roomDto.getPrice()
        );
        if (roomDao.update(roomEntity)) {
            return "Successfully Updated..!";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteRoom(String roomID) throws Exception {
        if (roomDao.delete(roomID)) {
            return "Successfully Deleted..!";
        } else {
            return "Failed";
        }
    }

    @Override
    public RoomDto getRoom(String roomID) throws Exception {
        RoomEntity re = roomDao.get(roomID);
        System.out.println("get Entity in room Service ID: " + re.getRoomID());
        return new RoomDto(
                re.getRoomID(),
                re.getCategoryName(),
                re.getNoOfPersons(),
                re.getFloorNumber(),
                re.getPrice()
        );
    }

    @Override
    public List<RoomDto> getAll() throws Exception {
        List<RoomDto> roomDtos = new ArrayList<>();
        List<RoomEntity> roomEntities = roomDao.getAll();
        System.out.println("get Entity in room Service ");
        for (RoomEntity re : roomEntities) {
            System.out.println("inside for Entity in room Service ");
            roomDtos.add(new RoomDto(
                    re.getRoomID(),
                    re.getCategoryName(),
                    re.getNoOfPersons(),
                    re.getFloorNumber(),
                    re.getPrice()
            ));
            System.out.println("Entity Value in room Service IMPL: " + re.getRoomID());
        }
        System.out.println("Returning DTOs from Room Service Impl");
        return roomDtos;
    }

}
