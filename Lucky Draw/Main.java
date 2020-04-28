#include<iostream>
using namespace std;
int main()
{
  int a,b=0;
  cin>>a;
  for(int i=1;i<=a;i++)
    if(a%i==0)
      b++;
  if(b==2)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}