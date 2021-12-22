#include <stdio.h>    
#include <math.h> // use math.h header file  
void main()  
{  
    // declaration of local variables i, bin_num, decimal_num = 0, rem;  
    int i, bin_num, decimal_num = 0, rem;  
    printf (" Enter the binary number with the combination of 0s and 1s \n");  
    scanf ("%d", &bin_num); // takes the binary number as the input  
      
    printf( " \n The binary number is %d", bin_num); // print the binary number  
    for (i = 0; bin_num != 0; ++i)  
    {  
        rem = bin_num % 10;  
        bin_num = bin_num / 10;  
        decimal_num = decimal_num + (rem) * ( pow (2, i));  
          
    }  
    // print the decimal number  
    printf ("\n Conversion from binary to decimal number is %d", decimal_num);  
   
}  
