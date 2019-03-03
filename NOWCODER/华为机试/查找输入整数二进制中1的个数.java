package LeetCode;
/*
题目描述
请实现如下接口

     public   static   int  findNumberOf1( int num)

    {

         /*  请实现  */

        /*return  0;

        } 譬如：输入5 ，5的二进制为101，输出2



        涉及知识点：

        输入描述:
        输入一个整数

        输出描述:
        计算整数二进制中1的个数

        示例1
        输入
        5
        输出
        2*/

import java.util.ArrayList;
import java.util.Scanner;

public class 查找输入整数二进制中1的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            System.out.println(findNumberOf1(num));
        }
    }

    private static int findNumberOf1(int num) {
        int count=0;
        while (num!=0){
            if (num%2==1){
                count++;
            }
            num/=2;
        }
        return count;
        /*ArrayList list = new ArrayList();
        while(num!=0){
            if (num%2==1)
                list.add(num%2);
            num/=2;
        }
        return list.size();*/
    }
}
