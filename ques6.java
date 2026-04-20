// Wap to print simple Interest and Compound interest

public class ques6 {
    public static void main(String[] args) {
        double p=1000,r = 10,t=3;

        double SI = (p*r*t)/100;

        System.out.println(SI);

        double CI = p * Math.pow((1+r/100),t)-p;

        System.out.println(CI);
    }
    
}
