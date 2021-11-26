#include <stdio.h>
int main()
{
    int n, num, rev = 0;
    printf("Enter any number to check palindrome: ");
    scanf("%d", &n);
    num = n; 
    while(n != 0)
    {
        rev = (rev * 10) + (n % 10);
        n  /= 10;
    }
    if(rev == num)
    {
        printf("%d is palindrome.", num);
    }
    else
    {
        printf("%d is not palindrome.", num);
    }
    return 0;
}
