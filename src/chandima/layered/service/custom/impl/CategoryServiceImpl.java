/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.service.custom.impl;

import chandima.layered.dao.DaoFactory;
import chandima.layered.dao.custom.CategoryDao;
import chandima.layered.dto.CategoryDto;
import chandima.layered.entitiy.CategoryEntity;
import chandima.layered.service.custom.CategoryService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CATEGORY);

    @Override
    public String saveCategory(CategoryDto categoryDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String updateCategory(CategoryDto categoryDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteCategory(String categoryID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CategoryDto getCategory(String categoryID) throws Exception {
        CategoryEntity re=categoryDao.get(categoryID);
        System.out.println("get Entity in category in service impl ID: "+re.getCategoryName());
        return new CategoryDto(
                re.getCategoryName(),
                    re.getDescription()
        );
    }

    @Override
    public List<CategoryDto> getAll() throws Exception {
        
    List<CategoryDto> categoryDtos = new ArrayList<>();
        List<CategoryEntity> categoryEntities = categoryDao.getAll();
        System.out.println("get Entity in Category Service ");
        for (CategoryEntity re : categoryEntities) {
            System.out.println("inside for Entity in Category Service ");
            categoryDtos.add(new CategoryDto(
                    re.getCategoryName(),
                    re.getDescription()
            ));
            System.out.println("Entity Value in CategoryService IMPL: " + re.getCategoryName());
        }
        System.out.println("Returning DTOs from Category Service Impl");
        return categoryDtos;}
    
}
