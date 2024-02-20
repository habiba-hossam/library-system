/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarian;

import java.util.Date;

/**
 *
 * @author RCC764
 */
public class IssuedUser {
    
    private String callNo;
    private String studentId;
    private String studentName;
    private String studentContact;
    private String issuedDate;
    private Date currentDate;
    private String returnedDate;
    //private Date retDate;

    public IssuedUser( String callNo, String studentId, String studentName, String studentContact, String returnedDate) {
       
        this.callNo = callNo;
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentContact = studentContact;
        this.returnedDate = returnedDate;
        this.currentDate=new Date(System.currentTimeMillis());
    }

    public IssuedUser(String callNo, String studentId, String studentName,String studentContact,
            String issuedDate ,String returnedDate) {
       
        this.callNo = callNo;
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentContact = studentContact;
        this.issuedDate = issuedDate;
        this.returnedDate=returnedDate;
    }

  

    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssueddate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(String returnedDate) {
        this.returnedDate = returnedDate;
    }


   

   
    
}
