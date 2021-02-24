#include<iostream>
using namespace std;
template <class type>
type comp(type a,type b)
{
    if(a>b)
        return a;
    else
        return b;
}
int main()
{
    char a,b;
    cout<<"\nEnter any two numbers : ";
    cin>>a>>b;
    cout<<"\nLarger value is : "<<comp(a,b);
    return 0;
}
