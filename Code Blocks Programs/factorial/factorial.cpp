#include<iostream>
using namespace std;
int facto(int x)
{
    if(x==1)
        return 1;
    else
    {
        int d;
        d=x*facto(x-1);
        return d;
    }
}
int main()
{
    int n;
    cout<<"\nEnter the integer : ";
    cin>>n;
    int ans=facto(n);
    cout<<"\nfactorial of "<<n<<" is "<<ans;
    return 0;
}
