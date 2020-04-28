#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a1,b1,c1,b2,a2,c2,a3,b3,c3,f1,s1,am1,f2,s2,am2;
  std::cin>>a1;
  std::cin>>b1;
  std::cin>>c1;
  std::cin>>a2;
  std::cin>>b2;
  std::cin>>c2;
  std::cin>>a3;
  std::cin>>b3;
  std::cin>>c3;
  f1=a1*b1/100;
  s1=a2*b2/100;
  am1=a3*b3/100;
  f2=a1-f1+c1;
  s2=a2-s1+c2;
  am2=a3-am1+c3;
  std::cout<<"In Flipkart Rs."<<f2<<"\n";
  std::cout<<"In Snapdeal Rs."<<s2<<"\n";
  std::cout<<"In Amazon Rs."<<am2<<"\n";
  if(f2 <= s2 && f2 <= am2)
  {
    std::cout<<"He will prefer Flipkart"<<"\n";
  }
  else if(s2 <= f2 &&  s2 <= am2)
  {
    std::cout<<"He will prefer Snapdeal"<<"\n";
  }
  else
  {
    std::cout<<"He will prefer Amazon";
  }
}