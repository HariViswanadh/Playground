#include<iostream>
using namespace std;
int main()
{
  int a=3,b=4,c,d,e,f;
  cin>>c;
  cin>>d;
  if(a>c)
    e=a-c;
  else
    e=c-a;
  if(b>d)
    f=b-d;
    else
    f=d-b;
  if(e>f)
    cout<<e;
  else
    cout<<f;
}