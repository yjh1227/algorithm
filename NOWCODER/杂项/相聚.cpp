链接：https://ac.nowcoder.com/acm/contest/558/J
来源：牛客网

小猫在研究网格图。
小猫在研究联通性。
给定一张N×M的网格图，只含字符0和1，问1形成的联通块有多少个。
两个1是联通的，当且仅当其中一个位于另一个的上、下、左、右四个方向之一。
输入描述:
第一行一个正整数T，表示数据组数。

每组数据的第一行两个正整数N,M，表示矩阵的长和宽。

接下来N行，每行M个字符0或1。
输出描述:
T行，每行一个正整数，表示每组数据的答案。
示例1
输入
复制
2
3 5
10101
01110
10101
3 3
111
010
111
输出
复制
5
1
备注:
1≤T,N,M≤50




#include <iostream>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <algorithm>
#include <vector>
#include <set>
#include <map>

using namespace std;
const int maxn = 505;
int m, n;
int vis[maxn][maxn];
char a[maxn][maxn];
int dir[4][2] = {0, 1, -1, 0, 0, -1, 1, 0};

void dfs(int x, int y) {
    for (int i = 0; i < 4; i++) {
        int tx = x + dir[i][0];
        int ty = y + dir[i][1];
        if (tx < 0 || tx >= m || ty < 0 || ty >= n)
            continue;
        if (!vis[tx][ty] && a[tx][ty] != '0') {
            vis[tx][ty] = 1;
            dfs(tx, ty);
        }
    }
    return;
}

int main() {
    int num;
    cin >> num;
    while (num--) {
        int cnt = 0;
        scanf("%d %d", &m, &n);
        for (int i = 0; i < m; i++) {
            scanf("%s", a[i]);
        }
        memset(vis, 0, sizeof vis);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != '0' && !vis[i][j]) {
                    vis[i][j] = 1;
                    cnt++;
                    dfs(i, j);
                }
            }
        }
        printf("%d\n", cnt);
    }
    return 0;
}
