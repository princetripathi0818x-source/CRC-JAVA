import java.util.*;

public class Cube{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n =sc.nextInt();
        System.out.println("Cube series are: " + n);

        for (int i =1;i<=n;i++){
            int cube = i*i*i;
            System.out.print(cube+" ");
        }
    }
}

