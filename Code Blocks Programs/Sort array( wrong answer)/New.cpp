#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
    int arr[5],i,temp=0,j;
    cout<<"\nEnter the value in array : ";
    for(i=0;i<5;i++)
    {
        cin>>arr[i];
    }
    for(i=0;i<5;i++)
    {
        for(j=i+1;j<5;j++)
        {
            if(arr[i]>arr[j])
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
        }

    }
    cout<<"\nsorted Array : ";
    for(i=0;i<5;i++)
    {
        cout<<"\n"<<arr[i];
    }
    return 0;
}
