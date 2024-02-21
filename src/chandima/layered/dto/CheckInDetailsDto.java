/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.dto;

/**
 *
 * @author Student
 */
public class CheckInDetailsDto {
    private String reservationID;
    private String checkInDate;
    private String checkInTime;
    private String checkOutDate;
    private String checkOutTime;
    private int noOfChildran;
    private int noOfAdults;

    public CheckInDetailsDto() {
    }

    public CheckInDetailsDto(String reservationID, String checkInDate, String checkInTime, String checkOutDate, String checkOutTime, int noOfChildran, int noOfAdults) {
        this.reservationID = reservationID;
        this.checkInDate = checkInDate;
        this.checkInTime = checkInTime;
        this.checkOutDate = checkOutDate;
        this.checkOutTime = checkOutTime;
        this.noOfChildran = noOfChildran;
        this.noOfAdults = noOfAdults;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getNoOfChildran() {
        return noOfChildran;
    }

    public void setNoOfChildran(int noOfChildran) {
        this.noOfChildran = noOfChildran;
    }

    public int getNoOfAdults() {
        return noOfAdults;
    }

    public void setNoOfAdults(int noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    @Override
    public String toString() {
        return "CheckInDetailsDto{" + "reservationID=" + reservationID + ", checkInDate=" + checkInDate + ", checkInTime=" + checkInTime + ", checkOutDate=" + checkOutDate + ", checkOutTime=" + checkOutTime + ", noOfChildran=" + noOfChildran + ", noOfAdults=" + noOfAdults + '}';
    }

    
}
