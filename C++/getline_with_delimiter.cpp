#include <iostream>  
#include<string.h>  
using namespace std;  
int main()  
{  
string profile; // variable declaration  
std::cout << "Enter your profile :" << std::endl;  
getline(cin,profile,' '); // space will be used as delimiter character
//will take input only before space
// implementing getline() function with a delimiting character.  
cout<<"\nProfile is :"<<profile;  
}  