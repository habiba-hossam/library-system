/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarian;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author RCC764
 */
public class IssuedCommonTasks {
     public static IssuedUser u[]=new IssuedUser[100];
    public static int count =0;
    
    public static void writeFile() throws FileNotFoundException, IOException
{    
     File f = new File("IssuedBooks.txt");
    PrintWriter p =new PrintWriter(f); 
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    for(int i=0;i<count-1;i++)
    {
       p.println(u[i].getCallNo()+","+u[i].getStudentId()
               +","+u[i].getStudentName()+","+u[i].getStudentContact()+","
               +u[i].getIssuedDate()+","+u[i].getReturnedDate()); 
    }
     p.println(u[count-1].getCallNo()+","+u[count-1].getStudentId()
               +","+u[count-1].getStudentName()+","+u[count-1].getStudentContact()+","
              +sdf.format(u[count-1].getCurrentDate())+","+u[count-1].getReturnedDate()); 
    p.close();
    
}
     public static void readFiles() throws FileNotFoundException //method read from file and store in the array USer
    {
         count =0;
        File f= new File("IssuedBooks.txt");
        Scanner s=new Scanner(f);
        
        while (s.hasNextLine())
        {
            String x=s.nextLine(); 
            String tokens[]=x.split(",");
            u[count]=new IssuedUser(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
            count++;
        }
    }
}


