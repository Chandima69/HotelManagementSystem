/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chandima.layered.service.custom;

import chandima.layered.dto.RoomCategoryFacilitiesDto;
import chandima.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Student
 */
public interface RoomCategoryFacilitiesService extends SuperService {
    public String savCategoryFacilities(RoomCategoryFacilitiesDto roomCategoryFacilitiesDto)throws Exception;
    public String updateCategoryFacilities(RoomCategoryFacilitiesDto roomCategoryFacilitiesDto)throws Exception;
    public String deleteCategoryFacilities(String roomCategoryFacilitiesID)throws Exception;
    public RoomCategoryFacilitiesDto getCategoryFacilities(String roomCategoryFacilitiesID)throws Exception;
    List<RoomCategoryFacilitiesDto>getAll()throws Exception;
}
