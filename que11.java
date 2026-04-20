public class que11 {
    public static void main(String[] args){
        int total=2929;

        int years = total/365;
        int remaining= total%365;
        int weeks =remaining/7;
        int days =remaining%7;

        System.out.println("Years = " +years);
        System.out.println("Weeks = " + weeks);
        System.out.println("Days = " + days);
    }
}
    

