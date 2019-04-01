/*
 * 八皇后
查看 提交 统计 提问
总时间限制: 1000ms 内存限制: 65536kB
描述
会下国际象棋的人都很清楚：皇后可以在横、竖、斜线上不限步数地吃掉其他棋子。如何将8个皇后放在棋盘上（有8 * 8个方格），使它们谁也不能被吃掉！这就是著名的八皇后问题。
对于某个满足要求的8皇后的摆放方法，定义一个皇后串a与之对应，即a=b1b2...b8，其中bi为相应摆法中第i行皇后所处的列数。已经知道8皇后问题一共有92组解（即92个不同的皇后串）。
给出一个数b，要求输出第b个串。串的比较是这样的：皇后串x置于皇后串y之前，当且仅当将x视为整数时比y小。
输入
第1行是测试数据的组数n，后面跟着n行输入。每组测试数据占1行，包括一个正整数b(1 <= b <= 92)
输出
输出有n行，每行输出对应一个输入。输出应是一个正整数，是对应于b的皇后串。
样例输入
2
1
92
样例输出
15863724
84136275
 */

#include "iostream"
#include "memory.h"
using namespace std;

int n,ind;
bool row[12],dia1[25],dia2[25];
int ans[96][10];


void Dfs(int q)
{
    if(q>8)
    {
        ind++;
        for(int i=1;i<=8;i++)
            ans[ind][i]=ans[ind-1][i];
        return;
    }

    for(int r=1;r<=8;r++)
    {
        if(row[r]&&dia1[r+q]&&dia2[8-q+r])
        {
            row[r]=dia1[r+q]=dia2[8-q+r]=false;
            ans[ind][q]=r;
            Dfs(q+1);
            row[r]=dia1[r+q]=dia2[8-q+r]=true;
        }
    }
}

int main()
{
    memset(row,true,sizeof(row));
    memset(dia1,true,sizeof(dia1));
    memset(dia2,true,sizeof(dia2));
    ind=1;
    Dfs(1);

    scanf("%d",&n);

    int i,x;
    while(n--)
    {
        scanf("%d",&x);
        for(i=1;i<=8;i++)
            printf("%d",ans[x][i]);
        cout<<endl;
    }
}
