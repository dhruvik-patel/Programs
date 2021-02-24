#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
    long int year;
    char ans;
    start:
    cout<<"Enter the year you want to check:\n";
    cin>>year;
    if(year%4==0)
        cout<<year<<" is leap year";
    else
        cout<<year<<" is not leap year";
    cout<<"\nDo you want to continue? : y/n \n";
    cin>>ans;
    if(ans=='Y'||ans=='y')
        goto start;
    return 0;
}
