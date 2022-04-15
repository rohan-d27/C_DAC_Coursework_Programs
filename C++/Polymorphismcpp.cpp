#include<iostream>
using namespace std;
class Person {
	public:
		Person() {
			cout<<"\n person constructor called";
		}
		virtual ~Person() {
			/*destructor made virtual to call destructor of object of
			derived class held in parent class's pointer else  only
			persons destructor would get called instead of
			actual objects class's destructor
			cout<<"\n person destructor called";*/
		}
		virtual void talk() {
			cout<<"\n talk of person is called ";
		}
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
//	Student *sobj=new Student();//created object on heap
//	Person  *pobj=new Person();//created object on heap
	Person *p2=new Student();//base class pointer can hold address of derived class object
	p2->talk(); //will call student talk when virtual keyword added else parent talk

//	pobj->talk();
//	sobj->talk();
	//if object on stack destructor is automatically called
//	delete sobj;//explictly called destructor because object on heap
//	delete pobj;
	delete p2;
	return 0;
}