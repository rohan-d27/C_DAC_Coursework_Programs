
//retrive the value of e2 using return keyword
//pass pointer as paramter to accept

#include<stdio.h>
struct Employee
{
	int empid;
	char name[10];
	int salary;
};
int main()
{
	struct Employee e;
	
	struct Employee accept(struct Employee e2);

	
	void display(struct Employee e1);
	
	e=accept(e); //garbage //e2
	
	//call the display
	//  e1=e  //empid name salary
	display(e); //address is diff
}

void display(struct Employee e1) //e1=e //e1 is differ
{
	printf("\nEmployee details are :\n");
	printf("\nempid=%d\t emp name=%s\t salary=%d",e1.empid,e1.name,e1.salary);
}
struct Employee accept(struct Employee e2) //e2=e 
{
	printf("\nEnter details:");
	scanf("%d%s%d",&e2.empid,e2.name,&e2.salary);
	return e2;
} //1  aaa  4500









