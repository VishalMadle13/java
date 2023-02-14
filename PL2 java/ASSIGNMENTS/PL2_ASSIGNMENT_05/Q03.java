// package PL2_ASSIGNMENT_05;
 
// //   3.	Develop a program to display contents of file supplied as command line argument.
// public class Q03 
// {
//      public static void main(String[] args)
//     {

//     }
    
// }
import java.io.*;
class Q03
{
 public static void main(String[] args)
 {
  FileInputStream in = null;
  try
  {
   in = new FileInputStream(args[0]);
   int c;
   while((c=in.read())!=-1)
   System.out.print((char)c);
   in.close();
  }
  catch(Exception e)
  {System.out.println(e);}
 }
}
