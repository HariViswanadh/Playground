#include <iostream>
#include<string.h>
int main()
{
  char str[100];
  int i;
  std::cin.getline(str,100);
  for(i=strlen(str)-1;i>=0;i--)
  {
    std::cout<<str[i];
  }
}