#include<iostream>
using namespace std;
void calculate(int,int,int &,int &,int &); //function prototype
int main(){
	int num1=20;
	int num2=10;
	int add,sub,mul;
	calculate(num1,num2,add,sub,mul);
	cout<<"Addition = " << add << endl;
	cout<<"Multiplication = " << mul << endl;
	cout<<"Substraction = " << sub << endl;
	return 0;
}
void calculate(int a,int b,int &add,int &sub,int &mul)//reference is received
{
	add=a+b;
	sub=a-b;
	mul=a*b;
}
