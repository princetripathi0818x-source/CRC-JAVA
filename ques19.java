import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter n:");
        int n = sc.nextInt();
        //System.out.println("enter n:");
        long f = 1;
        for(int i =1;i<n;i++){
            f *= i;
            System.out.println(f);
        }
    }
    
}
