#include<iostream>
using namespace std;
class value2;
class value1
{
    int a;
public:
    void setdata1()
    {
        cout<<"\nEnter any integer : ";
        cin>>a;
    }
    friend int add(value1 , value2 );
};

class value2
{
    int b;
public:
    void setdata2()
    {
        cout<<"\nEnter any integer : ";
        cin>>b;
    }
    friend int add(value1 , value2 );
};

int add(value1 x,value2 y)
{
    int ans=x.a+y.b;
}

int main()
{
    value1 v1;
    value2 v2;
    v1.setdata1();
    v2.setdata2();
    int ans=add(v1,v2);
    cout<<"\nSum : "<<ans;
}
