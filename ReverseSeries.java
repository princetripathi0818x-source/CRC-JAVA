import java.util.Scanner;

public class ReverseSeries{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter value of n:");
        int n =sc.nextInt();
        System.out.println("Reverse Series is:");
        for(int i=n;i>0;i--){
            System.out.print(i +",");
        }
    }
}