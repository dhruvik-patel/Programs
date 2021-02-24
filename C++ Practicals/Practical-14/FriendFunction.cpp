#include<iostream>
using namespace std;
class Second;
class First
{   int a;
public:
    void setdata()
    {
        cout<<"\nEnter any integer : ";
        cin>>a;
    }
    friend void sum(First,Second);
};
class Second
{   int b;
public:
    void Set()
    {
        cout<<"\nEnter any integer : ";
        cin>>b;
    }
    friend void sum(First,Second);
};
void sum(First f1,Second x)
{   int sum = f1.a+x.b;
    cout<<"\nSum is : "<<sum;
}
int main()
{
    First f1;
    Second s1;
    f1.setdata();
    s1.Set();
    sum(f1,s1);
}
