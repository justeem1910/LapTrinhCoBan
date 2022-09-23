import java.math.BigInteger;
import java.util.Scanner;

public class TN04_SoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            int[] a = new int[s.length()];
            for (int i =0; i < s.length(); i++){
                a[i] = Integer.valueOf(s.charAt(i));
            }
            int check = 0;
            int n = s.length();
            for (int i =0; i<n; i++){
                if (a[i] != a[n - 1 -i] || a[i]%2 !=0){
                    check = 1;
                }
            }
            if (check == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
