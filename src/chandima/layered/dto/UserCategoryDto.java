/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dto;

/**
 *
 * @author Student
 */
public class UserCategoryDto {
    private String CategoryName;
    private String description;

    public UserCategoryDto() {
    }

    public UserCategoryDto(String CategoryName, String description) {
        this.CategoryName = CategoryName;
        this.description = description;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserCategoryDto{" + "CategoryName=" + CategoryName + ", description=" + description + '}';
    }
    
    
}
