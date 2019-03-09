package Algorithm_Training.考研真题;
/*
题目描述
输入N个（N<=10000）数字，求出这N个数字中的最大值和最小值。每个数字的绝对值不大于1000000。
输入描述:
输入包括多组测试用例，每组测试用例由一个整数N开头，接下去一行给出N个整数。
输出描述:
输出包括两个整数，为给定N个数中的最大值与最小值。
示例1
输入
复制
5
1 2 3 4 5
3
3 7 8
输出
复制
5 1
8 3
 */
import java.util.Scanner;

public class 求最大最小数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            int[] arr = new int[N];
            for (int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int max=0;
            int min=65000;
            for (int j=0;j<arr.length;j++){
                if (arr[j]>max){
                    max=arr[j];
                }

                if (arr[j]<min){
                    min=arr[j];
                }
            }

            System.out.println(max+" "+min);
        }
    }
}
