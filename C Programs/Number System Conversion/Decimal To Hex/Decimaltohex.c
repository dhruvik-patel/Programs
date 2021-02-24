#include<stdio.h>
int main()
{
    int n;
    int arr[50];
    printf("\nEnter any decimal no. : ");
    scanf("%d",&n);
    int i=0,j=0;
    printf("\nBinary of %d is : \n",n);
    while(n>0)
    {
        arr[i]=n%16;
        n=n/16;
        i++;
    }
    for(j=(i-1);j>=0;j--)
    {
        switch(arr[j])
        {
            case 10: arr[j]='a';
                        break;
            case 11: arr[j]='b';
                        break;
            case 12: arr[j]='c';
                        break;
            case 13: arr[j]='d';
                        break;
            case 14: arr[j]='e';
                        break;
            case 15: arr[j]='f';
                        break;
        }
        if(arr[j]<=122 && arr[j]>= 97)
            printf("%c ",arr[j]);
        else
            printf("%d ",arr[j]);
    }
}
