package com.yjh.blue_bridge;
/*问题描述
        　　Huffman树在编码中有着广泛的应用。在这里，我们只关心Huffman树的构造过程。
        　　给出一列数{pi}={p0, p1, …, pn-1}，用这列数构造Huffman树的过程如下：
        　　1. 找到{pi}中最小的两个数，设为pa和pb，将pa和pb从{pi}中删除掉，然后将它们的和加入到{pi}中。这个过程的费用记为pa + pb。
        　　2. 重复步骤1，直到{pi}中只剩下一个数。
        　　在上面的操作过程中，把所有的费用相加，就得到了构造Huffman树的总费用。
        　　本题任务：对于给定的一个数列，现在请你求出用该数列构造Huffman树的总费用。

        　　例如，对于数列{pi}={5, 3, 8, 2, 9}，Huffman树的构造过程如下：
        　　1. 找到{5, 3, 8, 2, 9}中最小的两个数，分别是2和3，从{pi}中删除它们并将和5加入，得到{5, 8, 9, 5}，费用为5。
        　　2. 找到{5, 8, 9, 5}中最小的两个数，分别是5和5，从{pi}中删除它们并将和10加入，得到{8, 9, 10}，费用为10。
        　　3. 找到{8, 9, 10}中最小的两个数，分别是8和9，从{pi}中删除它们并将和17加入，得到{10, 17}，费用为17。
        　　4. 找到{10, 17}中最小的两个数，分别是10和17，从{pi}中删除它们并将和27加入，得到{27}，费用为27。
        　　5. 现在，数列中只剩下一个数27，构造过程结束，总费用为5+10+17+27=59。
        输入格式
        　　输入的第一行包含一个正整数n（n<=100）。
        　　接下来是n个正整数，表示p0, p1, …, pn-1，每个数不超过1000。
        输出格式
        　　输出用这些数构造Huffman树的总费用。
        样例输入
        5
        5 3 8 2 9
        样例输出
        59*/


import java.util.Scanner;

public class Huffman {
    //总的思路是找出最小值存储在arr[0]，找出第二小值存储在arr[1]中，将两者相加的和存储在arr[0]中，同时使用count记录费用。
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int t = 0;
        int count = 0;
        for(int k = 0; k < n-1; k++){

            for(int i = 0; i < arr.length; i++){	//找出最小值存在arr[0]中;
                if(arr[i] != 0 && arr[i] <= arr[0]){
                    t = arr[i];
                    arr[i] = arr[0];
                    arr[0] = t;
                }
            }

            for(int i = 2; i < arr.length; i++){	//找出剩余值中最小值存在arr[1]中;

                if(arr[1] == 0 && arr[i] != 0){		//如果arr[1]为0，则将任意一个非零值给arr[1]方便比较;
                    arr[1] = arr[i];
                    arr[i] = 0;						//注意将arr[1]中的0值赋给arr[i];
                }

                if(arr[i] != 0 && arr[i] <= arr[1]){
                    t = arr[i];
                    arr[i] = arr[1];
                    arr[1] = t;
                }
            }

            count += arr[0] + arr[1];
            arr[0] = arr[0] + arr[1];
            arr[1] = 0;		//arr[1]将值加给arr[0]后不参与后面的运算，故应当赋值为0;

        }

        System.out.print(count);

    }
}
