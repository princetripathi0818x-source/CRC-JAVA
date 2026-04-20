import java.util.*;
public class arrayContainPrime{
    static boolean isPalindrome(int num){
        int orig=num,rev = 0;

        while(num>0){
            int d =num % 10;
            rev =rev*10+d;
            num /= 10;
        }

        return orig==rev;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count = 0;

        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Eneter the size of Array:" +n);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++) {
            if(isPalindrome(arr[i])) {
                System.out.println(arr[i]+"is palindrome");
                count++;
            }
        }
        System.out.println(count);
    }
}
    

