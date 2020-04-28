#include<iostream>
int main()
{
  int x,y,s,i=1,j=0;
  std::cin>>x;
  std::cin>>y;
  s=x+y;
  while(i<s)
  {
    if(s%i==0)
    {
      j=j+i;
    }
    i++;
  }
  if(j==s)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}
  
  