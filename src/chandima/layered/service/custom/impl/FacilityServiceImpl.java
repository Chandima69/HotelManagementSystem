/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.service.custom.impl;

import chandima.layered.dao.DaoFactory;
import chandima.layered.dao.custom.FacilityDao;
import chandima.layered.dto.FacilityDto;
import chandima.layered.entitiy.FacilityEntity;
import chandima.layered.service.custom.FacilityService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class FacilityServiceImpl implements FacilityService {

    private FacilityDao facilityDao = (FacilityDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.FACILITY);

    @Override
    public String savFacility(FacilityDto facilityDto) throws Exception {
        FacilityEntity roomEntity = new FacilityEntity(
                facilityDto.getFacilityID(),
                facilityDto.getFacilityName(),
                facilityDto.getDescription()
        );
        if (facilityDao.save(roomEntity)) {
            return "Successfully Saved..!";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateFacility(FacilityDto facilityDto) throws Exception {
        FacilityEntity roomEntity = new FacilityEntity(
                facilityDto.getFacilityID(),
                facilityDto.getFacilityName(),
                facilityDto.getDescription()
        );
        if (facilityDao.update(roomEntity)) {
            return "Successfully Updated..!";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteFacility(String facilityID) throws Exception {
        if (facilityDao.delete(facilityID)) {
            return "Successfully Deleted..!";
        } else {
            return "Failed";
        }
    }

    @Override
    public FacilityDto getFacility(String facilityID) throws Exception {
        FacilityEntity facilityEntity = facilityDao.get(facilityID);
        System.out.println("get Entity in room facility ID: " + facilityEntity.getFacilityID());
        return new FacilityDto(
                facilityEntity.getFacilityID(),
                facilityEntity.getFacilityName(),
                facilityEntity.getDescription()
        );
    }

    @Override
    public List<FacilityDto> getAll() throws Exception {
        List<FacilityDto> facilityDtos = new ArrayList<>();
        List<FacilityEntity> facilityEntities = facilityDao.getAll();
        System.out.println("get Entity in Facility Service ");
        for (FacilityEntity re : facilityEntities) {
            System.out.println("inside for Entity in Facility Service ");
            facilityDtos.add(new FacilityDto(
                    re.getFacilityID(),
                    re.getFacilityName(),
                    re.getDescription()
            ));
            System.out.println("Entity Value in Facility Service IMPL: " + re.getFacilityID());
        }
        System.out.println("Returning DTOs from Facility Service Impl");
        return facilityDtos;
    }

}
