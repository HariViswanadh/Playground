#include<iostream>
#include<string>
using namespace std;
int main()
{
  string x;
  getline(cin,x);
  int y=x.length();
  cout<<"The number of letters in the name is "<<y;
}