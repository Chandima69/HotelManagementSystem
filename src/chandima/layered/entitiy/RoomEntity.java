/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.entitiy;

/**
 *
 * @author Student
 */
public class RoomEntity {
    private String roomID;
    private String categoryName;
    private int noOfPersons;
    private String floorNumber;
    private double price;
    private boolean availablity;

    public RoomEntity() {
    }

    public RoomEntity(String roomID, String categoryName, int noOfPersons, String floorNumber, double price, boolean availablity) {
        this.roomID = roomID;
        this.categoryName = categoryName;
        this.noOfPersons = noOfPersons;
        this.floorNumber = floorNumber;
        this.price = price;
        this.availablity = availablity;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailablity() {
        return availablity;
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }

    @Override
    public String toString() {
        return "RoomEntity{" + "roomID=" + roomID + ", categoryName=" + categoryName + ", noOfPersons=" + noOfPersons + ", floorNumber=" + floorNumber + ", price=" + price + ", availablity=" + availablity + '}';
    }

    
}
