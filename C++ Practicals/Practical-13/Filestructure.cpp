#include<fstream>
#include<iostream>
using namespace std;
class STUDENT
{
    int rollno,M,E,S;
    char name[20];
public:
    void setdata()
    {
        int i;
        ofstream file;
        file.open("Student Info.txt");
        for(i=0;i<3;i++)
        {
            cout<<"\nEnter rollno , name , Marks of Maths,English,Science : ";
            cin>>rollno>>name>>M>>E>>S;

            file<<rollno<<endl<<name<<endl<<M<<endl<<E<<endl<<S<<endl<<endl<<endl;
        }
        file.close();

    }
    void display()
    {
        cout<<"Details of student : \n";
        cout<<"\nRollNo. :"<<rollno;
        cout<<"\nName :"<<name;
        cout<<"\nMarks of maths : "<<M<<"\tEnglish : "<<E<<"\tScience : "<<S;
    }
};
int main()
{   char ch;
    int i;
    STUDENT s;
    s.setdata();
    ifstream fin;
    fin.open("Student Info.txt");
    ch=fin.get();
    while(!fin.eof())
    {
        cout<<ch;
        ch=fin.get();
    }
}
