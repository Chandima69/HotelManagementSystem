/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dto;

/**
 *
 * @author Student
 */
public class RoomCategoryFacilitiesDto {
    private String categoryName;
    private String facilityID;

    public RoomCategoryFacilitiesDto() {
    }

    public RoomCategoryFacilitiesDto(String categoryName, String facilityID) {
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
        return "RoomCategoryFacilities{" + "categoryName=" + categoryName + ", facilityID=" + facilityID + '}';
    }
    
    
}
