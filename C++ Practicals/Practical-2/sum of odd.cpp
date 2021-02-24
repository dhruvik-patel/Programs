#include<iostream>
using namespace std;
int main()
{


int n,i=0,ans=0;
cout<<"\nEnter how many numbers : ";
cin>>n;
for(i=0;i<(2*n);i++)
{
    if(i%2!=0)
        ans=ans+i;
}
cout<<"\nSum of first "<<n<<" odd numbers : "<<ans;
return 0;
}
