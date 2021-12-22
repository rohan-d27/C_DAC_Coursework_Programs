#include <stdio.h>
void main()
{
    int arr[3][3] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
    int start,end,n=3,i;
    for (start = 0,end=n-1; start<=end; start++,end--)
    {
        for ( i=start; i<=end; i++ )
        {
            printf( " %d ", arr[start][i] );
        }
         for ( i=start+1; i<=end; i++ )
        {
            printf( " %d ", arr[i][end] );
        }
         for ( i=end-1; i>=start; i--)
        {
            printf( "%d ", arr[end][i] );
        }
         for ( i=end-1; i>=start+1; i--)
        {
            printf( "%d ", arr[i][start] );
        }
    }
    

}
