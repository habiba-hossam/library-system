/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author RCC764
 */
public class StudentUser {
    private String userName;
    private String password;
    private String id;
    private String email;
    private String address;
    private String City;
    private String contactNo;
    
    public StudentUser( String id,String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public StudentUser(String id,String userName, String password,  String email, String address, String City, String contactNo) {
        this.userName = userName;
        this.password = password;
        this.id = id;
        this.email = email;
        this.address = address;
        this.City = City;
        this.contactNo = contactNo;
    }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
    
}
