import java.util.*;
    public class harshadNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of n:");
        int n = sc.nextInt();
        System.out.println("hrshad numbers are:"+n);

        for(int i =1;i<=n;i++){
            int num =i;
            int sum =0;
            while (num>0){
                int dig =num%10;
                sum +=dig;
                num /=10;
            }
            if (i%sum ==0){
                System.out.print(i+" ");
            }
        }
    }
}
    

