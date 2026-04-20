import java.util.Scanner;

public class ques23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter number to check palindrome: ");
        int number = sc.nextInt();

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (original == reverse) {
            System.out.println(original + " is Palindrome");
        } else {
            System.out.println(original + " is not Palindrome");
        }

        sc.close();
    }
}
    
