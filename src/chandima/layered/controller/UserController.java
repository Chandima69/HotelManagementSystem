/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.controller;

import chandima.layered.dto.UserDto;
import chandima.layered.service.ServiceFactory;
import chandima.layered.service.custom.UserService;

/**
 *
 * @author Student
 */
public class UserController {

    
    UserService userService=(UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);
    
    public UserDto selectUser(String uID) throws Exception {
        System.out.println("returning user service getuser Value");
        return userService.getUser(uID) ;
    }

    public String saveUser(UserDto userDto) throws Exception {
       return userService.saveUser(userDto);
    }
    
    

}
