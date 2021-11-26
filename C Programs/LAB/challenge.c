#include<stdio.h>
int main()
{

	int c=2;
	int n[c];
//	printf("Enter number of histogram you want to see: ");
//scanf("%d",&c);
	void accept(int n[],int c);
	accept(n,c);
	void histogram(int n[],int c);
	histogram(n,c);
	return 0;	
}


void accept(int n[],int c)
{
	int i;
	printf("Enter number of stars: ");
	for(i=0;i<c;i++)
	{
		scanf("%d",&n[i]);
	}
}
void histogram(int n[],int c)
{
	int i,j,k;
	printf("The output is:\n");
	for(i=0;i<c;i++)
	{
		for(k=0;k<c;k++)
	{
		for(j=0;j<=n[i];j++)
		{
			printf("\n*");
			
		}
	  printf("\n--  ");
	   printf("\n%d\t",n[i]);
}
	 printf("\t");
	}	
}
