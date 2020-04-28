#include<iostream>
using namespace std;
int main()
{
 
  int p,t,r,m;
  float i,d,a;
  cin>>p;
  cin>>r;
  cin>>t;
  i=(p*t*r)/100;
  m=p+i;
  d=(2*i)/100;
  a=m-d;
  cout<<int(i);
  cout<<"\n"<<m;
  cout<<"\n"<<d;
  cout<<"\n"<<a;

}