#include<iostream>
using namespace std;
class base
{
public:
    virtual void display()
    {   cout<<"\nwelcome to the base class"; }
};
class derived : public base
{
public:
    void display()
    {   cout<<"\nWelcome to the derived class"; }
};
int main()
{
    derived d1;
    base *p;
    p=&d1;
    p->display();
}
