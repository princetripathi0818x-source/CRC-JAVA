import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);        
    
    System.out.print("Enter coeff. a,b,c: ");
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        double c =sc.nextDouble();

        double d =(b*b)-(4*a*c);

        if (d>0){
            double root1 = (-b+Math.sqrt(d))/(2*a);
            double root2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are: " + root1 + ", " + root2);
        } 
        else if(d==0){
            double root = -b/(2*a);
            System.out.println("Roots are real and same: " + root);
        } else{
            System.out.println("Roots are imaginary");
        }
    }
}