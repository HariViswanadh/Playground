#include<iostream>
int bacteria(int x,int y,int z)
{
    int m=1;
  while(y!=0)
  {
    m=m*x;
    y--;
      
  }
  return m;
}
  
int main()
{
    int m,n,req,x,b;
    std::cin>>m>>n>>req;
    b=bacteria(m,n,req);
    if(b>=req)
    {
      std::cout<<"Doctor, you can proceed with your experiment.";
    }
    else
    {
      std::cout<<"Sorry Doctor! You need more bacteria.";
    }
    return 0;
}