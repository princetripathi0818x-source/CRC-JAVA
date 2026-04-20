import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n= sc.nextInt();
        System.out.println("Armstrong no. are:" + n);
        for (int i = 1; i <= n; i++){
            int num = i;
            int sum = 0;
            int dig = 0;
            int temp = num;
            while (temp > 0){
                dig++;
                temp /= 10;
            }
            temp = num;
            while (temp > 0){
                int rem =temp % 10;
                sum += Math.pow(rem,dig);
                temp /= 10;
            }
            if (sum == num){
                System.out.print(num +" ");
            }
        }
    }
}
