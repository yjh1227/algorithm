package Algorithm_Training.考研真题;
/*
题目描述
用一维数组存储学号和成绩，然后，按成绩排序输出。
输入描述:
输入第一行包括一个整数N(1<=N<=100)，代表学生的个数。
接下来的N行每行包括两个整数p和q，分别代表每个学生的学号和成绩。
输出描述:
按照学生的成绩从小到大进行排序，并将排序后的学生信息打印出来。
如果学生的成绩相同，则按照学号的大小进行从小到大排序。
示例1
输入
3
1 90
2 87
3 92
输出
2 87
1 90
3 92
 */



//解题思路,使用面向对象的思想,重写了Comparator

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class 成绩排序2 {

    private static class MyComprator implements Comparator {


        @Override
        public int compare(Object o1, Object o2) {
            Student st1 = (Student) o1;
            Student st2 = (Student) o2;

            if (st1.score != st2.score) {
                return st1.score > st2.score ? 1 : -1;
            } else {
                return st1.id > st2.id ? 1 : -1;
            }
        }
    }

    static class Student {
        int id;
        int score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Student[] st = new Student[N];
        for (int i = 0; i < N; i++) {
            st[i]=new Student();
            st[i].id = sc.nextInt();
            st[i].score = sc.nextInt();
        }

        Arrays.sort(st, new MyComprator());

        for (int i = 0; i < N; i++) {
            System.out.println(st[i].id+" "+st[i].score);
        }
    }
}
