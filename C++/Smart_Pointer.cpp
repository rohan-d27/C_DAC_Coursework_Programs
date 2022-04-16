/*
Create a class with a pointer, overloaded operators(->, *) and destructors.
The destructor will be automatically called when its object goes out of the scope, 
and automatically the dynamically allocated memory will be deleted.
*/

#include <iostream>  
using namespace std;  
  
template <class T> // Create a template class   
class SmartPtr {  
    T* ptr; // Actual pointer  
public:  
    // Constructor  
    explicit SmartPtr(T* p = NULL) { ptr = p; }  
  
    // Destructor  
    ~SmartPtr() { delete (ptr); }  
  
    // Overloading dereferncing operator  
    T& operator*() { return *ptr; }  
  
    // Overloading arrow operator so that  
    // members of T can be accessed  
    // like a pointer (useful if T represents  
    // a class or struct or union type)  
    T* operator->() { return ptr; }  
};  
  
int main()  
{  
    SmartPtr<int> ptr(new int());  
    *ptr = 100;  
    cout << *ptr;  
    return 0;  
}  