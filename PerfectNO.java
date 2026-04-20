import java.util.*;

public class PerfectNO{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter value of n:");
        int n =sc.nextInt();
        System.out.println("Perfect numbers are:" +n);
        for (int i=1;i<= n;i++) {
            int sum=0;
            for (int j=1;j<=i/2;j++) {
                if (i%j==0) {
                    sum += j;
                }
            }
            if (sum==i && i!=0) {
                System.out.print(i+" ");
            }
        }
    }
}
    

