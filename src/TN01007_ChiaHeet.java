import java.math.BigInteger;
import java.util.Scanner;

public class TN01007_ChiaHeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.compareTo(b) == 1){
                if (a.mod(b).compareTo(BigInteger.ZERO) == 1){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                if (b.mod(a).compareTo(BigInteger.ZERO) == 1){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
