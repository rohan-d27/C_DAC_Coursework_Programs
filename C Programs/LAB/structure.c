/*write a program to create structure named student*/


#include<stdio.h>
#include<string.h>
struct Student
{
	int rollno;
	char name[20];
	float per;
};   //user defined datatype
int main()
{
	struct Student ram;
	ram.rollno=12;
	//ram.name="sdfsdf";
	strcpy(ram.name,"Ram");
	ram.per=75.67f;
	printf("\nRoll no: %d\tName: %s\tPercentage: %f",ram.rollno,ram.name,ram.per);
	
return 0;
}
