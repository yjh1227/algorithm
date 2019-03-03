package LeetCode;

/*
题目描述
编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。

输入描述:
输入N个字符，字符在ACSII码范围内。

输出描述:
输出范围在(0~127)字符的个数。

示例1
输入
abc
输出
3
 */

import java.util.ArrayList;
import java.util.Scanner;

public class 字符个数统计 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>=0&&str.charAt(i)<=127&&!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }
        }
        System.out.println(list.size());
    }
}
