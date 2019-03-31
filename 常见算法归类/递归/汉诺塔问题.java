/*
描述：汉诺塔由三根柱子（分别用A B C表示）和n个大小互不相同的空心盘子组成。一开始n个盘子都摞在柱子A上，
大的在下面，小的在上面，形成了一个塔状的锥形体。

对汉诺塔的一次合法的操作是指：从一根柱子的最上层拿一个盘子放到另一根柱子的最上层，同时要保证被移
动的盘子一定放在比它更大的盘子上面（如果移动到空柱子上就不需要满足这个要求）

思路：针对汉诺塔问题，一般采用递归思想，将大问题转化成小问题，然后对小问题求解，然后考虑好边界条件即可

当只有一个盘子的时候，只移动一次就行了，即A->c
当有两个盘子的时候则需要 A->B A->C B->C
当有N个盘子的时候，把除了最底下的一块之外的一部分看成整体，通过递归转化成2个盘子的情况


递归式:f(n) = 1+2f(n-1)

 */
import java.util.Scanner;

public class 汉诺塔问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        char a=s.charAt(0);

        String s1=sc.next();
        char b=s1.charAt(0);

        String s2=sc.next();
        char c=s2.charAt(0);

        Hanoi(n,a,b,c);

    }

    private static void Hanoi(int N,char Src,char tmp,char Dst) {
        if (N==1){
            System.out.println(N+":"+Src+"->"+Dst);
            return;
        }
        Hanoi(N-1,Src,Dst,tmp);
        System.out.println(N+":"+Src+"->"+Dst);
        Hanoi(N-1,tmp,Src,Dst);
    }
}
