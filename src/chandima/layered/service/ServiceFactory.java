/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.service;

import chandima.layered.dao.custom.FacilityDao;
import chandima.layered.service.custom.RoomPackageService;
import chandima.layered.service.custom.impl.CategoryServiceImpl;
import chandima.layered.service.custom.impl.FacilityServiceImpl;
import chandima.layered.service.custom.impl.RoomCategoryFacilitiesServiceImpl;
import chandima.layered.service.custom.impl.RoomPackageServiceImpl;
import chandima.layered.service.custom.impl.RoomServiceImpl;
import chandima.layered.service.custom.impl.UserServiceImpl;

/**
 *
 * @author Student
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public enum ServiceType {
        USER, ROOM, FACILITY, CATEGORY, FACILITYCATEGORY, PACKAGE
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case USER:
                System.out.println("returning userServiceImpl");
                return new UserServiceImpl();
            case ROOM:
                System.out.println("returning userServiceImpl");
                return new RoomServiceImpl();
            case FACILITY:
                System.out.println("returning userServiceImpl");
                return new FacilityServiceImpl();
            case CATEGORY:
                System.out.println("returning userServiceImpl");
                return new CategoryServiceImpl();
            case FACILITYCATEGORY:
                System.out.println("returning userServiceImpl");
                return new RoomCategoryFacilitiesServiceImpl();
            case PACKAGE:
                System.out.println("returning userServiceImpl");
                return new RoomPackageServiceImpl();
            default:
                throw new AssertionError();
        }
    }
}
