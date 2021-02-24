#include<iostream>
using namespace std;
int main()
{
    int M,S,E,c;
    cout<<"\nEnter marks of Maths , Science , English : ";
    cin>>M>>S>>E;
    float per=(M+S+E)/3.0;
    cout<<"\nPercentage : "<<per;
    if(per>=80&&per<=100)
        c=1;
    else if(per>=70&&per<80)
        c=2;
    else if(per>=55&&per<70)
        c=3;
    else if(per>=40&&per<55)
        c=4;
    else if(per>=0&&per<40)
        c=0;
    switch(c)
    {
        case 0 : cout<<"\nGrade : fail";
                break;
        case 1 : cout<<"\nGrade : Distinction";
                break;
        case 2 : cout<<"\nGrade : First Class";
                break;
        case 3 : cout<<"\nGrade : Second Class";
                break;
        case 4 : cout<<"\nGrade : Pass Class";
                break;
    }
    return 0;
}
