import java.util.*;

public class strongNo{
    public static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n= sc.nextInt();
        System.out.println("Strong numbers are:"+n);
        for(int i=1;i<=n;i++){
            int num = i;
            int sum = 0;
            while (num>0){
                int dig=num%10;
                sum +=factorial(dig);
                num /=10;
            }
            if (sum == i){
                System.out.print(i+" ");
            }
        }
    }
}
    

