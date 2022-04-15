#include<iostream>
using namespace std;
class Base{
	public:
	Base(){
		cout<<"\n base constructor called";
	}
	~Base()
	{
		cout<<"\n Base destructor is called";
	}
	void function1(){
		cout<<"hello";
	}
};
class Derived1: public Base{ //single inheritance
	public:
		Derived1(){
		cout<<"\n derived1 constructor called";
		}
		~Derived1(){
			cout<<"\n derived1 destructor is called";
		}
};
class Derived2: public Base{ //single inheritance
	public:
		Derived2(){
		cout<<"\n derived2 constructor called";
		}
		~Derived2(){
			cout<<"\n derived2 destructor is called";
		}
};
class Derived3:public Derived1,public Derived2{ //multiple inheritance
	public:
		Derived3(){
		cout<<"\n derived3 constructor called";
		}
		~Derived3(){
			cout<<"\n derived3 destructor is called";
		}
};
int main()
{
	Derived1 obj;
}