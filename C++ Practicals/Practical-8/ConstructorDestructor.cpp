#include<iostream>
using namespace std;
class Integer
{
    int a,b;
    float avg;
public:
    Integer()
    {   cout<<"<USE OF DEFAULT CONSTRUCTOR>";
        cout<<"\nEnter two numbers: ";
        cin>>a>>b;
        avg=(a+b)/2.0;
        cout<<"\nAverage: "<<avg;
    }
    Integer(int d,int m)
    {   cout<<"\n\n\n<THIS IS PARAMETERIZED CONSTRUCTOR>";
        cout<<"\nDate is : "<<d<<"-"<<m<<"-2019"<<endl;
    }
    Integer(Integer &x)
    {
        cout<<"\n\n\n<THIS IS COPY CONSTRUCTOR>";
        int i;
        for(i=0;i<4;i++)
        {
                cout<<"\n a= "<<x.a<<"\t b="<<x.b;
        }
    }
    Integer(int p,int r,int n)
    {
        cout<<"\n\n\n<This is Dynamic Constructor>\n";
        float *ans=new float;
        *ans = p*r*n/100.0;
        cout<<"\nInterest is : "<<*ans;
    }
};
int main()
{
    int a,b,c;
    Integer I;
    Integer n1(06,01),n2(I);
    cout<<"\nWant to find Interest then enter P R N:\n";
    cin>>a>>b>>c;
    Integer(a,b,c);
}

