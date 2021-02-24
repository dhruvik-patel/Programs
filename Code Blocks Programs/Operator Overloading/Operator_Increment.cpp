#include<iostream>
using namespace std;
class Int
{
    int i;
public:
    void get(int a)
    {
        i=a;
    }
    void show()
    {
        cout<<"\nOutput : "<<i;
    }
    Int operator++()
    {
        ++i;
        return *this;
    }
    Int operator++(int)
    {
        Int temp=*this;
        ++*this;
        return temp;
    }
};

int main()
{
    Int i1,i2,i3,i4;
    i1.get(66);
    i2.get(68);
    i1.show();
    i2.show();
    i3=++i1;
    i4=i2++;
    i3.show();
    i4.show();
    return 0;
}
