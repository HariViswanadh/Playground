#include<iostream>
int main()
{
  int maxw,w;
  std::cin>>maxw;
  std::cin>>w;
  if(w<maxw)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(w==maxw)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    std::cout<<"Sorry, you can't enter";
  }
}
  
  