import java.util.*;
    public class Triangular{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();

        for (int i =1;i<=n;i++){
            int tri =i*(i+1)/2;
            System.out.print(tri+" ");
        }
    }
}
    
