import java.util.*;

public class MagicNO{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n:");
        int n = sc.nextInt();
         System.out.println("Magic numbers are:"+ n);

        for (int i = 1; i <= n; i++){
            int num = i;
            while (num > 9){
                int sum = 0;
                while (num>0){
                    int dig= num % 10;
                    sum +=dig;
                    num /=10;
                }
                num =sum;
            }
            if (num ==1){
                // magic happens 
                System.out.print(i+" ");
            }
        }
    }
}
    
