#include<iostream>
#include<fstream>
using namespace std;
int main()
{
    ofstream fout;
    fout.open("Write");
    fout<<"\nHello this is for write into file...";
    fout.close();
    return 0;
}
