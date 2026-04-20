import java.util.*;

public class SunnyNo{ 
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n =sc.nextInt();
        System.out.println("Sunny numbers are:"+n);
        for (int i =1;i<=n;i++){
            int num =i+1;
            int sqrt = (int) Math.sqrt(num);
            if (sqrt*sqrt ==num) {
                System.out.print(i+" ");
            }
        }
    }
}
    

