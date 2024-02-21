/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.controller;

import chandima.layered.dto.RoomPackageDto;
import chandima.layered.service.ServiceFactory;
import chandima.layered.service.custom.RoomPackageService;
import java.util.List;

/**
 *
 * @author Student
 */
public class RoomPackageController {

    //CategoryService categoryService=(CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);
    RoomPackageService roomPackageService=(RoomPackageService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.PACKAGE);
    public List<RoomPackageDto> getAllPackages() throws Exception {
        return roomPackageService.getAll();
    }
    
}
