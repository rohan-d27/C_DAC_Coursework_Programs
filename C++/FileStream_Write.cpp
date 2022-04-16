#include <iostream>  
#include <fstream>  
using namespace std;  
int main () {  
  ofstream filestream("C:\\Users\\Dharurkar\\Downloads\\ROHAN_IMPORTANT\\A_PG_DAC\\Programs\\C++_Programs\\test.txt");  
  if (filestream.is_open())  
  {  
    filestream << "Welcome to C++\n";  
    filestream << "C++ File Stream Write Tutorial.\n";  
    filestream.close();  
     cout <<"File writing is successfull.";
  }  
  else cout <<"File opening is fail.";  
  return 0;  
}  