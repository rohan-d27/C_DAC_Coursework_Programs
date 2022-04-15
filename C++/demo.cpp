/* Good morning!!

C++ contents for Interview FAQs 
Stimula, Smalltalk

C++ is not first OOP  1990s
programs of C are subset of C++

New features included in C++

1. reference variable
2. function overloading and operator overloading
3. bool data type
    non zero means true
    zero value means false
    
    
    
4. const - same as final in Java



Pointers and reference

int main()
{
  
  int &ref = i;
  int &ref1;   //error

  ref=ref+10;


  ref and i are diff names to same 
  variable / memory location

1. POINTER 
  It is not necessary to define the pointer variable at
  the time of declaration
  
  int i;
  int *ptr;
  ptr = &i;
  
 
  
  REFERENCE
  It is necessary to initialize the reference variable at
  the time of declaration
  
   int i=10;
   int &ref = i;

   int &ref1; //error
   
2. POINTER
   We can have array of pointers  
   
   int *p[5];
   
   REFERNCE
   We can not have   array of references
   
3. You can assign NULL to pointer

  int *p=NULL;
  
  REFERENCE
   You can not assign NULL  
  int &ref=NULL;  //ERROR
  
4. POINTER
  You can use pointer to a pointer
  int i=10;
  int *ptr=&i;
  int **ptr=&ptr; 
  
  REFERENCE 
  You can not have reference to reference
  
5. POINTER
   You can reassign a pointer variable 
   int i,j;
   i=10; j=20;
   int *ptr;
   ptr=&i;
   ...
   ...
   ptr=&j;
   
   REFERENCE
 
   you can not reassign a reference

   int &ref=i;     

Use of REFERENCE:
  When you want to pass object into function, generally 
  reference is used


#include<iostream>
using namespace std;

void calculate(int,int,int &,int &,int &); //prototype


int main()
{
	 int num1=10;
	 int num2=20;
	 int add, sub, mul;
	 calculate(num1,num2,add,sub,mul);
	 cout<<"Addition ="<<add;
	 cout<<"Subtration ="<<sub;
	 cout<<"Multiplication ="<<mul;
     return 0;
}


void calculate(int a, int b, int &sum, int &s, int &m)
{         //int a=num1  int b=num2   int &sum=add
	sum=a+b;
	s=a-b;
	m=a*b;
}




Addition =30Subtration =-10Multiplication =200
--------------------------------
Process exited after 0.1721 seconds with return value 0
Press any key to continue . . .


#include<iostream>
using namespace std;
void swap_val(int,int);
void swap_add(int *,int *);
void swap_ref(int &,int &);

int main()
{
	int x=15,y=25;
	swap_val(x,y);
	cout<<"\n by Value x = "<<x<<" y= "<<y;
	swap_add(&x,&y);
	cout<<"\n by Address x = "<<x<<" y= "<<y;
	swap_ref(x,y);
	cout<<"\n by reference x = "<<x<<" y= "<<y;
	return 0;
}

void swap_val(int a,int b)
{
	int t;
	t=a;
	a=b;
	b=t;
}

void swap_add(int *a,int *b)
{
	int t;
	t=*a;
	*a=*b;
	*b=t;
}

void swap_ref(int &a,int &b)
{
	int t;
	t=a;
	a=b;
	b=t;
}

  by Value x = 15 y= 25
 by Address x = 25 y= 15
 by reference x = 15 y= 25
--------------------------------
Process exited after 0.08699 seconds with return value 0
Press any key to continue . . .

#include<iostream>
using namespace std;
class complex{
  int real;
  int imag;
  
  public:
  void display(int i)  //void display(complex *this, int i)
  {
  	cout<<real<<" + "<<this->imag<<"i\n";
  }
  complex() { real=0; imag=0; }
  complex(int r,int m) { real=r; imag=m; }
};

int main()
{
  complex c1(3,4);
  c1.display();     //display(complex &c1)
  c1.set_real(9);  //set_real(complex &c1,int)
  return 0;
}

/*3 + 4i

--------------------------------
Process exited after 0.09472 seconds with return value 0
Press any key to continue . . .


this pointer:   pointer to current object / calling object



operator overloading

Idea is to write expression with aithemtic operator 

complex c1,c2;
complex c3 = c1 + c2;

operators : +, -, *, /, %, < >, <=, >=, ==, =
           [],  +=, -=, *=, /=, %=
           
will not overload - :: (scope resolution operator),
                 new,  sizeof(), .










#include<iostream>
using namespace std;
class complex{
  int real;
  int imag;
  
  public:
  void display()  //void display(complex *this)
  {
  	cout<<real<<" + "<<this->imag<<"i\n";
  }
  complex() { real=0; imag=0; }
  complex(int r,int m) { real=r; imag=m; }
  complex operator+(complex &c)
  {
  	 complex t;
  	 t.real=real+c.real;
  	 t.imag=imag+c.imag;
  	 return t;
  }
};

int main()
{
  complex c1(3,4),c2(2,6),c3;
  c1.display();     //display(complex &c1)
  c3=c1+c2;    //c3 = c1.operator+(c2);
  c3.display();
  complex c4(c3);
  c4.set_real(90);
  
  return 0;
}
/*
3 + 4i
5 + 10i

--------------------------------
Process exited after 0.08446 seconds with return value 0
Press any key to continue . . .


C++ - comes with a lot of responsibility

because in case u have a pointer in class for which 
you are allocating memory on demand at run time, it is
your responsibility to 

1. release that memory (write destructor)
2. write copy constructor (deep copy)
3. overload assignment operator (=)
 


C++ 




constructor

copy constructor : when one object is getting copied 
into another object

deep copy vs shallow copy

Compiler gives copy constructor, which is default copy
constructor. It copies object to another object
byte - by - byte.





*/

