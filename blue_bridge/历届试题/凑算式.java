package com.yjh.blue_bridge;
/*
凑算式

     B      DEF
A + --- + ------- = 10
     C      GHI

（如果显示有问题，可以参见【图1.jpg】）


这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。

比如：
6+8/3+952/714 就是一种解法，
5+3/1+972/486 是另一种解法。

这个算式一共有多少种解法？

注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。
 */
public class num7_3凑算式 {
    public static void main(String[] args) {
        seventeen();
    }

    /**
     * 凑算式(暴力破解)
     */
    public static void seventeen(){
        int count = 0;
        for (int a = 1;a <= 9;a++){
            for (int b = 1;b <= 9;b++){
                for (int c = 1;c <= 9;c++){
                    for (int d = 1;d <= 9;d++){
                        for (int e = 1;e <= 9;e++){
                            for (int f = 1;f <= 9;f++){
                                for (int g = 1;g <= 9;g++){
                                    for (int h = 1;h <= 9;h++){
                                        for (int i = 1;i <= 9;i++){
                                            int t = (g*100+h*10+i) * (a*c+b-10*c) + c*(d*100+e*10+f);
                                            if (isDifference(a,b,c,d,e,f,g,h,i) && (t == 0)){
                                                count++;
                                                System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isDifference(int A,int B,int C,int D,
                                       int E,int F,int G,int H,
                                       int I){
        int[] array = new int[9];
        array[0] = A;
        array[1] = B;
        array[2] = C;
        array[3] = D;
        array[4] = E;
        array[5] = F;
        array[6] = G;
        array[7] = H;
        array[8] = I;
        for (int i = 0;i < 9;i++){
            for (int j = i+1;j < 9;j++){
                if (array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;
    }

}
