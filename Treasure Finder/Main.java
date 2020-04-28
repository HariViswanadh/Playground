#include<bits/stdc++.h>
using namespace std;
int main()
{
  vector<int> arr;
  int val,res;
  for(int i=0;i<3;i++)
  {
    cin>>val;
    arr.push_back(val);
}
  sort(arr.begin(),arr.end());
  cout<<"The treasure is in box which has number "<<arr[1]<<endl;
  if(arr[0]%arr[2]==0&&arr[1]%arr[2]==0)
  {
    res=arr[2];
  }
  else if(arr[0]%arr[1]==0&&arr[2]%arr[1]==0)
  {
    res=arr[1];
  }
  else if(arr[1]%arr[0]==0&&arr[2]%arr[0]==0)
  {
    res=arr[0];
  }
  else
  {
    res=1;
  }
  cout<<"The code to open the box is "<<res;
}
