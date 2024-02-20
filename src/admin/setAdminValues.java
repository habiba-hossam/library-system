/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

/**
 *
 * @author HP
 */
public class setAdminValues {
    private String adminName;
    private String password;
    private String id;
    
public setAdminValues( String id, String adminName, String password) {
        this.adminName = adminName;
        this.password = password;
        this.id = id;
    }
 public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }}

