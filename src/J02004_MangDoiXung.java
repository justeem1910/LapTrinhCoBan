import java.util.Scanner;

public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            boolean check = true;
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i<n; i++){
                a[i]= sc.nextInt();
            }
            for (int i = 0 ; i < n/2; i++){
                if (a[i] != a[n-1-i] ){
                    check = false;
                    break;
                }
            }
            if (check == true){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
