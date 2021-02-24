#include<iostream>
using namespace std;
int main()
{
    int a,b,c,p=0,n;
    cout<<"\nHow many lines : ";
    cin>>n;
    for(a=0;a<n;a++)
    {
        for(c=n;c>a;c--)
        {
            cout<<" ";
        }
        for(b=0;b<=a;b++)
        {
            if(b==a||b==0)
            {
                p=1;
            }
            else
            {
                p=p*(a-b+1)/b;
            }
            cout<<" "<<p;
        }
        cout<<"\n";
    }
    return 0;
}
