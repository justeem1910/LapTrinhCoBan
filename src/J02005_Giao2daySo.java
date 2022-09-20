import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class J02005_Giao2daySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i<n; i++){
            a.add(sc.nextInt());
        }
        for (int i = 0; i<m; i++){
            b.add(sc.nextInt());
        }
        a.retainAll(b);
        for (int i : a){
            System.out.print(i+ " ");
        }
    }
}
