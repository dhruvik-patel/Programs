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
    {   cout<<"\nLength : "<<l<<"\tWidth : "<<w<<"\tHeight : "<<h<<"\n\n";  }
};
int main()
{
    int i;
    Box b[3];
    for(i=0;i<3;i++)
    {
        int x,y,z;
        cout<<"\nEnter Length , Width and height of Box "<<i<<endl;
        cin>>x>>y>>z;
        b[i].setdata(x,y,z);
    }
    for(i=0;i<3;i++)
    {
        cout<<"Box : "<<i;
        b[i].showdata();
    }
}

