#include<iostream>
using namespace std;
int main()
{
  int w,x,y,profit;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  profit=x*w-y*w-100;
  std::cout<<profit;
}