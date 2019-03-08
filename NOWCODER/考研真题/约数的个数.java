package Algorithm_Training.考研真题;
/*
题目描述
输入n个整数,依次输出每个数的约数的个数
输入描述:
输入的第一行为N，即数组的个数(N<=1000)
接下来的1行包括N个整数，其中每个数的范围为(1<=Num<=1000000000)
当N=0时输入结束。
输出描述:
可能有多组输入数据，对于每组输入数据，
输出N行，其中每一行对应上面的一个数的约数的个数。
示例1
输入
复制
5
1 3 4 6 12
输出
复制
1
2
3
4
6
 */
import java.util.Scanner;

public class 约数的个数 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int num = 0;
            for(int i=0; i<n; i++){
                num = in.nextInt();
                System.out.println(divisorNum(num));
            }
        }
        in.close();
    }
    private static int divisorNum(int n){
        int answer = 0;
        int i;
        for(i=1; i*i<n; i++){
            if(n % i == 0)
                answer += 2;
        }
        if(i*i == n)
            answer++;
        return answer;
    }

}
