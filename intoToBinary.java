import java.util.Scanner;
import java.util.Arrays;


public class intoToBinary {

    public static void main(String [] args){
        
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("What is the integer to convert to binary?: ");
        
        int a = user_input.nextInt();
        
        String [] binary = {"0", "0", "0", "0", "0", "0", "0", "0"};

        if ( a >= 129){ //if integer is too big for byte array will give byte code but not in array
            Arrays.fill(binary, null);
            System.out.println("Integer too big for byte array."); //error report
            System.out.println(Integer.toBinaryString(a));
            System.out.println("Int in byte code.");
            return;
        }
 
            //0
        if(a == 0){
            binary = new String [] {"0", "0", "0", "0", "0", "0", "0", "0"};
        }
            //128
        if(a == 128){
            binary = new String [] {"1", "0", "0", "0", "0", "0", "0", "0"};
        }
        
        if(a < 4 && a >= 1){
            binary = new String [] {"0", "0", "0", "0", "0", "0", "1", "1"};
        }
        
        if(a < 8 && a >= 4){
            binary = new String [] {"0", "0", "0", "0", "0", "1", "1", "1"};
        }
        
        if(a < 16 && a >= 8){
            binary = new String [] {"0", "0", "0", "0", "1", "1", "1", "1"};
        }
    
        if(a < 32 && a >= 16){
           binary = new String [] {"0", "0", "0", "1", "1", "1", "1", "1"};
        }
        
        if(a < 64 && a >= 32){
           binary = new String [] {"0", "0", "1", "1", "1", "1", "1", "1"};
        }
        
        if(a < 128 && a >= 64){
           binary = new String [] {"0", "1", "1", "1", "1", "1", "1", "1"};
        }
        
        System.out.println(Arrays.toString(binary));
        
        System.out.println("Bit placement.");
        
        System.out.println(Integer.toBinaryString(a));
        
        System.out.println("Int in byte code.");
    }
}    
            





