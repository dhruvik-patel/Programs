#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
    int r;
    char ans;
    jump:
    cout<<"Enter the radious of circle:\n";
    cin>>r;
    float A=3.14*r*r;
    float C=2*3.14*r;
    cout<<"Area of circle : "<<A<<"\nCircumfarance of circle : "<<C<<endl;
    cout<<"Do you want to continue? : y/n \n";
    cin>>ans;
    if(ans=='Y'||ans=='y')
        goto jump;
    return 0;
}
