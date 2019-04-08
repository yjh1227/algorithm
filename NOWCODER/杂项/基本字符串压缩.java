package Test;
/*
题目描述
利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。

给定一个string iniString为待压缩的串(长度小于等于10000)，保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。

测试样例
"aabcccccaaa"
返回："a2b1c5a3"
"welcometonowcoderrrrr"
返回："welcometonowcoderrrrr"
 */
import java.util.*;

public class Zipper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String iniString = sc.next();
        System.out.println(zipString(iniString));
    }

    public static String zipString(String iniString) {
        char[] c = iniString.toCharArray();
        String str2 = "";

        for (int i = 0; i < c.length - 1; i++) {
            int count = 1;
            int index = i;
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] == c[i]) {
                    count++;
                    index = j;              //标记与位置i处的字符一样的最后下标
                } else {
                    break;
                }
            }
            str2 += c[i] + "" + count;      //+"" : 变为字符串
            i = index;                  //i直接跳至最后下标处,因为下个循坏前i++,所以i的实际跳转位置是index+1
        }
        return str2.length() < iniString.length() ? str2 : iniString;
    }
}
