import java.util.Scanner;
import java.util.TreeSet;

public class JP007_EmailTrungNhau {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        TreeSet<String> treeSet = new TreeSet<>();
        while (s1.hasNextLine()){
            treeSet.add(s1.nextLine().toLowerCase().trim());
        }
        for (String s2 : treeSet){
            System.out.println(s2);
        }
    }
}
