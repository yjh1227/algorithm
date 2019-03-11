package Algorithm_Training.华为机试;
/*
题目描述
实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
输入描述:
字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。

输出描述:
删除字符串中出现次数最少的字符后的字符串。

示例1
输入
abcdd
输出
dd
 */
import java.util.*;

public class 删除字符串中出现次数最少的字符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            char[] c=str.toCharArray();
            int[] arr=new int[26];
            for(int i=0;i<c.length;i++){
                int n=(int)(c[i]-'a');
                arr[n]++;
            }

            int min=Integer.MAX_VALUE;
            for (int k=0;k<arr.length;k++){
                if (arr[k]<min&&arr[k]!=0){
                    min=arr[k];
                }
            }


            for (int j=0;j<c.length;j++){
                int n=(int)(c[j]-'a');
                if (arr[n]!=min){
                    System.out.print(c[j]);
                }
            }
            System.out.println();

        }
    }
}
