// 154 Write a Java program to print the contents of a two-dimensional Boolean array where t will represent true and f will represent false. Go to the editor

// Sample array:
// array = {{true, false, true},
// {false, true, false}};
// Expected Output :
// t f t
// f t f




public class W_154
{
    public static void main(String[] args)
    {
       boolean[][] array= {{true,false,true},{false,true,false}};
       //array.length   ==> length of the array 
       //array[0].length==> column length
       
    //    System.out.print(array.length+"\n");
    //    System.out.println(array[0].length);

       for(int i=0; i<array.length ; i++)
       {
           for(int j=0; j<array[0].length; j++)
           {

            if(array[i][j])
            {
                System.out.print("t");
            }
            else
            {
                System.out.print("f");
            }
           }
           System.out.println();
          
       }
    }


}