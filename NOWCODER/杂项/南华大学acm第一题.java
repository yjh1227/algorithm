package 杂项.huazhong;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int num = sc.nextInt();
            boolean flag = false;
            int k = 0;
            flag = isPrime(num);
            if (flag == true) {
                System.out.println(num + " " + 0);
            } else {
                k = like(num);
                System.out.println(num + " " + k);
            }
            n--;
        }
    }

    private static int like(int num) {
        int count1 = 0;
        int count2 = 0;
        int num1 = num;
        int num2 = num;
        boolean flag1 = isPrime(num1);
        boolean flag2 = isPrime(num2);
        while (!flag1) {
            num1--;
            flag1 = isPrime(num1);

            count1++;
        }
        while (!flag2) {
            num2++;
            flag2 = isPrime(num2);
            count2++;
        }
        return Math.min(count1, count2);
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        int limit = (int) (Math.sqrt(num) + 1);
        for (int i = 3; i <= limit; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }

}
