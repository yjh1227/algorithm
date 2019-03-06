package Algorithm_Training;
/*
题目描述
将一个字符中所有出现的数字前后加上符号“*”，其他字符保持不变
 public static String MarkNum(String pInStr)
 {

  return null;
 }
输入描述:
输入一个字符串

输出描述:
字符中所有出现的数字前后加上符号“*”，其他字符保持不变

示例1
输入
复制
Jkdi234klowe90a3
输出
复制
Jkdi*234*klowe*90*a*3*
 */
import java.util.Scanner;

public class 表示数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            System.out.println(markNums(str));
        }
    }

    public static String markNums(String pInStr) {
        char[] arr = pInStr.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - '0' >= 0) && (arr[i] - '0' <= 9)) { // 判断为数字
                sb.append("*" + arr[i] + "*");  //两边都加上*
            } else
                sb.append(arr[i]);
        }
        return sb.toString().replace("**", "");  //两个数字中间有** 替换掉
    }
}
