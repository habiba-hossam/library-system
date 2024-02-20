/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import librarian.*;
import librarymanagment.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import static librarian.LibrarianLogin.count;
import static librarian.LibrarianLogin.u;
import admin.*;
import librarian.*;

/**
 *
 * @author HP
 */
public class commonTasks {
    public static void writefile(String name) throws FileNotFoundException, IOException
{    
     File f= new File(name);
    PrintWriter p=new PrintWriter(f);
    for(int i=0;i<LibrarianLogin.count;i++)
    {
       p.println(LibrarianLogin.u[i].getId()+","+LibrarianLogin.u[i].getUserName()+","+LibrarianLogin.u[i].getPassword()+","+LibrarianLogin.u[i].getEmail()+","+LibrarianLogin.u[i].getAddress()+","+LibrarianLogin.u[i].getCity()+","+LibrarianLogin.u[i].getContactNo()); 
    }
    p.close();
    
}
    
}
