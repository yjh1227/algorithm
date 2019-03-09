package Algorithm_Training.考研真题;
/*
题目描述
    对输入的n个数进行排序并输出。
输入描述:
    输入的第一行包括一个整数n(1<=n<=100)。
    接下来的一行包括n个整数。
输出描述:
    可能有多组测试数据，对于每组数据，将排序后的n个整数输出，每个数后面都有一个空格。
    每组测试数据的结果占一行。
示例1
输入
复制
4
1 4 3 2
输出
复制
1 2 3 4 
 */
import java.util.Scanner;

public class 排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];

        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        for (int j=0;j<arr.length;j++){
            for (int k=j+1;k<arr.length;k++){
                if (arr[j]<arr[k]){
                    arr[j]=arr[j];
                }else{
                    int min;
                    min=arr[k];
                    arr[k]=arr[j];
                    arr[j]=min;
                }
            }
        }

        for (int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        }

    }
}
