import java.util.Scanner;

public class TN02_UocNguyenToLN {
    private static int ktnt(long n){
        if (n == 2)  return 1;
        if (n<2 || n%2 == 0) return  0;
        for (long i = 3; i <= Math.sqrt(n) ; i++){
            if (n%i == 0) return  0;
        }
        return  1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long x = 0;

            for (long i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (ktnt(n / i) == 1) {
                        x = n/i;
                    }
                    else if (ktnt(i) == 1)
                        x = i;
                }
            }
            if (x > 0){
                System.out.println(x);
            }
        }
    }
}
