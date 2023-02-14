//8. Write a program in java for handling 
//checked exceptions using throws  keyword

import java.io.FileReader;
import java.util.*;
class Q8 
{
    static Scanner sc = new Scanner(System.in);
 
       static void func() throws Exception{
           String filepath = "test1.txt" ;
           FileReader fr = new FileReader(filepath);
 
           int i = fr.read();
           while ( i != -1) {
               System.out.print((char)i);
               i = fr.read() ;
           }
 
           fr.close();
 
            throw new Exception();
 
       }
 
       public static void main(String[] arg){
 
            try {
                func();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
 
       }


    
}
