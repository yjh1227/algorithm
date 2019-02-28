
import java.util.Scanner;

public class sus_lenth_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArr=new String[5000];
        for (int i=0;i<strArr.length;i++){
            strArr=str.split(" ");
        }
        System.out.println(strArr[strArr.length-1].length());
    }
}
