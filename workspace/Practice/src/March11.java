import java.util.*; 
import java.io.*;

class Main {  
  public static int FirstFactorial(int num) { 
  
    int fact = 1;
    
        for (int i = 1; i <= num; i++) {
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
        fact = fact * i;
        System.out.println(i);
  }

  return fact;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    System.out.println(FirstFactorial(num));
  }   
  
}