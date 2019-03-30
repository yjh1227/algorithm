/*题目描述
给出一个整数序列S，其中有N个数，定义其中一个非空连续子序列T中所有数的和为T的“序列和”。 对于S的所有非空连续子序列T，求最大的序列和。 变量条件：N为正整数，N≤1000000，结果序列和在范围（-2^63,2^63-1）以内。
输入描述:
第一行为一个正整数N，第二行为N个整数，表示序列中的数。
输出描述:
输入可能包括多组数据，对于每一组输入数据，
仅输出一个数，表示最大序列和。
示例1
输入
复制
5
1 5 -3 2 4

6
1 -2 3 4 -10 6

4
-3 -1 -2 -5
输出
复制
9
7
-1
*/

package Algorithm_Training.考研真题;

import java.util.Arrays;
import java.util.Scanner;

public class 最大序列和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int maxSum = 0;
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[N];
            b[0] = a[0];
            for (int i = 1; i < N; i++) {
                if (b[i - 1] > 0) {
                    b[i] = b[i - 1] + a[i];
                } else {
                    b[i] = a[i];
                }
            }
            Arrays.sort(b);
            System.out.println(b[N - 1]);
        }
    }
}
