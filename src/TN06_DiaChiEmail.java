import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TN06_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        t *=2;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> treeSet = new ArrayList<>();
        int[] a = new int[100];
        int res = t;
        while (t-- >=0){
            String s = sc.nextLine();
            if (s!= ""){
                s = s.replaceAll("\\s+", " ").trim().toLowerCase();
                String temp[] = s.split(" ");
                s = "";
                if (temp.length != 1){
                    s += String.valueOf(temp[temp.length-1].charAt(0)) + temp[temp.length-1].substring(1);
                    for (int i = 0; i < temp.length - 1; i++) {
                        s+= String.valueOf(temp[i].charAt(0));
                    }
                    arrayList.add(s);
                }
            }
            int dem = 1;
            for (int i = 0; i< arrayList.size(); i++){
                if (s.equals(arrayList.get(i))){
                    dem++;
                }
//                treeSet.add(arrayList.get(i));
//                if (i == arrayList.size() - 1){
//                    break;
//                }
//                for (int j = i+ 1; j< arrayList.size(); j++){
//                    if (arrayList.get(j).equals(arrayList.get(i))){
//                        dem++;
//                        arrayList.set(j, arrayList.get(j)+dem);
//                    }
//                }

            }
            if (dem == 1){
                a[res-t-1] =0;
            } else {
                a[res-t-1] = dem;
            }
            System.out.println(s+a[res-t-1]+"@ptit.edu.vn");
        }

    }
}
