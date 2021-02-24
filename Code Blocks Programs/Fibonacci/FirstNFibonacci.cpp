#include<iostream>
using namespace std;
int main()
{
    int n,i,a=0,b,c=0;
    loop:
    cout<<"Enter how many value : \n";
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
        a=0,b=1,i=0;
        cout<<a<<"\t"<<b<<"\t";
        while(i<=n-3)
        {
            c=a+b;
            a=b;
            b=c;
            cout<<c<<"\t";
            i++;
        }
    }
    return 0;
}

