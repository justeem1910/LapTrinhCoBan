import java.util.Scanner;

public class TN01_fibonac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long f1 = 1;
            long f2 = 1;
            long fn = 0;
            if (n == 1 || n==2){
                System.out.println(1);
            } else {
                for (int i = 3; i<=n; i++){
                    fn = f1 + f2;
                    f1 = f2;
                    f2 = fn;
                }
                System.out.println(fn);
            }
        }
    }
}
