package Algorithm_Training;
/*
题目描述
根据输入的日期，计算是这一年的第几天。。

详细描述：

输入某年某月某日，判断这一天是这一年的第几天？。





接口设计及说明：

 /*****************************************************************************
 Description   : 数据转换
 Input Param   : year 输入年份
                Month 输入月份
                Day 输入天

 Output Param  :
 Return Value  : 成功返回0，失败返回-1（如：数据错误）
 *****************************************************************************/
//public static int iConverDateToDay(int year, int month, int day)
//        {
//        /* 在这里实现功能，将结果填入输入数组中*/
//        return 0;
//        }

/*****************************************************************************
 Description   :
 Input Param   :

 Output Param  :
 Return Value  : 成功:返回outDay输出计算后的第几天;
 失败:返回-1
 *****************************************************************************/
//public static int getOutDay()
//        {
//        return 0;
//        }
//
//        输入描述:
//        输入三行，分别是年，月，日
//
//        输出描述:
//        成功:返回outDay输出计算后的第几天;
//        失败:返回-1
//
//        示例1
//        输入
//        复制
//        2012
//
//        12
//
//        31
//        输出
//        复制
//        366

import java.util.Scanner;

public class 计算日期到天数转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int year=sc.nextInt();
            int month=sc.nextInt();
            int day=sc.nextInt();
            int sum=0;
            int[] arr={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
            if (day<=0||month<=0||year<=0||month>12||day>31){
                System.out.println(-1);
            }
            else if(year%4==0&&year%100!=0||year%400==0) {
                arr[1]=29;
            }
            for (int i=0;i<month-1;i++){
                sum+=arr[i];
            }
            System.out.println(sum+day);
        }
    }
}
