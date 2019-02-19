import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
//      正整数m, n，表示矩阵的行和列
        int m = in.nextInt();
        int n = in.nextInt();
//      初始化，赋值给矩阵
        int[][] a = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                a[i][j] = in.nextInt();
            }
        } 
//      tot：已经取了多少个数；x是矩阵的行坐标；y是矩阵的列坐标
        int tot = 0, x = -1, y = 0;
//      当取了mn个数后，就退出循环；while判断时，当tot==0时，执行到下面，就会取到1个数；当tot==mn-1时，执行到下面，就取了mn个数。
        while(tot < m * n)
        //取一个数即走一步；先改变对应方向的单坐标，取到数后就立即打印出来；将这个位置逻辑上置为已走过，tot 也要++
        {//能不能走要看两点：下一步是否超出了边界；下一步是否已经走过了。
//          向下走 第一个取（0,0），,向下走之前，先看看能不能走
            while(x + 1 < m && a[x + 1][y] != -1)
            {
                System.out.print(a[++x][y]);
                if(tot != m * n - 1)
                {
                    System.out.print(" ");
                }
                a[x][y] = -1;
                tot++;
            }
//          向右走 ,向右走之前，先看看能不能走
            while(y + 1 < n && a[x][y + 1] != -1)
            {
                System.out.print(a[x][++y]);
                if(tot != m * n - 1)
                {
                    System.out.print(" ");
                }
                a[x][y] = -1;
                tot++;
            }
//          向上走
            while(x - 1 >= 0 && a[x - 1][y] != -1)
            {
                System.out.print(a[--x][y]);
                if(tot != m * n - 1)
                {
                    System.out.print(" ");
                }
                a[x][y] = -1;
                tot++;
            }
//          向左走
            while(y - 1 >= 0 && a[x][y - 1] != -1)
            { 
                System.out.print(a[x][--y]);
                if(tot != m * n - 1)
                {
                    System.out.print(" ");
                }
                a[x][y] = -1;
                tot++;
            }
        }
    }
}
