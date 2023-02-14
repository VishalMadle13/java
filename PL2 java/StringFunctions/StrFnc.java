public class StrFnc 
{
    public static void main(String[] args)
    {
        //.length();
         String name="Vishal";
         System.out.println(name.length());//gives length of string
        //.toLowerCase();
         System.out.println(name.toLowerCase());//all string in lower case
        //.touppercase();

         System.out.println(name.toUpperCase());//upppercase

         //.trim();
         String str1="   vishal m   ";
         System.out.println(str1.trim());//trim the side spaces on the string

         //.substring();
         System.out.println(name.substring(2));
         System.out.println(name.substring(2,4));
         System.out.println(str1.substring(2));
        //.replace();
         System.out.println(str1.replace('s',   'n'));
//Starts and endswith

         System.out.println(name.startsWith("V")); //boolean : return true or false
         System.out.println(name.endsWith("al"));   //boolean : return true or false

         //charAt();
         System.out.println(name.charAt(2));
         
         //indexOf();
         System.out.println(name.indexOf("s"));
         




    






    }
    
}
