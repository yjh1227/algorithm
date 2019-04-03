/*国王有一块神奇土地
第一天可以产a吨粮食，第二天会变成前一天的a倍，以此类推。
n天后大臣准备把这些粮食尽可能多的平均分给b个城池
为了方便，每个城池分到的粮食都是整吨整吨哒！
剩下的粮食国王准备贪污
国王能贪到多少吨粮食呢？
*/


#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll b;
ll fpow(ll x,ll n){
    ll ans=1;
    while(n){
        if(n&1) ans=ans*x%b;
        x=x*x%b;
        n >>=1;
    }
    return ans;
}
int main(){
    int t;
    cin>>t;
    while(t--){
        ll a,n;
        cin>>a>>n>>b;
        cout<<fpow(a,n)<<endl;
    }
}
