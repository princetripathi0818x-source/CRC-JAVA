import java.util.*;

public class SpyNo{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n:");
        int n = sc.nextInt();
         System.out.println("Spy numbers are:" +n);

        for(int i =1;i<=n;i++){
            int num = i;
            int sum = 0;
            int prod = 1;
            while (num > 0){
                int dig = num % 10;
                sum += dig;
                prod *= dig;
                num /= 10;
            }
            if (sum == prod){
                // it is spy
                System.out.print(i + " ");
            }
        }
    }
}
    

