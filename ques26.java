import java.util.Scanner;

public class ques26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        int num= sc.nextInt();
        int rev = 0;

        while(num>0){
            int dig = num%10;
            rev= rev*10 +dig;
            num /= 10;
           //3out.println("Reverse NUmber is:" +rev);
        }
        System.out.println("Reverse NUmber is:" +rev);
    
}
}
