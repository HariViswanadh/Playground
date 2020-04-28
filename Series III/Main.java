#include <iostream>

using namespace std;

int main()
{
    int x,sol=6,z=5;
    cin>>x;
    cout<<sol<<" ";
    for(int i=1;i<x;i++)
    {
        sol=sol+z;
        z=z+5;
        cout<<sol<<" ";
    }
}
