package com.yjh.t0001;
/*问题描述
        　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
        　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
        输入格式
        　　输入一行，包含一个正整数n。
        输出格式
        　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
        样例输入
        52
        样例输出
        899998
        989989
        998899
        数据规模和约定
        　　1<=n<=54。*/
import java.util.Scanner;

public class huiwen {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
		/*这道题我第一次的解法是套了6个for循环但并不正确，因为最后输出结果，并不是按大小排序
		5位数和6位数会使排序混乱，所以定义两个for循环更合适，也更节省内存。
		*/
        for(int i=10000;i<=99999;i++) {
            int i1=i/10000;
            int i2=i/1000%10;
            int i3=i/100%10; //这里注意仔细计算怎么计算每个位数java里的除法是直接舍弃
            int i4=i%100/10;
            int i5=i%10;
            if(i1+i2+i3+i4+i5==a&&i1==i5&&i2==i4) {
                System.out.println(i);
            }
        }
        for(int i=100000;i<=999999;i++) {//这里注意要变
            int i1=i/100000;
            int i2=i/10000%10;
            int i3=i/1000%10;
            int i4=i%1000/100;
            int i5=i%100/10;
            int i6=i%10;
            if(i1+i2+i3+i4+i6+i5==a&&i1==i6&&i2==i5&&i3==i4) {
                System.out.println(i);
            }

        }

    }
}
