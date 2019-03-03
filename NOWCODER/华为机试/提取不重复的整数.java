package LeetCode;
/*
题目描述
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。

输入描述:
输入一个int型整数

输出描述:
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

示例1
输入
9876673
输出
37689
 */
import java.util.ArrayList;
import java.util.Scanner;

public class 提取不重复的整数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList list = new ArrayList();
        while (num!=0){
            if (!list.contains(num%10)){
                list.add(num%10);
            }
            num/=10;
        }
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
}
