#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int c,a,b=0;
  cin>>a;
  b=a%10;
  a=a/1000;
  c=a%10;
  b+=c;
  cout<<b;
  
}