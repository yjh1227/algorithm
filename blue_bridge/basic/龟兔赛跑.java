import java.util.Scanner;

public class 龟兔赛跑 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        int l = sc.nextInt();
        int s1 = 0, s2 = 0, time = 0;
        while (s1 < l && s2 < l) {
            if (s1 - s2 >= t) {
                if ((l - s2) / v2 < s) {
                    time += (l - s2) / v2;
                    s2 = l;
                } else {
                    time += s;
                    s2 += v2 * s;
                }
            } else {
                time++;
                s1 += v1 * 1;
                s2 += v2 * 1;
            }
        }

        if (s1 > s2) {
            System.out.println("R");
        } else if (s1 < s2) {
            System.out.println("T");
        } else {
            System.out.println("D");
        }
        System.out.println(time);

    }
}
