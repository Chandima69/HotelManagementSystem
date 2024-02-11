/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.entitiy;

/**
 *
 * @author Student
 */
public class FacilityEntity {

    private String facilityID;
    private String facilityName;
    private String description;

    public FacilityEntity() {
    }

    public FacilityEntity(String facilityID, String facilityName, String description) {
        this.facilityID = facilityID;
        this.facilityName = facilityName;
        this.description = description;
    }

    public String getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(String facilityID) {
        this.facilityID = facilityID;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FacilityEntity{" + "facilityID=" + facilityID + ", facilityName=" + facilityName + ", description=" + description + '}';
    }
    
    
}
