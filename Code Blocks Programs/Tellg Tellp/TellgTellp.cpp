#include<iostream>
#include<fstream>
using namespace std;
int main()
{
   /* ifstream fin;
    fin.open("File.txt");
    char ch;
    int pos;
    pos=fin.tellg();
    cout<<pos;
    fin>>ch;
    pos=fin.tellg();
    cout<<"\n"<<pos;
     fin>>ch;
    pos=fin.tellg();
    cout<<"\n"<<pos;
    fin.close();
    return 0;*/
    ofstream fout;
    int pos;
    fout.open("File.txt",ios::app);
    pos=fout.tellp();
    cout<<pos;
    fout<<"This file will be opened in append mode.";
    pos=fout.tellp();
    cout<<"\n"<<pos;

    fout.close();
}

