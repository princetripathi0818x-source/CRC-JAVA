import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        System.out.print("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year%4 ==0 && year%100 != 0) || (year%400 ==0)){
            System.out.println(year + " is a Leap Year");
        } 
        else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}
