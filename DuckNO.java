import java.util.*;

public class DuckNO{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Duck numbers are:"+ n);
        for (int i =1;i<=n;i++){
            int num = i;
            boolean hasZero = false;
            while (num>0){
                int dig = num % 10;
                if(dig == 0){
                    hasZero = true;
                    break;
                }
                num /=10;
            }
            if (hasZero){
                System.out.print(i+" ");
            }
        }
    }
}
    

