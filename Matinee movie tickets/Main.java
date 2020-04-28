#include<iostream>
int main()
{
    
    float mrg_show=10.15,matinee=13.30,eve_show=18.00,ngt_show=22.00,x;
    int age;
    std::cin>>age;
    std::cin>>x;
    if(age>13)
    {
        if(x==mrg_show)
        {
            std::cout<<"$8.00";
        }
        else if(x==matinee)
        {
            std::cout<<"$5.00";
        }
    }
    else
    {
        if(x==mrg_show)
        {
            std::cout<<"$4.00";
        }
        else if(x==matinee)
        {
            std::cout<<"$2.00";
        }
    }
}

