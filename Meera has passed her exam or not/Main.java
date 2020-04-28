#include<iostream>
using namespace std;
int main()
{
  int n,i,m,found=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>m;
  for(i=0;i<n;i++)
  {
    if(a[i]==m)
    {
      found=1;
    }
  }
  
  if(found==1)
  {
    cout<<"She passed her exam";
  }
  else
  {
    cout<<"She failed";
  }
  
  return 0;
}