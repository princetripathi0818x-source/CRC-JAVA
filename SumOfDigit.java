import java.util.*;

public class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter num:");
        int n =sc.nextInt();
        for(int i= 1;i<=n;i++) {
            int num=i;
            int sum=0;
            while (num>0) {
                int dig =num % 10;
                sum+=dig;
                num /=10;
            }
            System.out.println(i +"="+ sum);
        }
    }
}
    

