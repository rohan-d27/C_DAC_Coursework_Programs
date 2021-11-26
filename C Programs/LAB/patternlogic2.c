#include<stdio.h>
int main()
{
	int i,j,n;
	printf("Enter number of rows:");
	scanf("%d",&n);
	for(i=n;i>=1;i--)
	{
		for(j=1;j<=n-i;j++)
		{
			printf(" ");
		}
		for(j=1;j<i*2;j++)
		{
			printf("%d",j);
		
		}
			printf("\n");
	}
	return 0;
}
