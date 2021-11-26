#include<stdio.h>
typedef struct employee
{
int empid;
char empname[20];
float salary;
}emp;


int main()
{
 int n;
 printf("Enter no. of employees=");
 scanf("%d",&n);
 emp *e=(emp *)malloc(n*sizeof(emp));

 
 
 void Accept(emp e1[],int n1);
 void Search(emp e1[],int n1);
 void displayAll(emp e1[],int n1);
 void displaySalaryWise(emp e1[],int n1);
 Accept(e,n);
 displayAll(e,n);

 displaySalaryWise(e,n);
 Search(e,n);
 

}

void Accept(emp e1[],int n1)
{
	int i;
	for(i=0;i<n1;i++)
	{
	printf("\nEnter employee ID= ");
	scanf("%d",&e1[i].empid);
	printf("\nEnter employee Name= ");
	scanf("%s",e1[i].empname);
	printf("\nEnter employee Salary= ");
	scanf("%f",&e1[i].salary);
	
	}
}

void displayAll(emp e1[],int n1)
{
	int i;
	for(i=0;i<n1;i++)
	{
	printf("\nEnter employee ID=%d \nEnter employee Name=%s \nEnter employee Salary=%f ",e1[i].empid,e1[i].empname,e1[i].salary);
	}
}

void displaySalaryWise(emp e1[],int n1)
{

	int i;
	for(i=0;i<n1;i++)
	{
	if(e1[i].salary>10000)
	{
		printf("\nEmployee details having salary graeter than 10k are:");
	    printf("\nEnter employee ID=%d \tEnter employee Name=%s \tEnter employee Salary=%f ",e1[i].empid,e1[i].empname,e1[i].salary);
	}
	else if(e1[i].salary<10000)
	{
		printf("\nEmployee details having salary graeter than 10k are:");
     	printf("\nEnter employee ID=%d \tEnter employee Name=%s \tEnter employee Salary=%f ",e1[i].empid,e1[i].empname,e1[i].salary);
	}
	}
}

void Search(emp e1[],int n1)
{
	int i,j,n;
	printf("\nEnter Employee ID to get details:");
	scanf("%d",&j);
		for(i=0;i<n;i++)
	{
	if(e1[i].empid==j)
		{
			printf("\nEnter employee ID=%d \tEnter employee Name=%s \tEnter employee Salary=%f ",e1[i].empid,e1[i].empname,e1[i].salary);
		}
	
	}
	
}




