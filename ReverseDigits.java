
import java.util.*;
public class ReverseDigits{ 
   
    static int reversDigits(int num){ 
     
        boolean negativeFlag = false; 
        if (num < 0) { 
            negativeFlag = true; 
            num = -num ; 
        } 
       
        int prev_rev_num = 0, rev_num = 0; 
        while (num != 0) { 
            int curr_digit = num%10; 
       
            rev_num = (rev_num*10) + curr_digit; 
       
	     if ((rev_num - curr_digit)/10 != prev_rev_num){ 
                System.out.println("WARNING OVERFLOWED!!!"); 
                return 0; 
            } 
       
            prev_rev_num = rev_num; 
            num = num/10; 
        } 
       
        return (negativeFlag == true)? -rev_num : rev_num; 
    } 
      
    public static void main (String[] args){ 
	System.out.println("Enter Number : ");
	Scanner input = new Scanner(System.in);
        int num = input.nextInt(); 
        System.out.println("Reverse of no. is " + reversDigits(num)); 
       
        num = 1000000045; 
        System.out.println("Reverse of no. is " + reversDigits(num)); 
    } 
} 
