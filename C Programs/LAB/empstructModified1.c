
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
	
	void accept(struct Employee *e2);
	void display(struct Employee *e1);
	
	while(1)
	{
		printf("\nMENU");
		printf("\n1.Accept\n2.Display\n3.Exit");
		switch(ch)
		{
			case 1:accept(&e);
			
			case 2:display(&e); 
		}
	}
}

void display(struct Employee *e1) //e1=&e
{
	printf("\nEmployee details are :\n");
	printf("\nempid=%d\t emp name=%s\t salary=%d",e1->empid,e1->name,e1->salary);
}
void accept(struct Employee *e2) //e2=&e 
{
	printf("\nEnter details:");
	scanf("%d%s%d",&e2->empid,e2->name,&e2->salary);
} //1  aaa  4500









