/*
The cin is an object which is used to take input from the user 
but does not allow to take the input in multiple lines. 
To accept the multiple lines, we use the getline() function. 
It is a pre-defined function defined in a <string.h> 
header file used to accept a line or a string from 
the input stream until the delimiting character is encountered.
*/
#include <iostream>  
#include<string.h>  
using namespace std;  
int main()  
{  
string name; // variable declaration.  
std::cout << "Enter your name :" << std::endl;  
getline(cin,name); //ip=abc dfe op=abc dfe
//cin>>name;// ip=abc dfe op=abc
cout<<"\nHello "<<name;  
return 0;}  