import java.util.Scanner;

public class ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Strong: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (temp>0){
            int dig = temp%10;
            int fact = 1;
            for (int i = 1;i<=dig;i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if(sum==n){
            System.out.println(n + " is a Strong number");
        } else{
            System.out.println(n + " is not a Strong number");
        }
    }
}
