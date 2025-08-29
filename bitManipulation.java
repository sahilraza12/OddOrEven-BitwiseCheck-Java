import java.util.*;

public class bitManipulation {
    public static void oddOrEven(int n){
        int bitMask = 1;

        if((n & bitMask) == 0){
            //for even number
            System.out.println("Even Number");
        }
     else{
        //for odd number
           System.out.println("Odd Number");
     }
     
    }
    public static void main(String args[]){
        oddOrEven(5);
        oddOrEven(7);
        oddOrEven(8);
    }
}
