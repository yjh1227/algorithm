package Algorithm_Training.考研真题;
/*
题目描述
实现一个加法器，使其能够输出a+b的值。
输入描述:
输入包括两个数a和b，其中a和b的位数不超过1000位。
输出描述:
可能有多组测试数据，对于每组数据，
输出a+b的值。
示例1
输入
复制
2 6
10000000000000000000 10000000000000000000000000000000
 */
import java.math.BigInteger;
import java.util.Scanner;

public class aplusb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
