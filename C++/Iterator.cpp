#include <iostream>  
#include<iterator>  
#include<vector>  
using namespace std;  
int main()  
{  
   std::vector<int> v{1,2,3,4,5};  
   vector<int>::iterator itr;  
   for(itr=v.begin();itr!=v.end();itr++)  
   {  
       std::cout << *itr <<" ";  
   }  
    return 0;  
}  