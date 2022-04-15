#include<iostream>
using namespace std;
void swap_value(int,int);
void swap_address(int *,int *);
void swap_reference(int &,int &);

int main() {
	int a=10;
	int b=20;

	swap_value(a,b);
	cout<<"\n a = "<< a << " b = "<<b;

	swap_address(&a,&b);
	cout<<"\n a = "<< a << " b = "<<b;

	swap_reference(a,b);
	cout<<"\n a = "<< a << " b = "<<b;
	return 0;
}
void swap_value(int a,int b) {
	int t=a;
	a=b;
	b=t;

}
void swap_address(int *a,int *b) {
	int t=*a;
	*a=*b;
	*b=t;

}
void swap_reference(int &a,int &b) {
	int t=a;
	a=b;
	b=t;

}
