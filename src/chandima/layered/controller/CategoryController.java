/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.controller;

import chandima.layered.dto.CategoryDto;
import chandima.layered.service.ServiceFactory;
import chandima.layered.service.custom.CategoryService;
import java.util.List;

/**
 *
 * @author Student
 */
public class CategoryController {
    CategoryService categoryService=(CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);
   
    public List<CategoryDto> getAllCategories() throws Exception {
        return categoryService.getAll();
    }

    public CategoryDto getCategory(String catName) throws Exception {
        return categoryService.getCategory(catName);
    }
    
    
}
