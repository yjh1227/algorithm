package Algorithm_Training.华为机试;
/*
题目描述
假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半; 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？



    /**
     * 统计出第5次落地时，共经过多少米?
     *
     * @param high 球的起始高度
     * @return 英文字母的个数
//     */
//public static double getJourney(int high)
//        {
//        return 0;
//        }
//
///**
// * 统计出第5次反弹多高?
// *
// * @param high 球的起始高度
// * @return 空格的个数
// */
//public static double getTenthHigh(int high)
//        {
//        return 0;
//        }
//
//
//
//
//
//        输入描述:
//        输入起始高度，int型
//
//        输出描述:
//        分别输出第5次落地时，共经过多少米第5次反弹多高
//
//        示例1
//        输入
//        复制
//        1
//        输出
//        复制
//        2.875
//        0.03125
// */
import java.util.Scanner;

public class 求小球落地5次后所经历的路程和第5次反弹的高度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int h=sc.nextInt();
            double sum=h;
            double temp=0;
            temp=(double)h;
            double num5=h;
            for (int i=2;i<=5;i++){
                if (i<5){
                    temp=temp/2;
                    sum+=(double)temp*2;
                }else{
                    sum+=(double)temp;
                }
            }
            System.out.println(sum);
            for (int i = 1; i <= 5; i++) {
                num5=num5/2;
            }
            System.out.println(num5);

        }
    }
}
/*
方法二:按比例缩放:

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double n=sc.nextDouble();
            System.out.println(n*2.875);
            System.out.println(n/32);//不必纠结输出
        }
        sc.close();
    }
}
 */
