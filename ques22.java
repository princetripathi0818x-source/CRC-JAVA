import java.util.Scanner;

public class ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N to print primes from 1 to N: ");
        int limit = sc.nextInt();

        System.out.print("Prime numbers: ");
        for (int i = 2; i <= limit; i++) {
            boolean prime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }
    
}
