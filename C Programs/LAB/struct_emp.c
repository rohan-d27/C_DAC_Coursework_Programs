


#include<stdio.h>
struct Employee
{
	int empid;
	char name[10];
	int salary;
};
int main()
{
void accept(struct Employee *e);

	void display(struct Employee e);
	void calculate(struct Employee *e);
	struct Employee emp;
	
	accept(&emp);  
	
	calculate(&emp);
	display(emp);
	
	
	
	
	return 0;
}
void accept(struct Employee *e)
{
	printf("\nEnter employee details employee id, name , salary \n");
	scanf("%d%s%d",&e->empid,e->name,&e->salary);

}

void display(struct Employee e)
{
	printf("\nEmpid =%d\tName=%s\tSalary=%d",e.empid,e.name,e.salary);
}
void calculate(struct Employee *e)
{
	int gs=e->salary-200;
	printf("\nGross Salary=%d",gs);
}
