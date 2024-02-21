/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chandima.layered.service.custom;

import chandima.layered.dto.FacilityDto;
import chandima.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Student
 */
public interface FacilityService extends SuperService{
    public String savFacility(FacilityDto facilityDto)throws Exception;
    public String updateFacility(FacilityDto facilityDto)throws Exception;
    public String deleteFacility(String facilityID)throws Exception;
    public FacilityDto getFacility(String facilityID)throws Exception;
    List<FacilityDto>getAll()throws Exception;
}
