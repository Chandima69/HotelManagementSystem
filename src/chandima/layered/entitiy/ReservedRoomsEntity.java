/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.entitiy;

/**
 *
 * @author Student
 */
public class ReservedRoomsEntity {

    private String ReservationID;
    private String RoomID;

    public ReservedRoomsEntity() {
    }

    public ReservedRoomsEntity(String ReservationID, String RoomID) {
        this.ReservationID = ReservationID;
        this.RoomID = RoomID;
    }

    public String getReservationID() {
        return ReservationID;
    }

    public void setReservationID(String ReservationID) {
        this.ReservationID = ReservationID;
    }

    public String getRoomID() {
        return RoomID;
    }

    public void setRoomID(String RoomID) {
        this.RoomID = RoomID;
    }

    @Override
    public String toString() {
        return "ReservedRoomsEntity{" + "ReservationID=" + ReservationID + ", RoomID=" + RoomID + '}';
    }
    
    
}
