package Algorithm_Training.考研真题;
/*


输入一个ip地址串，判断是否合法。
输入描述:
每行有一个IP地址，IP地址的形式为a.b.c.d，其中a、b、c、d都是整数。


输出描述:
可能有多组测试数据，对于每组数据，如果IP地址合法则输出"Yes!”，否则输出"No!”。

合法的IP地址为：
a、b、c、d都是0-255的整数。
 */
import java.util.Scanner;

public class IP地址 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            String[] split = str.split("\\.");
            if (split.length!=4){
                System.out.println("No!");
            }
            else{
                for (int i=0;i<split.length;i++){
                    int value=Integer.parseInt(split[i]);
                    if (value<0||value>255){
                        System.out.println("No!");
                        return;
                    }
                }
                System.out.println("Yes!");

            }

        }
    }
}
