
package print_n_digits;

import java.util.Scanner;

/*****************
 author Robert
 *****************/
public class Print_N_Digits {

    private int N; //input for digit print
    
    private int count; //just a counter that helps keep output neat
    
    private int K; //input for binary print
       
    private double getN(){ //N getter
        return N;
    }
        
    private int getK(){ //K getter
        return K;
    }
        
    private void setN(int input){ //N setter
        this.N = input;
    }
    
    private void setK(int input){ //K setter
        this.K = input;
    }
    

    private void print_digits(int input){
        
        setN(input); //set N digits
        System.out.print("Print all n digit strictly increasing numbers\n" +
"Given number of digits N in a number, print all N digit numbers whose digits are strictly increasing from left to right\n" +
"N = "+ N +"\nResults:\n\n");
        int counter = 0; //counts each time a number is printed
        for (int i = 0; i < (int)Math.pow(10, N); i++){ //iterate through all integers based on 10^N
            String out = String.format("%0"+ N + "d", i); //make a string formatted to the proper numbers of digits
            System.out.print(out + " ");      //print
            counter++;
            if (counter%20 == 0) System.out.println(); //every 10 numbers make a new line
        }    
    }
    
    private void print_binary(int input){
        setK(input); //set K digits
        int counter = 0; //
        for (int i = 0; i <= (int)Math.pow(2, K) - 1; i++){
            counter++;
            String out = String.format("%" + K + "s", Integer.toBinaryString(i)).replace(" ", "0"); //make string with correct format
            System.out.print(out + ", ");  
            if (counter%5 == 0) System.out.println(); //every 10 numbers make a new line
        }
    }
    
    private void print_binary_recursive(char binary_nums[], int n){
       
    if (n == K){ // print if array size equals input size
        count++; //counter for making print out neat
        System.out.print(new String(binary_nums) + " ");
        if (count%5 == 0) System.out.println(""); //every 10 numbers make a new line
        return;
    }
 
    if (binary_nums[n-1] == '1'){ //If previous char is 1
        binary_nums[n] = '0';
        print_binary_recursive (binary_nums , n+1);
    }
 
    if (binary_nums[n-1] == '0'){ //If last char is 0
        binary_nums[n] = '0';
        print_binary_recursive(binary_nums, n+1);
        binary_nums[n] = '1';
        print_binary_recursive(binary_nums, n+1);
    }
    
    }
    
    private void string_starter(int input){
    setK(input);
    System.out.print("\nGenerate all binary strings without consecutive 1’s \nGiven number K print a binary string of size K\n" +
"where all the binary strings DO NOT have consecutive ones\n\nK = " + K + "\nResults:\n");
    if (K <= 0) // Base case
        return;
 
    char[] binary_nums = new char[K]; // declare character array
 
    binary_nums[0] = '0'; //arrays starting with 0
    print_binary_recursive (binary_nums, 1);
 
    binary_nums[0] = '1'; //arrays starting with 1
    print_binary_recursive (binary_nums, 1);    
    }
   
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Integer printing program");
        Print_N_Digits thing = new Print_N_Digits();
        
        System.out.print("\nEnter the range of integers (keep it small, 1-7 please): ");
        int digit_input = input.nextInt();
        
       thing.print_digits(digit_input);
       //thing.print_binary(8);
       
       System.out.print("\n\nEnter the range of binary numbers: ");
        int binary_input = input.nextInt();
       thing.string_starter(binary_input);
    }
}
