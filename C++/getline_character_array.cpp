#include <iostream>  
#include<string.h>  
using namespace std;  
int main()  
{  
char fruits[50]; // character array declaration  
cout<< "Enter your favorite fruit: ";  
cin.getline(fruits, 50); // implementing getline() function  
std::cout << "\nYour favorite fruit is :"<<fruits << std::endl;  
return 0;  
}  