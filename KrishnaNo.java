import java.util.*;

public class KrishnaNo{ 
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Krishnamurthy numbers are: " + n);

        for (int i =1;i<=n;i++){
            int num = i;
            int sum = 0;
            while (num > 0){
                int dig = num % 10;
                int fact = 1;
                for (int j = 1; j <= dig; j++) {
                    fact *= j;
                }
                 sum += fact;
                num /= 10;
            } if (sum == i){
                System.out.print(i+" ");
            }
        }
    }
}
    

