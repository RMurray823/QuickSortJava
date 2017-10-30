package quicksort;

/*****************
 author Robert Murray
 *****************/
public class QuickSort
{        
   public static void exchange(int[] anArray, int i, int j){
       System.out.println("\n"+"Swap '" + anArray[i] + "' at slot '" + (i+1) +"' " +
       "with '" + anArray[j] + "' at slot '" + (j+1) +"'");

        int temp = anArray[i];
	anArray[i] = anArray[j];
	anArray[j] = temp;}
   
   private static void printArray(int[] anArray){
      System.out.print("\n");
      for (int count = 0; count < anArray.length; count++){
         if (count > 0){ 
         System.out.print(anArray[count] + ", ");
         }
         
         if (count%10 == 0)
             System.out.print("\n");
      }
   }
   
   private static void populateArray(int[] anArray){
       for (int count = 0; count < anArray.length; count++)
       {
           anArray[count] = (int)(Math.random() * 100); 
           //insert random integer from 0 through 10 into array
       }      
    }
   
   private static int partitionArray(int anArray[], int left_pointer, int right_pointer){
       
        int pivot = anArray[(left_pointer + right_pointer) / 2]; //set pivot
		System.out.println("\n" + "Pivot is: " + pivot);
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
			exchange(anArray, left_pointer, right_pointer);
			left_pointer++;
			right_pointer--;
                        printArray(anArray);}
                
                
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
       
       //int pivot = anArray[(left_pointer + right_pointer)/2];  //sets pivot to middle of array                         
       //System.out.printf("\n" + "Pivot is: " + pivot + "\n"); 
       
   }
         
   public static void main(String[] args) 
   {
      int[] testArray = new int[100];
      printArray(testArray);
      populateArray(testArray);
      printArray(testArray);
      Sort(testArray, 0, testArray.length - 1);   
      printArray(testArray);
   }
}
