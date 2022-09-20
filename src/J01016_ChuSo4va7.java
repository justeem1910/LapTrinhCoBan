import java.util.Scanner;

public class J01016_ChuSo4va7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int dem = 0;
        while (n > 0){
            long du = n%10;
            if(du == 4 || du == 7) {
                dem++;
            }
            n /= 10;
        }
        if(dem == 4 || dem == 7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
