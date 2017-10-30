package quicksort;

import java.util.Scanner;

/*****************
 author Robert Murray
 *****************/
public class QuickSort
{        
   public static void exchange(int[] anArray, int i, int j){
       //display left and right values being swapped as well as their respective position
       System.out.print("\n"+"Swaped '" + anArray[i] + "' at slot '" + (i+1) +"' " +
       "with '" + anArray[j] + "' at slot '" + (j+1) +"'"); 

        int temp = anArray[i]; 
	anArray[i] = anArray[j];
	anArray[j] = temp;}
   
   private static void printArray(int[] anArray){
      System.out.print("\n");
      //count is +1 so that newline counter lines up nicely
      for (int count = 1; count < anArray.length+1; count++){
         if (count > 0){ 
         //makes a string for more nicely organized print out
         String out = String.format("% 3d", anArray[count-1]);
         System.out.print(out + " ");
         }
         
         if (count%10 == 0)
             System.out.print("\n");
      }
      System.out.print("\n");

   }
   
   private static void populateArray(int[] anArray, int range){
       //iterate through empty array
       for (int count = 0; count < anArray.length; count++)
       {
           //insert random integer from 0 through 10 into array
           anArray[count] = (int)(Math.random() * range); 
       }      
    }
   
   private static int partitionArray(int anArray[], int left_pointer, int right_pointer){
       
        int pivot = anArray[(left_pointer + right_pointer) / 2]; //set pivot
		//System.out.print("\n" + "Pivot is: " + pivot);
	while (left_pointer <= right_pointer) { //keep going until we traverse array
			// Find element on left that should be on right
		while (anArray[left_pointer] < pivot) { 
			left_pointer++;
			}
			
			// Find element on right that should be on left
		while (anArray[right_pointer] > pivot) {
			right_pointer--;
			}
			
			// Swap elements, update left and right pointers
		if (left_pointer <= right_pointer) {
                        System.out.print("\n" + "Pivot is: " + pivot);
			exchange(anArray, left_pointer, right_pointer);
			left_pointer++;
			right_pointer--;
                        //printArray(anArray);
                }
                
                
                }return left_pointer;}
   
   private static void Sort(int[] anArray, int left_pointer, int right_pointer){
       
       if (anArray.length == 0){
           return;}
       int index = partitionArray(anArray, left_pointer, right_pointer); 
		if (left_pointer < index - 1) { // Sort left half
			Sort(anArray, left_pointer, index - 1);
		}
		if (index < right_pointer) { // Sort right half
			Sort(anArray, index, right_pointer);
    } 
}
         
   public static void main(String[] args) 
   {
       System.out.print("Quicksort program, sorts an array of integers\n");
       //Get user input
       Scanner input = new Scanner (System.in);
       System.out.print("Enter size of array (1-20): ");
       int newput = input.nextInt();
       
      int[] testArray = new int[newput];
      //display empty initialized array
      System.out.print("Initialize array");
      printArray(testArray);
      //fill it up
      System.out.print("\nPopulate array\n");
      System.out.print("Enter range of numbers in array (1-100): ");
      int anotherput = input.nextInt();
      populateArray(testArray, anotherput);
      //display new disorganized array
      printArray(testArray);
      //sort it
      Sort(testArray, 0, testArray.length - 1); 
      //display array
      System.out.print("\nSorted array");
      printArray(testArray);
   }
}
