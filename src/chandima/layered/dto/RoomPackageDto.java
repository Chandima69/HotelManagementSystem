/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dto;

/**
 *
 * @author Student
 */
public class RoomPackageDto {
    private String packageName;
    private String packageDescription;
    private String priceRate;

    public RoomPackageDto() {
    }

    public RoomPackageDto(String packageName, String packageDescription, String priceRate) {
        this.packageName = packageName;
        this.packageDescription = packageDescription;
        this.priceRate = priceRate;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageDescription() {
        return packageDescription;
    }

    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    public String getPriceRate() {
        return priceRate;
    }

    public void setPriceRate(String priceRate) {
        this.priceRate = priceRate;
    }

    @Override
    public String toString() {
        return "RoomPackageDto{" + "packageName=" + packageName + ", packageDescription=" + packageDescription + ", priceRate=" + priceRate + '}';
    }
    
    
}
