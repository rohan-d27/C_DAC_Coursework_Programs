    #include<stdio.h>  
    int main(){    
    int n,i,a=0,b=0;    
    printf("Enter the number to check prime:");    
    scanf("%d",&n);    
    a=n/2;    
    for(i=2;i<=a;i++)    
    {    
    if(n%i==0)    
    {    
    printf("Number is not prime");    
    b=1;    
    break;    
    }    
    }    
    if(b==0)    
    printf("Number is prime");     
    return 0;  
     }    