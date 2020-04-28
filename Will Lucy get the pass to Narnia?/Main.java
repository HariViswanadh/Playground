#include<iostream>
using namespace std;
int main()
{
  int x,y,c,ch;
  cout<<"Enter first number : Enter second number : Menu\n";
  cout<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder";
  cin>>x>>y>>ch;
  switch(ch)
  {
    case 1:
    c=x+y;
    cout<<"\n"<<c;
      break;
   case 2:
    c=x-y;
    cout<<"\n"<<c;
      break;
    case 3:
  c=x*y;
  cout<<"\n"<<c;
      break;
    case 4:
  c=x/y;
  cout<<"\n"<<c;
      break;
    case 5:
    c=x%y;
  cout<<"\n"<<c;
      break;
    default:
      cout<<"\nInvalid operation";
    
}
}
    