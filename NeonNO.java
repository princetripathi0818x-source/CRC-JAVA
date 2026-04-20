import java.util.*;

public class NeonNO { 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter value of n:");
        int n =sc.nextInt();
         System.out.println("Neon numbers are:"+ n);
           for (int i =1;i<=n;i++){
            int square =i*i;
            int sum =0;
            while (square>0){
                int dig = square%10;
                sum += dig;
                square /=10;
            }
            if (sum ==i){
                System.out.print(i + " ");
            }
        }
    }
}
    

