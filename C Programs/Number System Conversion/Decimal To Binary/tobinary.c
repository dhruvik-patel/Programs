#include<stdio.h>
#include<string.h>
#include<stdlib.h>
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
        arr[i]=n%2;
        n=n/2;
        i++;
    }
    for(j=(i-1);j>=0;j--)
    printf("%d ",arr[j]);
}
