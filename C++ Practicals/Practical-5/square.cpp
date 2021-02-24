#include<iostream>
using namespace std;
double SQR(int a){  return a*a;   }
double SQR(float b){  return b*b;  }
double SQR(double c){ return c*c;  }
int main()
{
    int i;
    float f;
    double d,ans;
    char ch;
   cout<<"Which type of value do you want to enter : i / f / d  \n";
   cin>>ch;
   switch(ch)
   {
   case 'i':
    {
        cout<<"Enter any integer value : \n";
        cin>>i;
        ans=SQR(i);
        cout<<"\nSquare is : "<<ans;
        break;
    }
   case 'f':
    {
        cout<<"Enter any float value : \n";
        cin>>f;
        ans=SQR(f);
        cout<<"\nSquare is : "<<ans;
        break;
    }
   case 'd':
    {
        cout<<"Enter any double value : \n";
        cin>>d;
        ans=SQR(d);
        cout<<"\nSquare is : "<<ans;
        break;
    }
    default : cout<<"Wrong Choice";
   }

}
