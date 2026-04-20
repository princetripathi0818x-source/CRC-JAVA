import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a character: ");      
           char check = sc.next().charAt(0);        
           if((check>='A' && check<='Z')||(check >='a' && check<='z')){
                        System.out.println("Alphabet");
            }
            else if(check >='0' && check <= '9') {           
                             System.out.println("Digit");  
            } 
            else{            
            System.out.println("Special Character");        
        }    sc.close();    
    }
}
    