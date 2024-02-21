/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dto;

/**
 *
 * @author Student
 */
public class RoomReservationDto {
    private String reservationID;
    private String userID;
    private String reservationDate;
    private String raservationTime;
    private boolean reservationState;
    private String packageName;
    private String categoryName;

    public RoomReservationDto() {
    }

    public RoomReservationDto(String reservationID, String userID, String reservationDate, String raservationTime, boolean reservationState, String packageName, String categoryName) {
        this.reservationID = reservationID;
        this.userID = userID;
        this.reservationDate = reservationDate;
        this.raservationTime = raservationTime;
        this.reservationState = reservationState;
        this.packageName = packageName;
        this.categoryName = categoryName;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getRaservationTime() {
        return raservationTime;
    }

    public void setRaservationTime(String raservationTime) {
        this.raservationTime = raservationTime;
    }

    public boolean isReservationState() {
        return reservationState;
    }

    public void setReservationState(boolean reservationState) {
        this.reservationState = reservationState;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "RoomReservationDto{" + "reservationID=" + reservationID + ", userID=" + userID + ", reservationDate=" + reservationDate + ", raservationTime=" + raservationTime + ", reservationState=" + reservationState + ", packageName=" + packageName + ", categoryName=" + categoryName + '}';
    }
    
    
}
