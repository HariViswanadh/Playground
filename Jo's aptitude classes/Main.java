#include<iostream>
using namespace std;
int gcd(int,int,int);
int main()
{
  int a,b,c,res,res1;
  cin>>a>>b>>c>>res;
  res1=gcd(a,b,c);
  if(res1==res)
  {
    cout<<"Answer is correct.";
  }
  else
  {
    cout<<"Answer is wrong.";
  }
  return 0;
}

int gcd(int n,int m,int o)
{
  int small;
  if(n<m && n<o)
  {
    small=n;
  }
  else if(m<n && m<o)
  {
    small=m;
  }
  else
  {
    small=o;
  }
  
  while(small >=1)
  {
    if(n%small==0 && m%small==0 && o%small==0)
    {
      break;
    }
    small--;
  }
  return small;
}