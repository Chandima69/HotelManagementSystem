/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chandima.layered.service.custom;

import chandima.layered.dto.RoomPackageDto;
import chandima.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Student
 */
public interface RoomPackageService extends SuperService {
     public String saveRoomPackage(RoomPackageDto roomPackageDto)throws Exception;
    public String updateRoomPackage(RoomPackageDto roomPackageDto)throws Exception;
    public String deleteRoomPackage(String categoryID)throws Exception;
    public RoomPackageDto getRoomPackage(String categoryID)throws Exception;
    List<RoomPackageDto>getAll()throws Exception;
}
