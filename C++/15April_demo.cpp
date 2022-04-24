/*Day - 2

diamond problem  -  Why multiple inheritance is not given in Java?
Ans: To avoid diamond problem



virtual function

abstract class

v-table, v-ptr


In Java Inheritance is by-default
In Java every non static function is 
    virtual function


function pointer: POG

same function can take multiple definitions 


static polymorphism - compile time binding

dynamic polymorphism - run-time binding


Types of Inheritance :

single
multiple     -  not in Java
multilevel
hybrid       mix of all 3-  not in Java





cin
cout are objects

cin>>
cout<<


#include<iostream>
using namespace std;
class Base{
	public:
	Base() { 
	  cout<<"\n Base constructor is called ";
	}
	~Base() {
		cout<<"\n Base destructor is called ";
	}
	void fun()
	{
		cout<<"\n fun is called ";
	}
};


class der1:virtual public Base {
	public:
	der1() {
		cout<<"\n der1 constructor is called ";
	}
	~der1() {
		cout<<"\n der1 destructor is called ";
	}
};


class der2:public virtual Base {
	public:
	der2() {
		cout<<"\n der2 constructor is called ";
	}
	~der2() {
		cout<<"\n der2 destructor is called ";
	}
};

class derived:public der1, public der2 {
	public:
	derived() {
		cout<<"\n derived constructor is called ";
	}
	~derived() {
		cout<<"\n derived destructor is called ";
	}
};

int main()
{
	derived dobj; //output
	
    dobj.fun();
	
	
}

 Base constructor is called
 der1 constructor is called
 der2 constructor is called
 derived constructor is called
 fun is called
 derived destructor is called
 der2 destructor is called
 der1 destructor is called
 Base destructor is called
--------------------------------
Process exited after 0.1056 seconds with return value 0
Press any key to continue . . .




solution of "member is ambiguous "

declare base class as virtual




Polymorphism:  


******* base class pointer can hold 
address of derived class object ********



 




#include<iostream>
using namespace std;

class person{
	
	public:
	person(){
		cout<<"\n person constructor is called ";
		}
	
	~person(){
		cout<<"\n person destructor is called ";
		
	}	
	
	void talk()
	{
		cout<<"\n person talk is called ";
	}
};
class teacher:public person {
	public:
		teacher()
		{
				cout<<"\n teacher constructor is called ";
		}
       ~teacher()
       {
       		cout<<"\n teacher destructor is called ";
	   }
	   void talk()
    	{
		cout<<"\n teacher talk is called ";
    	}


};

class student:public person{
	public:
	student()
	{
		cout<<"\n student constructor is called ";
	}
	~student() {
		cout<<"\n student destructor is called ";
	}
	void talk()
	{
		cout<<"\n student talk is called ";
	}
};


int main()
{
	student *sobj = new student(); 
	person *pobj = new person();
	pobj->talk();
	sobj->talk();
	delete sobj;  //now destructor will get called   ****
	delete pobj;  //now destructor will get called
	return 0;
}

 person constructor is called
 student constructor is called
 person constructor is called
 person talk is called
 student talk is called
--------------------------------
Process exited after 0.07273 seconds with return value 0
Press any key to continue . . .
 
2 nd time execution   ****

 person constructor is called
 student constructor is called
 person constructor is called
 person talk is called
 student talk is called
 student destructor is called
 person destructor is called
 person destructor is called
--------------------------------
Process exited after 0.09528 seconds with return value 0
Press any key to continue . . .







#include<iostream>
using namespace std;

class person{
	int id;
	public:
	person(){
		
		cout<<"\n person constructor is called ";
		}
	
	virtual ~person(){             //added **
		cout<<"\n person destructor is called ";
		
	}	
	
	virtual void talk()
	{
		cout<<"\n person talk is called ";
	}
};
class teacher:public person {
	int sal;
	public:
		teacher()
		{
			
				cout<<"\n teacher constructor is called ";
		}
       ~teacher()
       {
       		cout<<"\n teacher destructor is called ";
	   }
	   void talk()
    	{
		cout<<"\n teacher talk is called ";
    	}


};

class student:public person{
	public:
	student()
	{
		cout<<"\n student constructor is called ";
	}
	~student() {
		cout<<"\n student destructor is called ";
	}
	void talk()
	{
		cout<<"\n student talk is called ";
	}
};


int main()
{

    person p;
    p.talk();
    
    /*
    person constructor is called
 person talk is called
 person destructor is called
--------------------------------
Process exited after 0.1248 seconds with return value 0
Press any key to continue . . .
*/
    
    
/*	person *pobj = new student();
	pobj->talk();
	delete pobj;
	pobj=new teacher();
	pobj->talk();
	
	delete pobj;  //now destructor will get called
*/	

