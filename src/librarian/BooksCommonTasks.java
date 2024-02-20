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
public class BooksCommonTasks {
      public static UserBooks u[]=new UserBooks [100];
    public static int count =0;
    public static void writeFile() throws FileNotFoundException, IOException
{    
     File f= new File("books.txt");
    PrintWriter p =new PrintWriter(f); 
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    for(int i=0;i<count-1;i++)
    {
       p.println(u[i].getCallNo()+","+u[i].getName()
               +","+u[i].getAuthor()+","+u[i].getPublisher()+","+u[i].getQuantity()
               +","+u[i].getIssued()+","+u[i].getDate()); 
    }
    p.println(u[count-1].getCallNo()+","+u[count-1].getName()
               +","+u[count-1].getAuthor()+","+u[count-1].getPublisher()+","+u[count-1].getQuantity()
               +","+u[count-1].getIssued()+","+sdf.format(u[count-1].getCurrentDate())); 
    p.close();
    
}
     public static void readFiles() throws FileNotFoundException 
    {
        count = 0;
        File f= new File("books.txt");
        Scanner s=new Scanner(f);
        
        while (s.hasNextLine())
        {
            String x=s.nextLine(); 
            String tokens[]=x.split(",");
            u[count]=new UserBooks(tokens[0],tokens[1],tokens[2],tokens[3],
                    tokens[4],tokens[5],tokens[6]);
            count++;
        }
    }
}
