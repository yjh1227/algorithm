package Algorithm_Training.华为机试;
/*
题目描述
一个DNA序列由A/C/G/T四个字母的排列组合组成。G和C的比例（定义为GC-Ratio）是序列中G和C两个字母的总的出现次数除以总的字母数目（也就是序列长度）。在基因工程中，这个比例非常重要。因为高的GC-Ratio可能是基因的起始点。

给定一个很长的DNA序列，以及要求的最小子序列长度，研究人员经常会需要在其中找出GC-Ratio最高的子序列。
 

输入描述:
输入一个string型基因序列，和int型子串的长度

输出描述:
找出GC比例最高的子串,如果有多个输出第一个的子串

示例1
输入
AACTGTGCACGACCTGA
5
输出
GCACG
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DNA序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        ArrayList list = new ArrayList();
        Stack stack = new Stack();
        double temp=Double.MIN_VALUE;

        for (int i = 0; i <= str.length()-n; i++) {
            int count=0;
            String strTemp=str.substring(i,n+i);
            for (int j = 0; j < strTemp.length(); j++) {
                if (strTemp.charAt(j)=='G'||strTemp.charAt(j)=='C'){
                    count++;
                }
            }
            double rate=(double)count/n;
            if (rate>temp)
            {
                temp=rate;
//                list.add(strTemp);
                stack.push(strTemp);
            }
//            System.out.println(rate+":"+strTemp);
        }
//        System.out.println(list);
//        System.out.println(list.get(list.size()-1));
        System.out.println(stack.peek());
//
//        for (int i = 0; i < str.length() - n; i++) {
//            int count = 0;
//            if (str.charAt(i) == 'G' || str.charAt(i) == 'C') {
//                count++;
//            }
//            System.out.print(str.charAt(i));
//            for (int j = i + 1; j < n + i; j++) {
//                System.out.print(str.charAt(j));
//                if (str.charAt(j) == 'G' || str.charAt(j) == 'C') {
//                    count++;
//                }
//            }
//            double rate = (double) count / n;
//            System.out.print(rate + " ");
//        }
    }
}
