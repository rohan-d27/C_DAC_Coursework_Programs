#include<iostream>
using namespace std;
class Array {
		int *arr;
		int size;
	public:
		Array(int i) {
			size=i;
			arr=new int[size];// resourse alloacation
			cout<<"parameterized constructor called\n";
		}
		Array(Array &a) { //copy constructor
			cout<<"copy constructor is called\n";
			size=a.size;
			arr=new int[size];
			int i=0;
			for(i=0; i<size; i++) {
				arr[i]=a.arr[i];
			}
		}
		void operator=(const Array &a) { //operator overloading
			delete []arr;
			size=a.size;
			arr=new int[size];
			cout<<" = operator called\n";
			int i;
			for(int i=0; i<size; i++) {
				arr[i]=a.arr[i];
			}
		}
		~Array() { //destructor
			cout<<"Destructor is called\n";
			delete []arr;
		}

		void read_arr() {
			int i;
			for(i=0; i<size; i++) {
				cout<<"Enter a number\n";
				cin>> arr[i];
			}
		}
		void display() {
			int i;

			for(i=0; i<size; i++) {
				cout<< arr[i] <<" ";

			}
			cout<< " \n";
		}
};
int main() {
	Array obj(3);
	obj.read_arr();
	obj.display();
	/*Array new_obj(obj);//copy constructor called
	//new_obj=obj; //shallow copy
	new_obj.display();*/
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

