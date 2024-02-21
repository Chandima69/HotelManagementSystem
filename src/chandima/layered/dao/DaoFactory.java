/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dao;

import chandima.layered.dao.custom.RoomDao;
import chandima.layered.dao.custom.impl.CategoryDaoImpl;
import chandima.layered.dao.custom.impl.FacilityDaoImpl;
import chandima.layered.dao.custom.impl.RoomCategoryFacilitiesDaoImpl;
import chandima.layered.dao.custom.impl.RoomDaoImpl;
import chandima.layered.dao.custom.impl.RoomPackageDaoImpl;
import chandima.layered.dao.custom.impl.UserDaoImpl;

/**
 *
 * @author Student
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoType type) {
        switch (type) {
            case USER:
                System.out.println("Returning UserDaoImpl");
                return new UserDaoImpl();
            case ROOM:
                System.out.println("Returning UserDaoImpl");
                return new RoomDaoImpl();
                case FACILITY:
                System.out.println("returning userServiceImpl");
                return new FacilityDaoImpl();
            case CATEGORY:
                System.out.println("returning userServiceImpl");
                return  new CategoryDaoImpl();
            case FACILITYCATEGORY:
                System.out.println("returning userServiceImpl");
                return new RoomCategoryFacilitiesDaoImpl();
                case PACKAGE:
                System.out.println("returning packageServiceImpl");
                return new RoomPackageDaoImpl();
            default:
                throw new AssertionError();
        }
    }

    public enum DaoType {
        USER,ROOM,FACILITY, CATEGORY, FACILITYCATEGORY,PACKAGE
    }
}
