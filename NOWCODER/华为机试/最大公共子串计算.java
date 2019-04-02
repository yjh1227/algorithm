package Algorithm_Training.华为机试;
/*
题目描述
题目标题：

计算两个字符串的最大公共字串的长度，字符不区分大小写

详细描述：

接口说明

原型：

int getCommonStrLength(char * pFirstStr, char * pSecondStr);

输入参数：

     char * pFirstStr //第一个字符串

     char * pSecondStr//第二个字符串
 

输入描述:
输入两个字符串

输出描述:
输出一个整数

示例1
输入
asdfas werasdfaswer
输出
6
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 公共子串计算 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String s=getMaxSubstring(str2,str1);
        System.out.println(s.length());


        //数组越界,不好控制
        /*ArrayList list = new ArrayList();

        if (str2.contains(str1)) {
            System.out.println(str1.length());
        } else {
            for (int i = 0; i < str2.length(); i++) {
                int count = 0;
                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(j) == str2.charAt(i)) {
                        count++;
                        i++;
                    }
                }
                if (count > 0) {
                    list.add(count);
                }
            }
            Collections.sort(list);
            System.out.println(list.get(list.size() - 1));
        }*/
    }

    private static String getMaxSubstring(String s1, String s2) {

        String max=null;
        String min=null;
        max=(s1.length()>s2.length())?s1:s2;

        min=max.equals(s1)?s2:s1;

        for (int i = 0; i < min.length(); i++) {
            for (int a = 0, b=min.length()-i; b!=min.length()+1;a++,b++) {
                String sub=min.substring(a,b);
                if (max.contains(sub)){
                    return sub;
                }
            }
        }

        return null;
    }
}
