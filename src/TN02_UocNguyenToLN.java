import java.util.Scanner;

public class TN02_UocNguyenToLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            Boolean[] check = new Boolean[(int) n];
            for (int i = 2; i <= Math.sqrt(n); i++){
                check[i] = true;
            }
            int sqrt = (int)Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++){
                if( check[i] == true){
                    for (int j = i*2; j<= sqrt; j+=i){
                        check[j] = false;
                    }
                }
            }
            int res = 0;
            for (int i = sqrt; i >=2; i--){
                if (check[i] == true){
                    if (n % i == 0){
                        res = i;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
