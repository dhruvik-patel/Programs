#include<iostream>
using namespace std;
inline void address(int x)
{
    int *p;
    p=&x;
    cout<<p;
}
int main()
{
    int a;
    cout<<"Enter any integer : \n";
    cin>>a;
    address(a);

}
