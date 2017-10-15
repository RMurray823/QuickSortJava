
package quicksort;

import java.util.Random;

/*****************
 author Robert Murray
 *****************/
public class QuickSort
{        
   private static int[] anArray; 
    
   private void printArray() 
   {
      for (int count = 0; count < anArray.length - 1; count++) 
      {
         if (count > 0) 
         {
            System.out.print(", ");
         }
         System.out.print(anArray[count]);
      }
   }
   
   private void generateArray()
   {
       for (int count = 0; count < anArray.length - 1; count++)
       {
           anArray[count] = (int)(Math.random() * 500); 
           //insert random integer from 0 through 10 into array
       }
    }
   
   private static void Sort(int [] anArray)
   {
       
   }       
   
   public static void main(String[] args) 
   {
      QuickSort thisArray = new QuickSort();
      //int[] testArray = new int[100];
      //int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      //printArray(testArray);
      //populateArray(testArray);
      //printArray(testArray);
      
      thisArray.generateArray();
      thisArray.printArray();
           
   }
}
    

