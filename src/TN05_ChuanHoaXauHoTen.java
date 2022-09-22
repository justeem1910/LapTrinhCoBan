import java.util.ArrayList;
import java.util.Scanner;

public class TN05_ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >=0){
            String s = sc.nextLine();
            s = s.replaceAll("\\s+", " ").trim().toLowerCase();
            String temp[] = s.split(" ");
            s = "";
            if (temp.length != 1){
                for (int i = 0; i < temp.length; i++) {
                    s += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                    if (i < temp.length - 1) // ? ^-^
                        s += " ";
                }
                System.out.println(s);
            }

        }
    }
}
