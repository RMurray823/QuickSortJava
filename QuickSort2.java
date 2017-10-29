
package quicksort2;

import java.util.Random;

/*****************
 author Robert Murray
 *****************/
public class QuickSort2
{        
   //private static int Size =  50;
   
   //private static int anArray[]; 
         
   private static void printArray(int anArray[])
   {
      for (int count = 0; count < anArray.length; count++) {
         if (count > 0) {
            System.out.print(", ");
         }
         System.out.print(anArray[count]);
      }
   }
   
   private static void populateArray(int anArray[])
   {
       for (int count = 0; count < anArray.length; count++)
       {
           anArray[count] = (int)(Math.random() * 100); 
           //insert random integer from 0 through 10 into array
       }
    }
   
   private static void Sort(int [] anArray)
   {
       //pick pivot point
       //
   }       
   
   public static void main(String[] args) 
   {
      //QuickSort2 thisArray = new QuickSort2();
      int[] testArray = new int[100];
      //int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      //printArray(testArray);
      populateArray(testArray);
      printArray(testArray);
      
      //thisArray.generateArray();
      //thisArray.printArray();
           
   }
}
