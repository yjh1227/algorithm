package LeetCode;
/*
题目描述
输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。

输入描述:
 输入一个整数（int类型）

输出描述:
 这个数转换成2进制后，输出1的个数

示例1
输入
复制
5
输出
复制
2
*/
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
