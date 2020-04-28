#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit,cost;
  std::cin>>unit;
  if(unit<=200)
  {
    cost=0.5*unit;
    std::cout<<"Rs."<<cost;
  }
  else if(unit>200 && unit<=400)
  {
    cost=0.65*unit+100;
    std::cout<<"Rs."<<cost;
  }
  else if(unit>400 && unit<=600)
  {
    cost=0.80*unit+200;
    std::cout<<"Rs."<<cost;
  }
  else if(unit>600)
  {
    cost=1.25*unit+425;
    std::cout<<"Rs."<<cost;
  }
}