#include<iostream>
using namespace std;
class Base { //virtual added to tell compiler that derived classes have same parent
	public:
		Base() {
			cout<<"\n base constructor called";
		}
		~Base() {
			cout<<"\n Base destructor is called";
		}
		void function1() {
			cout<<"\n hello function1 of base class called";
		}
};
class Derived1:public virtual Base { //single inheritance
	public:
		Derived1() {
			cout<<"\n derived1 constructor called";
		}
		~Derived1() {
			cout<<"\n derived1 destructor is called";
		}

};
class Derived2: public virtual Base { //single inheritance
	public:
		Derived2() {
			cout<<"\n derived2 constructor called";
		}
		~Derived2() {
			cout<<"\n derived2 destructor is called";
		}


};
class Derived3:public Derived1,public Derived2 { //multiple inheritance
	public:
		Derived3() {
			cout<<"\n derived3 constructor called";
		}
		~Derived3() {
			cout<<"\n derived3 destructor is called";
		}
};
int main() {
	Derived3 obj;
	obj.function1();// before virtual keyword--> [Error] request for member 'function1' is ambiguous
	return 0;
}
/*
 virtual keyword solves diamond problem
*/
/*
Before applying virtual keyword output:

 base constructor called
 derived1 constructor called
 base constructor called
 derived2 constructor called
 derived3 constructor called
 derived3 destructor is called
 derived2 destructor is called
 Base destructor is called
 derived1 destructor is called
 Base destructor is called
*/
/*
After applying virtual keyword output:

 base constructor called
 derived1 constructor called
 derived2 constructor called
 derived3 constructor calledhello
 derived3 destructor is called
 derived2 destructor is called
 derived1 destructor is called
 Base destructor is called
 */