#include<iostream>
using namespace std;
class Box
{
private:
    int l,w,h;
public:
    void setdata(int x,int y,int z)
    {   l=x;    w=y;    h=z;}
    void showdata()
    {   cout<<"\nLength : "<<l<<"\tWidth : "<<w<<"\theight : "<<h;  }
};
int main()
{
    Box b1,b2;
    b1.setdata(100,75,50);
    b2.setdata(200,175,100);
    b1.showdata();
    b2.showdata();
}
