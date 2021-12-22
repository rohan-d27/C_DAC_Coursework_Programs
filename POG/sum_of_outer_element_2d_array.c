#include <stdio.h>
void main()
{
    int arr[3][3] = {{10, 10, 10}, {10, 3, 10}, {10, 10, 10}};
    int i, j, n = 3, sum = 0;
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            if ((i == 0) || (j == 0) || (i == n - 1) || (j == n - 1))
                sum = sum + arr[i][j];
        }
    }
    printf("Sum: %d\n", sum);
}
