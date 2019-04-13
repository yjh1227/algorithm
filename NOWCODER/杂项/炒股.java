链接：https://ac.nowcoder.com/acm/contest/625/I
来源：牛客网

题目描述 
攒机一时爽，一直攒机一直爽。

沉迷攒机的胡老师很快就发现，他每天只能靠吃泡面过活了。为了改善伙食，同时继续攒机大业，胡老师决定下海炒股。

胡老师有特别的炒股技巧。首先他会选定一支他看好的股票，然后永远只买这一支股票。此外，胡老师每天要么只买入股票要么只卖出股票，且出于某种不为人知的原因，胡老师手上最多只能持有 1 股的股票。胡老师每天会根据当天的股价及手上的持股数决定是买入还是卖出股票，需要注意的是，只要胡老师选择了买入或卖出，那么一定可以按当天的价格买入或卖出股票。

炒股需要本金，但胡老师的钱都拿去攒机了，于是他去找 CC 借了一大笔钱（这笔钱可以视为无穷多），并约定 n 天之后归还。另一方面，为最大化 n 天内的收益，胡老师通过不为人知的 py 交易获取了接下来 n 天每天的股票价格。

在一开始，胡老师手上没有持有股票。胡老师想知道，在n天之后他最多能靠炒股赚多少钱。

输入描述:
第一行是一个整数
n
 
(
1
≤
n
≤
5
×
10
5
)
n (1≤n≤5×105)，表示天数。

接下来 n 行给出了接下来 n 天内胡老师看好的股票每天的价格，其中第 i 行是一个整数 
a
i
 
(
1
≤
a
i
≤
10
6
)
ai (1≤ai≤106)，表示该股票在第 i 天的价格。

输出描述:
输出一行一个整数 ans，表示 n 天之后胡老师最多能赚的钱数。
示例1
输入
复制
5
1
3
2
6
4
输出
复制
6


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
            }
            int s=0;
            long sum=0;
            boolean flag=true;
            for(int i=0;i<n-1;i++) {
                if(flag==false&&s<a[i]) {
                    sum+=a[i]-s;
                    flag=true;
                }
                if(flag&&a[i]<a[i+1]) {
                    s=a[i];
                    flag=false;
                }
            }
            if(flag==false&&s<a[n-1]) {
                sum+=a[n-1]-s;
            }
            System.out.println(sum);
        }
    }
}


