package Algorithm_Training.考研真题;
/*
题目描述
输入任意4个字符(如：abcd)， 并按反序输出(如：dcba)
输入描述:
题目可能包含多组用例，每组用例占一行，包含4个任意的字符。
输出描述:
对于每组输入,请输出一行反序后的字符串。
具体可见样例。
示例1
输入
Upin
cvYj
WJpw
cXOA
输出
nipU
jYvc
wpJW
AOXc
 */
import java.util.Scanner;

public class 反序输出 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//方法一:不利用API
        while (sc.hasNext()){
            StringBuffer sb = new StringBuffer();

//            for (int i=str.length()-1;i>=0;i--){
//                System.out.print(str.charAt(i));
//            }
//            System.out.println();
//方法二:API
            sb.append(sc.next());
            System.out.println(sb.reverse());

        }

    }
}
