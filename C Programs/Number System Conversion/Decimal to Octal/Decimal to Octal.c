#include<stdio.h>
int main()
{
    int n,i=0,j=0;
    printf("\nEnter any decimal no. : \n");
    scanf("%d",&n);
    int arr[50];
    while(n>0)
          {
            arr[i]=n%8;
            n=n/8;
            i++;
          }
          printf("Octal no. of %d is : \n",n);
          for(j=(i-1);j>=0;j--)
            printf("%d ",arr[j]);
}
