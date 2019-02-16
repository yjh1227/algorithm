package com.yjh.blue_bridge;

import java.util.Scanner;

/*问题描述
        给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。

        输入格式
        第一行包含一个整数n。

        第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。

        第三行包含一个整数a，为待查找的数。

        输出格式
        如果a在数列中出现了，(位置从1开始编号输出它第一次出现的位置)，否则输出-1。
        样例输入
        6
        1 9 4 8 3 9
        9
        样例输出
        2
        数据规模与约定
        1 <= n <= 1000。*/
public class chazhao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        int[] array=new int[i];
        for (int j=0;j<array.length;j++){
            array[j]=sc.nextInt();
        }
        int a = sc.nextInt();
        for (int k=0;k<array.length;k++){
            if (array[k]==a){
                System.out.println(k+1);
                return;
            }
        }
        for (int l=0;l<array.length;l++){
            if (array[l]!=a){
                System.out.println(-1);
                return;
            }
        }
    }
}
