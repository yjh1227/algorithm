package LeetCode;

/*
题目描述
写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：
输入描述:
输入N个字符

输出描述:
输出该字符串反转后的字符串

示例1
输入
abcd
输出
dcba
 */
import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);

    }
}
