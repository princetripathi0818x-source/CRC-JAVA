import java.util.*;
    public class arraycontainfibo{
        public static boolean isFibo(int num){
        int a =0,b=1;
         while(b<=num){
            if(b==num)
                return true;
            int c=a+b;
            a =b;
            b =c;
        }
        return (num==0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] =new int[n];
        for(int i =0;i<n;i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(isFibo(arr[i])){
                System.out.println(arr[i]+"is fibonacci");
        }
    }
}
    
}
