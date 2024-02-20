/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import librarian.*;


/**
 *
 * @author RCC764
 */

public class Validation {
    public static boolean check (String id, String contactNo, String email) throws FileNotFoundException
{
    int i; boolean valid = false;
    for (i=0; i< LibrarianCommonTasks.count; i++)
        {
            if (LibrarianCommonTasks.u[i].getId().equals(id))
                {   
                 JOptionPane.showMessageDialog(null, "there is same ID,please change it");
                  return  false;
                }
        }
    for (i=0; i<id.length(); i++){
     if (id.charAt(i)>'9' || id.charAt(i)<'0' )
                {
                 JOptionPane.showMessageDialog(null, "Incorrect ID");
                  return  false;
                }}
    
    for (i=0; i< contactNo.length(); i++)
        {                  
                 if (contactNo.charAt(i) > '9' || contactNo.charAt(i) < '0')
                    {              
                    JOptionPane.showMessageDialog(null, "Incorrect contact number");
                    return false;
                    }
        }
    
    for (i=0; i<email.length(); i++)
        {
                    valid = false;
                    if (email.charAt(i)=='@' && email.charAt((email.length())-1)=='m' && email.charAt((email.length())-2)== 'o' && email.charAt((email.length())-3) == 'c'&& email.charAt((email.length())-4)=='.')
                    {
                       valid = true;
                       return true;
                      
                    }
        }
    
    if (! valid) {
        JOptionPane.showMessageDialog(null, "Incorrect Email.");
         return false;
    }
    return true;


}
    }
