#include<iostream>
using namespace std;
int main()
{
    int n,a=0,b,c=0;
    loop:
    cout<<"Upto which value? \n";
    cin>>n;
    if(n<=0)
    {
        cout<<"Please choose n>0";
        goto loop;
    }
    else if(n==1)
        cout<<"\n0";
    else if(n==2)
        cout<<"\n0\t1";
    else
    {
        a=0,b=1;
        cout<<a<<"\t"<<b<<"\t";
        while((a+b)<=n)
        {
            c=a+b;
            a=b;
            b=c;
            cout<<c<<"\t";
        }
    }
    return 0;
}
