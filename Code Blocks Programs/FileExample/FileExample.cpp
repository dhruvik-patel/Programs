#include<fstream>
#include<iostream>
using namespace std;
int main()
{
    ofstream fout;
    fout.open("MyFile.txt");
    fout<<"This is an example of file";
    fout.close();
}
