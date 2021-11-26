#include <stdio.h>
int main()
{
    int num1, num2;
    printf(" Enter the number1 = ");
    scanf("%d", &num1);
    printf("\n Enter the number2 = ");
    scanf("%d", &num2);
 
    if (num1 > num2)
    {
        
 
            printf("\n Largest number = %d \n",num1);
    
    }
	if(num1==num2)
	{
		 printf("\n numbers are equal");
	}
    
    else if(num2 > num1)
    {
        printf("\n Largest number = %d \n",num2);
    }
	
    return 0;
}