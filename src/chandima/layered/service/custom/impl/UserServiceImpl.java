/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.service.custom.impl;

import chandima.layered.dao.DaoFactory;
import chandima.layered.dao.custom.UserDao;
import chandima.layered.dto.UserDto;
import chandima.layered.entitiy.UserEntity;
import chandima.layered.service.custom.UserService;
import java.util.List;

/**
 *
 * @author Student
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao=(UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.USER);
    @Override
    public String saveUser(UserDto userDto) throws Exception {
        UserEntity userEntity=new  UserEntity(
        userDto.getUserID(),
                userDto.getUserPassword(),
                userDto.getUname(),
                userDto.getUserAge(),
                userDto.getCategoryName()
        );
        if(userDao.save(userEntity)){
            return "Successfully Saved..!";
        }
        else{
            return "Failed";
        }
    }

    @Override
    public String updateUser(UserDto userDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteUser(String userID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserDto getUser(String userID) throws Exception {
        UserEntity e= userDao.get(userID);
        if(e!=null){
        UserDto userDto = new UserDto(
                e.getUserID(),
                e.getUserPassword(),
                e.getUname(),
                e.getUserAge(),
                e.getCategoryName()
        );
            System.out.println("returnig userDTO");
        return userDto;
        }else{
            System.out.println("returnig null for userDTO");
            return null;
        }
    }

    @Override
    public List<UserDto> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
