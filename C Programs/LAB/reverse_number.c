#include <stdio.h>
int main()
{
    int n, r, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    r = n;
    while (r != 0)
    {
        sum = sum * 10 + r % 10;
        r = r / 10;
    }
    printf("Reverse of %d is %d", n, sum);
    return 0;
}
