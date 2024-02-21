/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chandima.layered.service.custom;

import chandima.layered.dto.UserDto;
import chandima.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Student
 */
public interface UserService extends SuperService {
    public String saveUser(UserDto userDto)throws Exception;
    public String updateUser(UserDto userDto)throws Exception;
    public String deleteUser(String userID)throws Exception;
    public UserDto getUser(String userID)throws Exception;
    List<UserDto>getAll()throws Exception;
}
