#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char lw[20];
    cout<<"\nEnter any string : ";
    cin>>lw;
    for(int i=0;lw[i]!=NULL;i++)
    {
        if(lw[i]<=122 && lw[i]>=97)
            lw[i]=lw[i]-32;
    }
    cout<<"\nString in Upper case : "<<lw;
    return 0;
}
