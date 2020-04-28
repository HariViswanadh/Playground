#include<iostream>
int main()
{
  // Type your code here
  int x,count=0;
  std::cin>>x;
  do
  {
    x=x/10;
    count++;
  }while(x!=0);
  std::cout<<count;
}