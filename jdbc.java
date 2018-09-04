package CodingDemo;
import java.io.*;
public class jdbc 
{
//	public static void main(String [] args) 
//    {
//        int x = 11 & 9;
//        int y = x ^ 3;
//        System.out.println();
//        System.out.println( y);
//    }
//	public static void main(String [] args) 
//    {
//		jdbc p = new jdbc();
//        p.start();
//    }
//
//    void start() 
//    {
//        long [] a1 = {3,4,5};
//        long [] a2 = fix(a1);
//        System.out.print(a1[0] + a1[1] + a1[2] + " ");
//        System.out.println(a2[0] + a2[1] + a2[2]);
//    }
//
//    long [] fix(long [] a3) 
//    {
//        a3[1] = 7;
//        return a3;
//    }
	public static void main(String args[])
    {
        FileOutputStream out = null;
        try 
        {
            out = new FileOutputStream("test.txt");
            out.write(122);
        }
        catch(IOException io) 
        {
            System.out.println("IO Error.");
        }
        finally 
        {
            
        }
    }
}