import java.util.*;

public class Gp{ 
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first term a:");
        int a = sc.nextInt();
        System.out.print("Enter common ratio r:");
        int r = sc.nextInt();
        System.out.print("Enter number of terms n:");
        int n = sc.nextInt();
        int term = a;
        for (int i =1;i<=n;i++){
            System.out.print(term +" ");
            term *=r;
        }
    }
}

