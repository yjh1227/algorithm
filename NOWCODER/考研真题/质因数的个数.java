package Algorithm_Training.考研真题;
/*
题目描述
求正整数N(N>1)的质因数的个数。 相同的质因数需要重复计算。如120=2*2*2*3*5，共有5个质因数。
输入描述:
可能有多组测试数据，每组测试数据的输入是一个正整数N，(1<N<10^9)。
输出描述:
对于每组数据，输出N的质因数的个数。
示例1
输入
120
输出
5
 */
import java.util.Scanner;

public class 质因数的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
            long num = sc.nextLong();
            for (long i=2;i<=Math.sqrt(num);i++){
                while(num%i==0){
                    num/=i;
                    count++;
                }
                if (num<=1){
                    break;
                }
            }
            if (num>1)
                count++;
            System.out.println(count);
    }
}
