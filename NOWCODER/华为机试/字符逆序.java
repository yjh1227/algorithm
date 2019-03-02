import java.util.Scanner;
/*
题目描述
将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。 如：输入“I am a student”，输出“tneduts a ma I”。

 

 

 
输入参数：

inputString：输入的字符串

 


返回值：

输出转换好的逆序字符串

 

 

输入描述:
输入一个字符串，可以有空格

输出描述:
输出逆序的字符串

示例1
输入
I am a student
输出
tneduts a ma I
*/
public class 字符逆序 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);

    }
}