/*
    return 0;
}


 person constructor is called
 student constructor is called
 person talk is called
 person destructor is called
--------------------------------
Process exited after 0.07879 seconds with return value 0
Press any key to continue . . .

After declaring person class talk() as virtual

 person constructor is called
 student constructor is called
 student talk is called
 person destructor is called
--------------------------------
Process exited after 0.0992 seconds with return value 0
Press any key to continue . . .



person constructor is called
 student constructor is called
 student talk is called
 person constructor is called
 teacher constructor is called
 teacher talk is called
 person destructor is called
--------------------------------
Process exited after 0.06543 seconds with return value 0
Press any key to continue . . .
Output           ** destructor in parent class is also virtual
 person constructor is called
 student constructor is called
 student talk is called
 student destructor is called
 person destructor is called
 person constructor is called
 teacher constructor is called
 teacher talk is called
 teacher destructor is called
 person destructor is called
--------------------------------
Process exited after 0.1972 seconds with return value 0
Press any key to continue . . .

_______________________________________________________

abstract class without using keyword abstract


declare one of the functions of base class as pure virtual function
then that class will become abstract class.


Virtual function
pure virtual function    ====   abstract class

all functions are pure virtual functions  ==== pure virtual abstract base class

*/




#include<iostream>
using namespace std;

class person{
	int id;
	public:
	person(){
		
		cout<<"\n person constructor is called ";
		}
	
	virtual ~person(){            
		cout<<"\n person destructor is called ";
		
	}	
	
	virtual void talk()=0;  //virtual function

};

class teacher:public person {
	int sal;
	public:
		teacher()
		{
			
				cout<<"\n teacher constructor is called ";
		}
       ~teacher()
       {
       		cout<<"\n teacher destructor is called ";
	   }
	   void talk()
    	{
		cout<<"\n teacher talk is called ";
    	}


};

class student:public person{
	public:
	student()
	{
		cout<<"\n student constructor is called ";
	}
	~student() {
		cout<<"\n student destructor is called ";
	}
	void talk()
	{
		cout<<"\n student talk is called ";
	}
};

int main()
{
	person *p=new student();
	p->talk();
	delete p;
	return 0;
}

/*
 person constructor is called
 student constructor is called
 student talk is called
 student destructor is called
 person destructor is called
--------------------------------
Process exited after 0.1033 seconds with return value 0
Press any key to continue . . ..


method hiding in C++

object slicing
anagram
paragram  - a-z



__________________________________________________________________
permutation of string
solution is by 2 ways, please dry run it and understand

uncomment here

#include<stdio.h>
#include<string.h>

void Permute1(char str[]);
void Permute1_rec(char str[], char* currentptr);

void Permute2(char str[]);
void Permute2_rec(char str[], int startIndex, int lastIndex);

void Swap(char *a, char *b);
int main(void)
{ 
	char str[10]="space";
	Permute1(str);
	printf("\n\n");
	Permute2(str);
	printf("\n");
	return 0;
}
void Permute1(char str[])
{
	Permute1_rec(str,str);
}
void Permute1_rec(char str[], char* currentptr)
{
	char *ptr;
   	if( *(currentptr + 1) == '\0')
	   printf("%s\t", str);
	else
	for(ptr=currentptr; *ptr!='\0'; ptr++)
    {
		Swap(ptr,currentptr);
		Permute1_rec(str, currentptr+1);
		Swap(ptr,currentptr);
	}
}
void Permute2(char str[])
{
	Permute2_rec(str,0,strlen(str)-1);
}
void Permute2_rec(char str[], int startIndex, int lastIndex)
{
	int i;
	if(startIndex==lastIndex)
	{
		for(i=0;i<=lastIndex;i++)
			printf("%c",str[i]);
		printf("\t");
	}
	else
	for(i=startIndex;i<=lastIndex;i++)
	{
		Swap(&str[startIndex], &str[i]);
		Permute2_rec(str,startIndex+1,lastIndex);
		Swap(&str[startIndex], &str[i]);
	}
}
void Swap(char *a, char *b)
{
	char temp = *a;  *a=*b; *b=temp;
}






*/ 













