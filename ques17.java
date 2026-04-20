import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+,-,*,/):");
        char ch = sc.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println("Result = "+(num1+num2));
                break;
            case '-':
                System.out.println("Result = "+(num1-num2));
                break;
            case '*':
                System.out.println("Result = " +(num1*num2));
                break;
            case '/':
                if (num2 != 0){
                    System.out.println("Result = "+(num1/num2));
                } 
                else{
                    System.out.println("Division by zero not possible");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
