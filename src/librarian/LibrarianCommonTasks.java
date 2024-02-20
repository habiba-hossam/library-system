/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarian;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class LibrarianCommonTasks {
    public static LibrarianUser u[]=new LibrarianUser [100];
    public static int count;
    public static void writeFile() throws FileNotFoundException, IOException
{    
    File f= new File("librarian.txt");
    PrintWriter p = new PrintWriter(f);
    int i;
    for( i=0;i<count;i++)
    {
       p.println(u[i].getId()+","+u[i].getUserName()+","+u[i].getPassword()+","
               +u[i].getEmail()+","+u[i].getAddress()+","+u[i].getCity()+","+u[i].getContactNo()); 
    }
    p.close();
}
    public static void readFiles() throws FileNotFoundException 
    {
        count = 0;
        File f= new File("librarian.txt");
        Scanner s = new Scanner(f);
        while (s.hasNextLine())
        {
            String x=s.nextLine();
            String tokens[]=x.split(",");
            u[count]=new LibrarianUser(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6]);
            count++;
        }
    }
    
}
