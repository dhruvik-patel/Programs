#include<stdio.h>
#include<string.h>
#include<math.h>
int main()
{
    char bin[50]={0};
    int dec,i;
    int cnt;
    printf("\nEnter any binary no. : ");
    gets(bin);
    cnt=0;
    dec=0;
    for(i=(strlen(bin)-1);i>=0;i--)
    {
        dec= dec + (bin[i]-0x30)*pow((double)2,(double)cnt);
        cnt++;
    }
    printf("\nDecimal : %d ",dec);
}
