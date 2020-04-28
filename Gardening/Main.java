
#include<iostream>
using namespace std;
int main()
{
  int x,y,z,t;
  cin>>x>>y>>z;
  t=(x*y)-(2*x);
  if(x<z&&z<=2*x)
  cout<<"It is a mango tree";
	else
    {
      if(t<z&&z<=t+x)
    cout<<"It is a mango tree";
      else
        cout<<"It is not a mango tree";
}
}