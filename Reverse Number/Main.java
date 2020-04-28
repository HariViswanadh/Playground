#include <iostream>
int main() 
{
  int x,n,rev=0;
  std::cin>>x;
  while(x!=0)
  {
    n=x%10;
    rev=rev*10+n;
    x=x/10;
  }
  std::cout<<rev;
}