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
};

int main() //outside class
{
	Complex c1(3,4);

	c1.display();
	Complex c;
	c.display();
	return 0;
}
