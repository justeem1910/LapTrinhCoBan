import java.util.Scanner;
import java.util.TreeSet;

public class J03038_DanhDauChuCasi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        TreeSet<String> treeSet = new TreeSet<>();
        for(int i = 0; i<s.length(); i++){
            treeSet.add(String.valueOf(s.charAt(i)));
        }
        System.out.println(treeSet.size());
    }
}
