#include<iostream>
int main()
{
  int x,y=11,sol;
    std::cin>>x;
    for(int i=1;i<=x;i++)
    {
        sol=y*y;
        y=y+4;
        std::cout<<sol<<" ";
    }
}