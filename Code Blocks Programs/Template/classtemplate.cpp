#include<iostream>
using namespace std;
template <class type>
class info
{
    type a,b;
public :
    void setdata(type x,type y)
        {
            a=x;  b=y;
        }
        void show()
        {
            cout<<"\na= "<<a<<"\tb= "<<b;
        }
};
int main()
{
    info<float> i;
    i.setdata(66.68,68.66);
    i.show();
    return 0;
}
