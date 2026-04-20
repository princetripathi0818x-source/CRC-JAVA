import java.util.Scanner;

public class ques27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find sum of digits: ");
        int num = sc.nextInt();
        int digSum = 0;

        while(num>0){
            digSum += num % 10;
            num /=10;
        }

        System.out.println("Sum of digits = " + digSum);
    
}
}
