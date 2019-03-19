package com.yjh.t0001;
/*问题描述
        Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。

        当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。

        输入格式
        输入包含一个整数n。
        输出格式
        输出一行，包含一个整数，表示Fn除以10007的余数。
        说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，直接计算余数往往比先算出原数再取余简单。

        样例输入
        10
        样例输出
        55
        样例输入
        22
        样例输出
        7704
        数据规模与约定
        1 <= n <= 1,000,000*/
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //因为题目要求1 <= n <= 1,000,000，根据取值范围决定n的变量类型为Long型
        int n = input.nextInt();
        //用数组记录第n项的余数
        int[]remainder = new int[n];
        //第一个if是为了确保输入的数据n的取值范围符合题目要求的1 <= n <= 1,000,000
        if (1 <= n && n <= 1000000) {
            if (n == 1 || n == 2) {
                remainder[n - 1] = 1;
            }else {
                for (int i = 2;i < n;i++) {
                    remainder[0] = 1;
                    remainder[1] = 1;
                    remainder[i] =(remainder[i - 1] + remainder[i - 2]) % 10007;
                }
            }
        }
        System.out.println(remainder[n - 1]);

    }
}
