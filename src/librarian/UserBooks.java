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
public class UserBooks {
    private String callNo;
    private String name;
    private String author;
    private String publisher;
    private String quantity;
    private String issued;
    private String date;
    private Date currentDate;
    
    public UserBooks(String callNo, String name, String author, String publisher,String quantity,String issued) {
        
        this.callNo = callNo;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.issued= issued;
        this.currentDate=new Date(System.currentTimeMillis());
    }

    public UserBooks( String callNo, String name, String author, String publisher, String quantity, String issued, String date) {
       
        this.callNo = callNo;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.issued = issued;
        this.date = date;
    }

    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
    
    
    
}
