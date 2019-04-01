package 杂项;
/*
分解因数
查看 提交 统计 提问
总时间限制: 1000ms 内存限制: 65536kB
描述
给出一个正整数a，要求分解成若干个正整数的乘积，即a = a1 * a2 * a3 * ... * an，并且1 < a1 <= a2 <= a3 <= ... <= an，问这样的分解的种数有多少。注意到a = a也是一种分解。
输入
第1行是测试数据的组数n，后面跟着n行输入。每组测试数据占1行，包括一个正整数a (1 < a < 32768)
输出
n行，每行输出对应一个输入。输出应是一个正整数，指明满足要求的分解的种数
样例输入
2
2
20
样例输出
1
4
 */


/*
思路:
递归最典型的用法，是自顶向下的递归实现思路。从x开始向1递归，
对1到x的每位进行判断（是否是其最大因子）累加次数的同时，加上
下次递归的f(a, b-1)的情况，f(a, b)中若a%b == 0 则，
进一步递归分解。否者对b-1进行判断。b减到1时结束
返回0（可以想象一个质数只有第一次加一，后面b一直在减一，直到b == 1则返回0），
而被分解的数a等于1，意味着上次调用时的因数刚好将其整除尽，算作一种情况返回1。

 */
import java.util.Scanner;

public class 分解因数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        for (int i = 0; i < n; i++) {
            x=sc.nextInt();
            System.out.println(count(x,x));
        }
    }

    private static int count(int a, int b) {

        if (a==1)
            return 1;
        if (b==1)
            return 0;
        if (a%b==0)
            return count(a/b,b)+count(a,b-1);
        else
            return count(a,b-1);
    }
}
