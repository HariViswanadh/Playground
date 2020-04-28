#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int weight,adults,children,x,y;
  std::cin>>weight;
  std::cin>>adults;
  std::cin>>children;
  x=adults*72;
  y=children*30;
  if(x+y <= weight)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}
  