/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.entitiy;

/**
 *
 * @author Student
 */
public class UserCategoryEntity {

    private String CategoryName;
    private String description;

    public UserCategoryEntity() {
    }

    public UserCategoryEntity(String CategoryName, String description) {
        this.CategoryName = CategoryName;
        this.description = description;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserCategoryEntity{" + "CategoryName=" + CategoryName + ", description=" + description + '}';
    }

}
