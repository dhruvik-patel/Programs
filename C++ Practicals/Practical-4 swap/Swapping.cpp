#include<iostream>
using namespace std;
void swapbyvalue(int x,int y)
{   cout<<"\nCall by value";
    int temp=x;
    x=y;
    y=temp;
    cout<<"\nx= "<<x<<" y= "<<y;
}
void swapbypointer(int *p,int *q)
{   cout<<"\nCall by pointer";
    int temp;
    temp=*p;
    *p=*q;
    *q=temp;
    cout<<"\nx= "<<*p<<" y="<<*q;
}
void swapbyreferance(int x,int y)
{   cout<<"\nThis is Call by referance";
    int temp=x;
    x=y;
    y=temp;
    cout<<"\nx= "<<x<<" y= "<<y;
}
int main()
{
    int a,b;
    cout<<"\nEnter two integers : ";
    cin>>a>>b;
    swapbyvalue(a,b);

    int *p,*q;
    p=&a;
    q=&b;
    swapbypointer(p,q);

    int &c=a;
    int &d=b;
    swapbyreferance(c,d);
}
