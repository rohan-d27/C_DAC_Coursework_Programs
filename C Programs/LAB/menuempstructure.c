#include<stdio.h>
#include<stdlib.h>
int n;
struct employee 
{
	int empid;
	char empname[50];
	int salary;
};
int main()
{
	void accept(struct employee *);
	void display(struct employee *);
	void search(struct employee *);
	void richmember(struct employee *);
	
	printf("Enter number of employees\n");
	scanf("%d",&n);
	struct employee *ptr = (struct employee*)malloc(sizeof(struct employee)*n);
	accept(ptr);
	printf("******MENU******\n");
	printf("\n1.Search by Employee ID\n2.Display Employee Details\n3.Employess having salary more than 10000\n4.EXIT\n");
	while(1)
	{
	int ch;
	printf("\nEnter your Choice\n");
	scanf("%d",&ch);
	switch(ch)
		{
    		case 1:
    			{
    				search(ptr);	
    				break;
    			}
    		case 2:
    			{
    				display(ptr);
    				break;
    			}	
			case 3:
				{
					richmember(ptr);
					break;
				}	
		}
		if(ch == 4)
		{
			printf("Exited Succefully........\n");
			break;
		}
		else if(ch > 4)
		{
			printf("Invalid Choice\n");
			continue;
		}
	}	
}
void accept(struct employee *arr)
{
	int i;	
	for (i=0;i<n;i++)
	{
		printf("Enter Employee ID,Employee Name and Salary respectively\n");
		scanf("%d%s%d",&(arr+i)->empid,(arr+i)->empname,&(arr+i)->salary);
	}
}
void display(struct employee *arr)
{
	int i;	
	for (i=0;i<n;i++)
	{
		printf("Employee ID = %d\tEmployee Name = %s\tEmployee Salary = %d\n",(arr+i)->empid,(arr+i)->empname,(arr+i)->salary);
	}
}
void search(struct employee *arr)
{
	int i,s;
	printf("Enter Employee ID to search\n");
	scanf("%d",&s);
	for(i=0;i<n;i++)
	{
		if(( arr->empid ) + i  == s)
		{
			printf("Employee ID found\n");
			printf("Employee ID = %d\tEmployee Name = %s\tEmployee Salary = %d\n",(arr+i)->empid,(arr+i)->empname,(arr+i)->salary);
		}
	}	
}
void richmember(struct employee *arr)
{
	int i;
	for(i=0;i<n;i++)
	{
		if((arr+i)->salary > 10000)
		{
			printf("Employee ID = %d\tEmployee Name = %s\tEmployee Salary = %d\n",(arr+i)->empid,(arr+i)->empname,(arr+i)->salary);
		}
	}
}
