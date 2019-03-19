package Algorithm_Training.华为机试;
/*
题目描述
输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。


 */

import java.util.*;
public class 输入一行字符分别统计出包含英文字母空格数字和其它字符的个数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch=sc.nextLine().toCharArray();
            int count1=0;
            int count2=0;
            int count3=0;
            for (int i = 0; i < ch.length; i++) {
                if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z'))
                    count1++;
                else if(ch[i]==' ')
                    count2++;
                else if(ch[i]>='0' && ch[i]<='9')
                    count3++;
            }
            System.out.println(count1);
            System.out.println(count2);
            System.out.println(count3);
            System.out.println(ch.length-count1-count2-count3);
        }
        sc.close();
    }
}
