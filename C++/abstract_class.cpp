#include<iostream>
using namespace std;
class Person {
	public:
		Person() {

			cout<<"\n person constructor called";
		}
		virtual ~Person() {
		}
		virtual void talk()=0;//pure virtual function

};
class Teacher:public Person {
	public:
		Teacher() {
			cout<<"\n teacher constructor called";
		}
		~Teacher() {
			cout<<"\n teacher destructor called";
		}
		void talk() {
			cout<<"\n talk of teacher is called ";
		}
};
class Student:public Person {
	public:
		Student() {
			cout<<"\n Student constructor called";
		}
		~Student() {
			cout<<"\n Student destructor called";
		}
		void talk() {
			cout<<"\n talk of Student is called ";
		}
};
int main() {
	//Person p;/*object can not be created because class is abstract*/
	//	[Error] cannot declare variable 'p' to be of abstract type 'Person'
	//p->talk(); //error
	Person *p2=new Student();//works no error
	p2->talk();
	delete p2;
	return 0;
}