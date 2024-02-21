/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.service.custom.impl;

import chandima.layered.dao.DaoFactory;
import chandima.layered.dao.custom.RoomPackageDao;
import chandima.layered.dto.RoomPackageDto;
import chandima.layered.entitiy.RoomPackageEntity;
import chandima.layered.service.custom.RoomPackageService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class RoomPackageServiceImpl implements RoomPackageService{

    private RoomPackageDao roomPackageDao = (RoomPackageDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.PACKAGE);
    @Override
    public String saveRoomPackage(RoomPackageDto roomPackageDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updateRoomPackage(RoomPackageDto roomPackageDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteRoomPackage(String categoryID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RoomPackageDto getRoomPackage(String categoryID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<RoomPackageDto> getAll() throws Exception {
        List<RoomPackageDto> roomPackageDtos = new ArrayList<>();
        List<RoomPackageEntity> roomPackageEntitys = roomPackageDao.getAll();
        System.out.println("get Entity in room Service ");
        for (RoomPackageEntity re : roomPackageEntitys) {
            System.out.println("inside for Entity in room Service ");
            roomPackageDtos.add(new RoomPackageDto(
                    re.getPackageName(),
                    re.getPackageDescription(),
                    re.getPriceRate()
            ));
            System.out.println("Entity Value in room Service IMPL: " + re.getPackageName());
        }
        System.out.println("Returning DTOs from Room Service Impl");
        return roomPackageDtos;
    }
    
}
