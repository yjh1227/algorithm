#include <iostream>
using namespace std;
int main(){
    int N,n;
    while(cin>>N){
        int a[1000]={0};
        while(N--){
            cin>>n;
            a[n]=1;
        }
        for(int i=0;i<1000;i++){
            if(a[i])
                cout<<i<<endl;
        }
    }
    return 0;
}
