#include<iostream>
using namespace std;
class Complex
{
    int a,b;
public :
    void setdata()
    {
        cout<<"\nEnter a and b : ";
        cin>>a>>b;
    }
    void showdata()
    {
        cout<<"\na=  "<<a<<" b= "<<b;
    }
    Complex operator+(Complex c)
{
    Complex X;
    X.a=a+c.a;
    X.b=b+c.b;
    return X;
}
};
int main()
{
    Complex c1,c2,c3;
    c1.setdata();
    c2.setdata();
    c3=c1+c2;               //c3=c1.operator+(c2)
    c3.showdata();
}
