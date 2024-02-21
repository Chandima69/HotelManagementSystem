/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.controller;

import chandima.layered.dto.FacilityDto;
import chandima.layered.service.ServiceFactory;
import chandima.layered.service.custom.FacilityService;
import java.util.List;

/**
 *
 * @author Student
 */
public class FacilityController {

    FacilityService facilityService=(FacilityService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.FACILITY);

    public List<FacilityDto> getAllFacilities() throws Exception {
        return facilityService.getAll();
    }

    public FacilityDto getFacility(String facilityID) throws Exception {
        return facilityService.getFacility(facilityID);
    }

    public String saveFacility(FacilityDto facilityDto) throws Exception {
        return facilityService.savFacility(facilityDto);
    }

    public String updateFacility(FacilityDto facilityDto) throws Exception {
        return facilityService.updateFacility(facilityDto);
    }

    public String deleteFacility(String facilityID) throws Exception {
        return facilityService.deleteFacility(facilityID);
    }

    
   
    
}
