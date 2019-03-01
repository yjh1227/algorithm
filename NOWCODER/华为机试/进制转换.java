package LeetCode;
/*
题目描述
写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）

输入描述:
输入一个十六进制的数值字符串。

输出描述:
输出该数值的十进制字符串。

示例1
输入
0xA
输出
10
 */
//方法一:
import java.util.Scanner;

import java.util.Scanner;
import java.lang.Math;
public class 进制转换{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.nextLine();
            int sum = convert(input);
            System.out.println(sum);
        }
    }

    public static int convert(String str){
        if(str==null||str.length()==0){
            return 0;
        }
        int sum = 0;
        int temp = 0;
        int n = 16;//进制数
        char ch;
        String input = str.substring(2,str.length());
        int count = input.length()-1;
        for(int i=0;i<input.length();i++){
            ch = input.charAt(i);
            if(ch>='0'&&ch<='9'){
                temp = ch - '0';
            }
            else if(ch>='a'&&ch<='z'){
                temp = ch - 'a' + 10;
            }
            else if(ch>='A'&&ch<='Z'){
                temp = ch -'A' + 10;
            }else{
                break;
            }
            sum += temp*Math.pow(n,count);
            count--;
        }
        return sum;
    }
}


//方法二:测试数据能通过,但是在测评机上没通过
//public class 进制转换 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//        String[] split = str.split("x", 2);
//        int n = Integer.parseInt(split[1], 16);
//        System.out.println(n);
//    }
//}
