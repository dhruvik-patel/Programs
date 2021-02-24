#include<stdio.h>
#include<math.h>
int main()
{
    char octal[50];
    int i,D=0,count=0;
    printf("\nEnter any Octal no. : ");
    gets(octal);
    for(i=(strlen(octal)-1);i>=0;i--)
    {
        D = D + (octal[i]-0x30)*pow((double)8,(double)count);
        count++;
    }
    printf("\nDecimal no : %d",D);
}
