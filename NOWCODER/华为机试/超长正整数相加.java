package Algorithm_Training;
/*
题目描述
请设计一个算法完成两个超长正整数的加法。



接口说明




 /*
 请设计一个算法完成两个超长正整数的加法。
 输入参数：
 String addend：加数
 String augend：被加数
 返回值：加法结果
 */

//public String AddLongInteger(String addend, String augend)
//        {
//        /*在这里实现功能*/
//
//
//        return null;
//        }
//
//

//        输入描述:
//        输入两个字符串数字
//
//        输出描述:
//        输出相加后的结果，string型
//
//        示例1
//        输入
//        99999999999999999999999999999999999999999999999999
//        1
//        输出
//        100000000000000000000000000000000000000000000000000
// */
import java.math.BigInteger;
import java.util.Scanner;

public class 超长正整数相加 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            BigInteger bg = new BigInteger(str1);
            BigInteger bg2 = new BigInteger(str2);
            System.out.println(bg.add(bg2).toString());
        }

    }
}
