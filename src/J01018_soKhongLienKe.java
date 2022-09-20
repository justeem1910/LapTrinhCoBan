import java.util.Scanner;

public class J01018_soKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            t--;
            boolean check = true;
            long n = sc.nextLong();
            long sum = 0;
            while (n > 9) {
                long du = n % 10;
                n /= 10;
                long du1 = n % 10;
                sum += du;
                if (du1 - du == 2 || du - du1 == 2) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            sum += n%10;
            if (check == true && sum %10 == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
