#include<iostream>
using namespace std;
class Complex{
	 int real;
	 int imag;
	 public: //access specifier
	 	void display()
	 	{
	 		cout << real << " + "<< imag  << "i\n";
	 		//cout << this->real << " + "<< this->imag  << "i\n";
	 		
	 	}
	 	Complex()//constructor
		 {
	 		real=0; //value has to be intialized
	 		imag=0;
	 	}
	 	Complex(int r,int i){
	 		real=r;
	 		imag=i;
	 	}
	 /*	Complex operator+(Complex &c)
	 	{
	 		
	 	}*/
	 	Complex operator+(Complex &c)
	 	{
	 		Complex t;
	 		t.real=real+c.real;
	 		t.imag=imag+c.imag;
	 		return t;
	 		
	 	}
};

int main() //outside class
{
	Complex c1(5,4);
	Complex c2(5,6);
	Complex c3;
	c3=c1+c2;// c3=c1.operator+(c2);
	c3.display();
	
	return 0;
}
