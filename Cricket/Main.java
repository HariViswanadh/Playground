#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float a,b,c,d,f,g,h;
  int e,i;
  cin>>a>>b>>c>>d;
  cout<<a/6<<"\n";
  e=d/6;
  f=(d-(6*e));
  g=e+(f*0.1);
  cout<<g<<"\n";
  cout<<fixed<<setprecision(1)<<c/g<<"\n";
  cout<<(b/(a/6));
  if((c/g)>(b/(a/6)))
    cout<<"\nEligible to Win";
  else
    cout<<"\nNot Eligible to Win";
}
