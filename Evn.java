import java.util.*;

public class Evn{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        for (int i =1;i<=n;i++){
            int even = 2*i;
            System.out.print(even +" ");
        }
    }
}
   
    

