import java.util.Scanner;

public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            t--;
            boolean check = true;
            long n = sc.nextLong();
            while (n > 9) {
                long du = n % 10;
                n /= 10;
                long du1 = n % 10;
                if (du1 - du == 1 || du - du1 == 1) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check == true){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
