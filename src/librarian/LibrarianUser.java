/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarian;

/**
 *
 * @author RCC764
 */
public class LibrarianUser {
    private String userName;
    private String password;
    private String id;
    private String email;
    private String address;
    private String City;
    private String contactNo;

    public LibrarianUser(String id, String userName, String Password) {
        this.id = id;
        this.userName = userName;
        this.password = Password;
    }
    public LibrarianUser(String id, String userName, String password, String email, String address, String City, String contactN0) {
        this.id = id;   
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.City = City;
        this.contactNo=contactN0;
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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setPassword(String Password) {
        this.password = Password;
    }
    
    
}
