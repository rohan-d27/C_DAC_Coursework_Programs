/*Q1. Write a menu driven program in C to create a structure employee having
 fields empid,empname, salary. Accept the details of 'n' 
Employees from user and perform the following
operations using function.
1] Search by Emp-Id
2] Display All
3] Display Names of Employee having Salary > 10000.
Total 4 functions you need to write.
Accept(),Search(), displayAll(), 
displaySalaryWise()
This application will cover all the topics of 
C Programming.(loops, if else, switch, DMA, array,
function,structure)*/


#include<stdio.h>

struct Employee
{
	int id;
	char name[20];
	int salary;	
};

int main()
{
	struct Employee j[3];
	int c;  
    accept(j);
	printf("Enter your choice \n1]Search by Emp-Id\n2]Display All \n3]Display Names of Employee having Salary > 10000 :");
	scanf("%d",&c);
		
    if(c==1)
    {
    	search(j);
    }
    if(c==2)
    {
    	displayall(j);
    }
    if(c==3)
    {
    	displaysalary(j);
    }
    return 0;
}
void accept(struct Employee j[])
{
	int i;
	for(i=0;i<3;i++)
	{
		printf("\n Enter following employee data: \n  \n1.Employee Id \n2.Employee Name \n3.Employee Salary\n");
		scanf("%d%s%d",&j[i].id,&j[i].name,&j[i].salary);
	}
	
}
void search(struct Employee j[])
{
	int i,r;
	printf("\n Employee id to search: ");
	scanf("%d",&r);
	for(i=0;i<3;i++)
	{
		if(j[i].id==r)
		{
		printf("\n Employee id %d \t Employee name %s \t Employee Salary %d \n  ",j[i].id,j[i].name,j[i].salary);
		}
	}	
}
void displayall(struct Employee j[])
{
	int i;
	printf("\nList of employees:");
	for(i=0;i<3;i++)
	{
		printf("\n Employee id: %d \t Employee name: %s \t Employee Salary: %d",j[i].id,j[i].name,j[i].salary);
	}
}
void displaysalary(struct Employee j[])
{
	int i;
	for(i=0;i<3;i++)
	{
		if(j[i].salary>=10000)
		{
				printf("\n Employee id: %d \t Employee name: %s \t Employee Salary: %d",j[i].id,j[i].name,j[i].salary);
		}
		
	}
}


