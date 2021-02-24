#include<stdio.h>
#include "myfun.h"
int main()
{
    int a,b,sum;
    float avg;
    printf("\nEnter two numbers: ");
    scanf("%d %d",&a,&b);

    sum = sumofNUM(a,b);
    avg = avgofNUM(a,b);
    printf("\nSum = %d \n Average = %f",sum,avg);
    return 0;
}
