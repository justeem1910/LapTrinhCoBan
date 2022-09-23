import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TN03_TongSoTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();;

        while (t-- > 0){
            String s = sc.next();
            String last = "";
            long sum = 0;

            for (int i =0; i< s.length(); i++){
                if (Character.isDigit(s.charAt(i))){
                    sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                } else {
                    last += s.charAt(i);
                }
            }
            String[] res = new String[last.length()];
            for (int i=0; i< last.length(); i++){
                res[i] = String.valueOf(last.charAt(i));
            }

            last = "";
            for (int i = 0; i < res.length - 1; i++)
            {
                for (int j = i + 1; j < res.length; j++) {
                    if (res[i].compareTo(res[j])>0)
                    {
                        String temp = res[i];
                        res[i] = res[j];
                        res[j] = temp;
                    }
                }
            }
            for (int i = 0; i< res.length; i++){
                last += res[i];
            }
            System.out.println(last+sum);
        }
    }
}
