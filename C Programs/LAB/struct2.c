/*write a program to create structure named student*/


#include<stdio.h>

struct Student
{
	int rollno;
	char name[200];
	float per;
};  
int main()
{	
	struct Student rd;
    void display (struct Student s1);
	rd.rollno=10;
	rd.name = "rohan";
	rd.per=80.60f;
	display(rd);
return 0;
}
void display(struct Student s1)
{

	printf("\nRoll no: %d\tName: %s\tPercentage: %f",s1.rollno,s1.name,s1.per);
}
