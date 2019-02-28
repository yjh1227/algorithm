package LeetCode;
/*
题目描述
写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。

输入描述:
输入一个有字母和数字以及空格组成的字符串，和一个字符。

输出描述:
输出输入字符串中含有该字符的个数。

示例1
输入

ABCDEF A
输出

1
 */
import java.util.Scanner;

public class 计算字符个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String input=sc.next();
        int count=0;

        for (int i=0;i<str.length();i++){
            if (str.substring(i,i+1).equalsIgnoreCase(input)){
                count++;
            }
        }
        System.out.println(count);
    }
}
