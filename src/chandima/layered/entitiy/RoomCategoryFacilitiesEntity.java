/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.entitiy;

/**
 *
 * @author Student
 */
public class RoomCategoryFacilitiesEntity {
    private String categoryName;
    private String facilityID;

    public RoomCategoryFacilitiesEntity() {
    }

    public RoomCategoryFacilitiesEntity(String categoryName, String facilityID) {
        this.categoryName = categoryName;
        this.facilityID = facilityID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(String facilityID) {
        this.facilityID = facilityID;
    }

    @Override
    public String toString() {
        return "RoomCategoryFacilitiesEntity{" + "categoryName=" + categoryName + ", facilityID=" + facilityID + '}';
    }
    
    
}
