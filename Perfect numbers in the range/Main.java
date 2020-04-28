#include <iostream>
using namespace std;
int isPerfect(int num);
void printPerfect(int start, int end);
int main()
{
    int start, end;
    cin>>start;
    cin>>end;
    printPerfect(start, end);
 
    return 0;
}
 
int isPerfect(int num)
{
    int i, sum;
    sum = 0;
    for(i=1; i<num; i++)
    {
        if(num % i == 0)
        {
            sum += i;
        }
    }
    if(sum == num)
        return 1;
    else
        return 0;
}
void printPerfect(int start, int end)
{
    while(start <= end)
    {
        if(isPerfect(start))
        {
           cout<<start<<" ";
        }
 
        start++;
    }
}