#include<iostream>
using namespace std;
class Array{
 int *arr;
 int size;
 
 public:
 Array(int i)
 {
   size=i;
   arr=new int[size]; //resource allocation
   cout<<"para constr is called \n";
 }
 
 Array(Array &a)
 {
 	cout<<"copy constructor is called \n";
 	size=a.size;
 	arr=new int[size];
 	int i;
 	for(i=0;i<size;i++)
 	  arr[i]=a.arr[i];
 }
 
 void operator =(const Array &a)
 {
 	delete []arr;
 	size=a.size;
 	arr=new int[size];
 	cout<<"= operator is called \n";
 	int i;
 	for(i=0;i<size;i++)
 	  arr[i]=a.arr[i];
 	
 }
 
 
 
 ~Array()
 {
    cout<<"Destructor is called "<<endl;
	delete []arr;
    
 }

 void read_arr()
 {
   int i;
   for(i=0;i<size;i++)
   {
      cout<<"Enter a number :";
	  cin>>arr[i]; 
   }
 }
 
 void display()
 {
   int i;
   cout<<"arr = "<<arr;
   for(i=0;i<size;i++)
   {
      cout<<arr[i]<<"   "; 
   }
   cout<<"\n";
  }
};

int main()
{
  Array obj(5); 
  
  obj.read_arr();  
  
 /* 
  cout<<"obj : ";
  obj.display();
  
  
  Array new_obj(obj);
  
  cout<<"new_obj : ";
  new_obj.display();
  
  new_obj.read_arr();
  
  cout<<"obj : ";
  obj.display();
  
  cout<<"new_obj : ";
  new_obj.display();
  
  
  
*/ 
  Array my_obj(3);
  my_obj.read_arr();
  cout<<"my_obj : ";
  my_obj.display();
  
  
  
  
  my_obj = obj;
  cout<<"my_obj : ";
  my_obj.display();
  
  
  my_obj.read_arr();
  
  cout<<"my_obj after change: ";
  my_obj.display();
  
  cout<<"obj : ";
  obj.display();
  
  return 0;
}

/*
para constr is called
copy constructor is called
para constr is called
Enter a number :1
Enter a number :2
Enter a number :3
my_obj : 1   2   3
Enter a number :4
Enter a number :5
Enter a number :6
Enter a number :7
Enter a number :8
obj : 4   5   6   7   8
= operator is called
my_obj : 4   5   6   7   8
new_obj : 2054288   0   2031952   0   0
Enter a number :1
Enter a number :2
Enter a number :3
Enter a number :4
Enter a number :5
new_obj after change: 1   2   3   4   5
obj : 4   5   6   7   8
Destructor is called
Destructor is called
Destructor is called

--------------------------------
Process exited after 32.65 seconds with return value 0
Press any key to continue . . .


diamond problem  -  Why multiple inheritance is not given in Java?
Ans: To avoid diamond problem



virtual function

abstract class

v-table, v-ptr


In Java Inheritance is by-default
In Java every non static function is 
    virtual function






*/











  













