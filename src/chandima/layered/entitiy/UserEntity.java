/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chandima.layered.entitiy;

/**
 *
 * @author Student
 */
public class UserEntity {
    private String UserID  ;
    private String UserPassword ;
    private String Uname ;
    private int UserAge ;
    private String CategoryName ;

    public UserEntity() {
    }

    public UserEntity(String UserID, String UserPassword, String Uname, int UserAge, String CategoryName) {
        this.UserID = UserID;
        this.UserPassword = UserPassword;
        this.Uname = Uname;
        this.UserAge = UserAge;
        this.CategoryName = CategoryName;
    }

    public String getUserID() {
        return UserID;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public String getUname() {
        return Uname;
    }

    public int getUserAge() {
        return UserAge;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public void setUserAge(int UserAge) {
        this.UserAge = UserAge;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    @Override
    public String toString() {
        return "UserEntity{" + "UserID=" + UserID + ", UserPassword=" + UserPassword + ", Uname=" + Uname + ", UserAge=" + UserAge + ", CategoryName=" + CategoryName + '}';
    }
    
    
}
