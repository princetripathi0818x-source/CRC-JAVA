import java.util.*;

public class AutomarphicNo{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("Automorphic numbers are"+ n);
        for (int i =1;i<=n;i++) {
            int sq =i*i;
            int temp =i;
            boolean isAutomorphic = true;
            while (temp >0){
                if (temp % 10!=sq%10){
                    isAutomorphic = false;
                    break;
                }
                temp/=10;
                sq /=10;
            }
            if (isAutomorphic){
                System.out.print(i+" ");
            }
        }
    }
}
    

