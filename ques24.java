import java.util.Scanner;

public class ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int orig=num;
        int n =0;
        int temp=num;
        while(temp>0){
            n++;
            temp /= 10;
        }
        int sum = 0;
        temp = num;
        while(temp>0){
            int dig= temp%10;
            sum += Math.pow(dig, n);
            temp /= 10;
        }
        if (sum == orig) {
            System.out.println(orig+ " is an Armstrong number");
        } else {
            System.out.println(orig+ " is not an Armstrong number");
        }
    }
}
