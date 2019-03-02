package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class 求int型正整数在内存中存储时1的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList list = new ArrayList();
        int yushu;
        int i=1;

        while((double)num/2!=0){
            yushu=num%2;
            if (yushu==1){
                list.add(yushu);
            }
            num/=2;

        }
        System.out.println(list.size());
    }
}
