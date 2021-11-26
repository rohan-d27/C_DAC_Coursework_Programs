#include<stdio.h>
int main()
{
	int i,j,n,p;
	printf("Enter number of rows:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<i;j++)
		{
			printf(" ");
		}
		p=n+1-i;
		for(j=1;j<=n-i+1;j++)
		{
			printf("%d",p);
			p=p+1;
		}
	
		p=p-2;
		
		for(j=1;j<n-i+1;j++)
		{
			printf("%d",p);
			p=p-1;
		}
			printf("\n");
	}
	return 0;
}
