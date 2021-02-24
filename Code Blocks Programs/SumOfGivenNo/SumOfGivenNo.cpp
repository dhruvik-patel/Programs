#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
    int n,a,b=0;
    cout<<"Enter any integer : ";
    cin>>n;
    while(n>0)
    {
        a=n%10;
        b=b+a;
        n=n/10;
    }
    cout<<"\nSum of the digit of given no. is : "<<b;
    return 0;
}
