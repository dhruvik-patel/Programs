#include<iostream>
using namespace std;
int main()
{
    int n,m,a;
    cout<<"Enter any integer : ";
    cin>>n;
    while(n>0)
    {
        a=n%10;
        m=n/10;
        cout<<a;
        n=m;
    }
    return 0;
}
