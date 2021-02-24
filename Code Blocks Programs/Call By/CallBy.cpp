#include<iostream>
using namespace std;
void callbyvalue(int,int);
void callbypointer(int* , int*);
void callbyreferance(int,int);
int main()
{
    int a,b;
    cout<<"\nEnter two integers : \n";
    cin>>a>>b;
    callbyvalue(a,b);

    int *p,*q;
    p=&a,q=&b;
    callbypointer(p,q);

    int &c=a;
    int &d=b;
    callbyreferance(c,d);
}
void callbyvalue(int a,int b)
{
    int temp=a; a=b;    b=temp;
    cout<<"\n a= "<<a<<"\t b= "<<b;
}
void callbypointer(int *p,int *q)
{
    int temp=*p;    *p=*q;  *q=temp;
    cout<<"\n a= "<<*p<<"\t b= "<<*q;
}
void callbyreferance(int x,int y)
{
    int temp=x; x=y;    y=temp;
    cout<<"\n a= "<<x<<"\t b= "<<y;
}
