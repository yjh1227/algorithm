package com.yjh.blue_bridge;

import java.util.Scanner;

/*
问题描述
小明为某机构设计了一个十字型的徽标（并非红十字会啊），如下所示：

..$$$$$$$$$$$$$..
..$...........$..
$$$.$$$$$$$$$.$$$
$...$.......$...$
$.$$$.$$$$$.$$$.$
$.$...$...$...$.$
$.$.$$$.$.$$$.$.$
$.$.$...$...$.$.$
$.$.$.$$$$$.$.$.$
$.$.$...$...$.$.$
$.$.$$$.$.$$$.$.$
$.$...$...$...$.$
$.$$$.$$$$$.$$$.$
$...$.......$...$
$$$.$$$$$$$$$.$$$
..$...........$..
..$$$$$$$$$$$$$..
对方同时也需要在电脑dos窗口中以字符的形式输出该标志，并能任意控制层数。

输入格式
一个正整数 n (n<30) 表示要求打印图形的层数。
输出格式
对应包围层数的该标志。
样例输入1
1
样例输出1
..$$$$$..
..$...$..
$$$.$.$$$
$...$...$
$.$$$$$.$
$...$...$
$$$.$.$$$
..$...$..
..$$$$$..
样例输入2
3
样例输出2
..$$$$$$$$$$$$$..
..$...........$..
$$$.$$$$$$$$$.$$$
$...$.......$...$
$.$$$.$$$$$.$$$.$
$.$...$...$...$.$
$.$.$$$.$.$$$.$.$
$.$.$...$...$.$.$
$.$.$.$$$$$.$.$.$
$.$.$...$...$.$.$
$.$.$$$.$.$$$.$.$
$.$...$...$...$.$
$.$$$.$$$$$.$$$.$
$...$.......$...$
$$$.$$$$$$$$$.$$$
..$...........$..
..$$$$$$$$$$$$$..
提示
请仔细观察样例，尤其要注意句点的数量和输出位置。
 */
import java.util.Scanner;

public class 打印十字图 {
    static int end=0;//终止条件
    static char icon='$';//打印的图标
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        end=n;
        sc.close();
        n=5+2*(n*2);//整个图有多少行多少列
        char[][] map=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j]='.';
            }
        }
        paintMid(map);
        paint(map,0,n,0);
        show(map);
        //System.out.println(n);
    }
    //赋值四边
    public static void paint(char[][] map,int start ,int n,int count){
        if(count>=end)return;
        //赋值第一行，倒数第一行
        for(int i=start+2;i<n-2;i++){
            map[start][i]=icon;
            map[n-1][i]=icon;
        }
        //赋值第二行，倒数第二行
        map[start+1][start+2]=icon;
        map[start+1][n-3]=icon;
        map[n-2][start+2]=icon;
        map[n-2][n-3]=icon;
        //赋值第三行，倒数第三行
        int temp=0;//因为start不断变大，所以倒数的三列不能减去start来打印‘￥’,只能定义多一个变量
        for(int i=start;i<start+3;i++){
            //第三行
            map[start+2][i]=icon;
            map[start+2][n-1-temp]=icon;
            //倒数第三行
            map[n-3][i]=icon;
            map[n-3][n-1-temp]=icon;
            temp++;
        }
        //赋值左右两边
        for(int i=start+2;i<n-2;i++){
            map[i][start]=icon;
            map[i][n-1]=icon;
            //	System.out.println("aaaa");
        }
        count++;
        paint(map,start+2,n-2,count);//递归调用打印
    }
    //赋值中间的十字
    public static void paintMid(char[][] map){
        int midline=map.length/2;
        int j=end*2;
        for(int i=0;i<5;i++){
            map[midline][j+i]=icon;
            map[j+i][midline]=icon;
        }
    }//将图形打印出来
    public static void show(char[][] map){
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map.length;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
