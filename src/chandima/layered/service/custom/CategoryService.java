/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chandima.layered.service.custom;

import chandima.layered.dto.CategoryDto;
import chandima.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Student
 */
public interface CategoryService extends SuperService {
    public String saveCategory(CategoryDto categoryDto)throws Exception;
    public String updateCategory(CategoryDto categoryDto)throws Exception;
    public String deleteCategory(String categoryID)throws Exception;
    public CategoryDto getCategory(String categoryID)throws Exception;
    List<CategoryDto>getAll()throws Exception;
}
