//Write a menu driven program in C to create a structure employee having fields 
//empid, empname, salary. Accept the details of 'n' Employees from user 
//and perform the following operations using function.
//
//1] Search by Emp-Id
//
//2] Display All
//
//3] Display Names of Employee having Salary > 10000.
//Total 4 functions you need to write.
//Accept(),Search(), displayAll(), displaySalaryWise()
//This application will cover all the topics of C Programming.
//(loops, if else, switch, DMA, array, function, structure)

#include<stdio.h>
#include<stdlib.h>
struct employee 
{
	int empid;
	char empname[20];
	int salary;
};
int main()
{
	void accept(struct employee e1[], int n1);
	void dispaly_all(struct employee e1[], int n1);
	void search(struct employee e1[], int n1);
	void display_salary_wise(struct employee e1[], int n1);
	int n;
	printf("Enter the no of employees:\n");
	scanf("%d",&n);
	struct employee *e = (struct employee *)malloc(n* sizeof(struct employee)); 
	accept(e,n);
	dispaly_all(e,n); 
	
		int a;
		printf("\nMENU\n");
		printf("\n1.Displaysalarywise\n2.searchempid\n");
		printf("Enter your choice:");
		scanf("%d",&a);
		switch(a)
		{
			case 1:display_salary_wise(e,n);
			break;
			case 2:search(e,n);
			break;
			default:
				printf("Invalid key press 1 or 2 ");
		}
	
		
	
	
	
	
	
}
void accept(struct employee e1[], int n1)
{
	int i;
	printf("Enter Employee details:\n");
	for(i=0;i<n1;i++)
	{
	printf("\nEnter employee ID= ");
	scanf("%d",&e1[i].empid);
	printf("\nEnter employee Name= ");
	scanf("%s",e1[i].empname);
	printf("\nEnter employee Salary= ");
	scanf("%d",&e1[i].salary);
	
	}
		
}
void dispaly_all(struct employee e1[], int n1)
{
	int i;
	for(i=0;i<n1;i++)
	{
		printf("\n empid:%d\n empname:%s\n salary:%d\n",e1[i].empid,e1[i].empname,e1[i].salary);
	}
}
void search(struct employee e1[], int n1)
{
	int i,j;
	printf("\n Enter empid to get the details:\n");
	scanf("%d",&j);
	for(i=0;i<n1;i++)
	{
		if(e1[i].empid==j)
		{
			printf("\n empid:%d\n empname:%s\n salary:%d\n",e1[i].empid,e1[i].empname,e1[i].salary);
		}
		else
		{
			printf("\n This empid is invalid\n");
		}
	}	
}
void display_salary_wise(struct employee e1[], int n1)
{
	int i;
	for(i=0;i<n1;i++)
	{
		if(e1[i].salary>50000)
		{	
			printf("\n salary is greater than 50000");
			printf("\n empid:%d\n empname:%s\n salary:%d\n",e1[i].empid,e1[i].empname,e1[i].salary);
		}
		else
		{
				printf("salary is less than 50000");
				printf("\n empid:%d\n empname:%s\n salary:%d\n",e1[i].empid,e1[i].empname,e1[i].salary);

		}
		
	}
			
}

