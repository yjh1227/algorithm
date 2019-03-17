package Algorithm_Training.华为机试;
/*
题目描述
功能: 求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1

输入: 一个byte型的数字

输出: 无

返回: 对应的二进制数字中1的最大连续数
输入描述:
输入一个byte数字

输出描述:
输出转成二进制之后连续1的个数

示例1
输入
3
输出
2
 */
import java.util.Scanner;

public class 求最大连续bit数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Integer b = sc.nextInt();
            String string = Integer.toBinaryString(b);
            while (string.length() < 8) {
                string = "0" + string;
            }

            int count = 0;
            int max=0;
//            System.out.println(string);
            if (string.length() == 8) {
                char str = '1';
                for (int i = 0; i < string.length() - 1; i++) {
                    if (str == string.charAt(i) && string.charAt(i) == string.charAt(i + 1)) {
                        count++;
                    }
                    if (count>max){
                        max=count;
                    }
                    else{
                        count=0;
                    }

                }
                System.out.println(max+1);
            }

        }

    }
}
