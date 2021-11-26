/*Write a function to take a number and print its table*/


#include<stdio.h>  
  
void tables(int);  
  
int main()  
{  
    int num;  
  
    printf("Enter a number - \n");  
    scanf("%d", &num);  
  
    printf("\nMultiplication Table for %d is:\n", num);  
  
    tables(num);  
  
    return 0;  
}  
  
void tables(int num)  
{  
    int i; 
  
    for(i= 1;i<= 10; i++)  
    {  
        printf("%d x %d = %d\n", num, i, num*i);  
    }  
}  
