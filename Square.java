import java.util.*;

public class Square{ 
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n =sc.nextInt();
        System.out.println("Square sreies are:" + n);

        for(int i=1;i<=n;i++) {
            int square =i*i;
            System.out.print(square + " ");
        }
    }
}
