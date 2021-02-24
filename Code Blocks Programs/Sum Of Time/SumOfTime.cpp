#include<iostream>
using namespace std;
class time
{
    int h,m;
public:
    void get(int a,int b)
    {
        h=a;    m=b;
    }
    void show()
    {
        cout<<"Time is "<<h<<" hour and "<<m<<" minutes.\n";
    }
    void sum(time t)
    {
        int M= m + t.m;
        int H=h + t.h + M/60;
        M= M%60;
        cout<<"Total time is "<<H<<" hour and "<<M<<" minutes.";
    }
};
int main()
{
    time t1,t2;
    int h1,m1,h2,m2;
    cout<<"Enter hour and minutes for time1 : \n";
    cin>>h1>>m1;
    cout<<"Enter hour and minutes for time t2 : \n";
    cin>>h2>>m2;
    t1.get(h1,m1);
    t2.get(h2,m2);
    t1.sum(t2);
    return 0;
}
