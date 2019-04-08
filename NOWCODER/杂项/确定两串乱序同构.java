package Test;
import java.util.*;
//This is nowcoder
//is This nowcoder
/*
题目描述
        给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串中的空格。

        给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。保证两串的长度都小于等于5000。

        测试样例：
        "This is nowcoder","is This nowcoder"
        返回：true
        "Here you are","Are you here"
        返回：false
*/



public class Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringA=sc.nextLine();
        String stringB=sc.nextLine();

        System.out.println(checkSam(stringA,stringB));

    }


    public static boolean checkSam(String stringA, String stringB) {
        // write code here

        char[] ch1=stringA.toCharArray();
        char[] ch2=stringB.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

}
