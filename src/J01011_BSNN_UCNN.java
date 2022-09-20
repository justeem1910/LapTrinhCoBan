import java.util.Scanner;

public class J01011_BSNN_UCNN {
    private static long GCD(long a, long b){
        while (a != b){
            if (a < b){
                b = b-a;
            } else {
                a = a-b;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            t--;
            long a = sc.nextLong();
            long b = sc.nextLong();
            long gcd = GCD(a,b);
            long lcm = (a * b) /gcd;
            System.out.print(lcm+" "+gcd);
            System.out.println();

        }
    }
}
