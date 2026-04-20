import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of Fibonacci terms: ");
        int n = sc.nextInt();

        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series: ");

        for(int i = 1;i<=n; i++){
            System.out.print(n1 + " ");
            int next = n1+ n2;
            n1 = n2;
            n2 = next;
        }
        System.out.println();
    }
    
}
