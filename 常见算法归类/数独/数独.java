数独是一个我们都非常熟悉的经典游戏，运用计算机我们可以很快地解开数独难题，现在有一些简单的数独题目，请编写一个程序求解。


输入描述:
输入9行，每行为空格隔开的9个数字，为0的地方就是需要填充的。


输出描述:
输出九行，每行九个空格隔开的数字，为解出的答案。

分析：

      这里的数独就是9行9列的数组，满足每一行、每一列、每一个粗线宫内的数字均含1-9，不重复。

 这里粗线宫要分清楚，开始我以为是任意的九宫格内的1-9都不重复，实际这里是自己想复杂了，只需要满足如下图所示的阴影区域划分出的九个宫格1-9不重复就好了，总共就9共宫格，不是自己理解的7*7=49个小宫格，这里要弄清楚。

   解题思路：DFS深度填数检测+回溯法

     1，先把有数字的地方设置标记位为true

     2，循环遍历数组中没有标记位true的地方，也就是需要填数的地方

           如果当前为0，即a[i][j]==0，判断当前所在的九宫格，然后从数字1-9依次检测是否在行、列、宫中唯一

                                  满足唯一的话，则吧数字赋值给a[i][j]=l+1;然后继续深度遍历为true的话就返回true,否则回溯a[i][j]==0等

                                  不满足满足唯一则判断下一个数字，直到1-9都判断不满足则返回false,会回溯到上一层

       如果当前没有0，说明都已经填满且符合唯一条件，则返回true;结束





具体代码如下;

    

<pre name="code" class="java">import java.util.Stack;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int[][]a=new int[9][9];
			boolean[][] cols = new boolean[9][9];
		    boolean[][] rows = new boolean[9][9];
		    boolean[][] blocks = new boolean[9][9];//九大宫的九个数字
 
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					a[i][j]=sc.nextInt();
					if(a[i][j]!=0){
						int k = i/3*3+ j/3;//划分九宫格,这里以行优先，自己也可以列优先
						int val=a[i][j]-1;
						  rows[i][val] = true;
				            cols[j][val] = true;
				            blocks[k][val] = true;
					}
				}
			}//数据装载完毕	
			DFS(a, cols, rows, blocks);
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println(a[i][8]);
			}
		}
	}
	
	
	
	
   public static boolean DFS(int[][] a,boolean[][] cols,boolean[][] rows,boolean[][] blocks) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(a[i][j]==0){
					int k=i/3*3+j/3;
					for (int l = 0; l < 9; l++) {
						if(!cols[j][l]&&!rows[i][l]&&!blocks[k][l]){//l对于的数字l+1没有在行列块中出现
							   rows[i][l] = cols[j][l] = blocks[k][l] = true;
		                        a[i][j] = 1 + l;//下标加1
		                        if(DFS(a, cols, rows, blocks)) return true;//递进则返回true
		                        rows[i][l] = cols[j][l] = blocks[k][l] = false;//递进失败则回溯
		                        a[i][j] = 0;  
						}
					}
					return false;//a[i][j]==0时，l发现都不能填进去
				}//the end of a[i][j]==0
			}
		}
		return true;//没有a[i][j]==0,则返回true
	}
}

原文：https://blog.csdn.net/hll174/article/details/51090461 
