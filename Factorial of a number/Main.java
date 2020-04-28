#include<iostream>
int main(){
  // Type your code here
  int x,fact=1,i;
  std::cin>>x;
  for(i=1;i<=x;i++)
  {
    fact=fact*i;
  }
  std::cout<<fact;
}