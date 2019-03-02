package LeetCode;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/*
题目描述
将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符





        输入描述:
        将一个英文语句以单词为单位逆序排放。

        输出描述:
        得到逆序的句子

        示例1
        输入
        I am a boy
        输出
        boy a am I
 */
public class 反转句子 {
    public static void main(String[] args) {
        Stack<Object> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            int len=str.length();
            String[] s=str.split(" ");


            for (int j=0;j<s.length;j++){
                st.push(s[j]);
            }
            
            //观察了输入和输出,发现是一个栈.所以想到了栈解,但是遇到多行的时候,就出现了错误.
//            while(!st.isEmpty()){
//                for (int k=0;k<st.size();k++){
//                    if (k<st.size()-1){
//                        System.out.print(st.pop()+" ");
//                    }
//                    else
//                        System.out.print(st.pop());
//                }
//            }


            StringBuilder sb = new StringBuilder();
            for (int i = s.length-1; i >=0; i--) {
                sb.append(s[i]+" ");
            }

            System.out.println(sb.substring(0, len));
            }
        }
}
