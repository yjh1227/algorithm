#include<bits/stdc++.h>
using namespace std;
map<string,int>cnt;
int main(){
	int n,m,sum=0;
	scanf("%d%d",&n,&m);
	for(int i=0;i<n;i++){
		string s=""; //也可以用：string s(m,'0');指定s的长度和初值 
		for(int j=0;j<m;j++){
			char x;cin>>x;// 
			s+=x; 
		}
		cnt[s]++;
	}
	int k=0;
	for(map<string,int>::iterator it=cnt.begin();it!=cnt.end();it++){
		//cout<<it->first<<endl;//it->first表示 map<string,int>中的string部分 
		string s="";			//it->second表示map<string,int>中的int部分 
		for(int i=0;i<m;i++)
			if(it->first[i]=='0')s+="1";
			else s+="0";//把该字符串转成相反字符串 
		sum+=cnt[s]*it->second;//cnt[s]：寻找转变后的相反字符串的个数  it->second:未转换字符串的个数  
	}
	cout<<sum/2<<endl;//因为乘了两次，第一次乘的时候并未对相反字符串处理，所以加了两次 
	return 0;
}
