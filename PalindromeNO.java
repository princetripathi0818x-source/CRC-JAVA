import java.util.*;

public class PalindromeNO{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("Palindrome numbers are:"+ n);

        for (int i =1;i<=n;i++){
            int num =i;
            int rev= 0;
            while (num>0){
                int dig =num%10;
                rev=rev*10+dig;
                num /=10;
            }
            if (rev==i){
                System.out.print(i+" ");
            }
        }
    }
}
        