package com.yjh.blue_bridge;
/*问题描述
        　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
        输出格式
        　　按从小到大的顺序输出满足条件的四位十进制数。*/
public class huiwen2 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for (int i=1000;i<=9999;i++){
            a=i/1000;
            b=i/100%10;
            c=i/10%10;
            d=i%10;
            if (a==d&&b==c){
                System.out.println(i);
            }
        }
    }
}
