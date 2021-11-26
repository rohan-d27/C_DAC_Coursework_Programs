
#include<stdio.h>
#include<string.h>
struct Employee
{
	int id;
	char name[100];
	int sal;
}; 
int main()
{
	struct Employee emp;
	printf("\nEnter employee id, name, salary \n");
	scanf("%d%s%d",&emp.id,&emp.name,&emp.sal);
//	printf("\n Employee id %d \t Emplyoee name %s \t Employee salary %d\n",emp.id,emp.name,emp.sal);
	void display(struct Employee e1);
	void calculate(struct Employee e1);
	display(emp);
	calculate(emp);
return 0;
}
void display(struct Employee e1)
{
    
	printf("\n Employee id %d \t Emplyoee name %s \t Employee salary %d\n",e1.id,e1.name,e1.sal);
	
}
void calculate(struct Employee e1)
{
	int gs;
	e1.sal;
	gs=e1.sal-200;
	printf("\n Gross salary is %d ",gs);	
}

