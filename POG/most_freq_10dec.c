#include<stdio.h>
void printmostfrequentchar();
int main()
{

 char str[50]="ee33 33";
  printmostfrequentchar(str);
}

void printmostfrequentchar(char *str)
{

int i,j,k,max;
int arr[123];
char s[50];
char ch;
 strcpy(s,str);

  
for(j=0;j<123;j++)
arr[j]=0;

// for(i=0;str[i]!='\0';i++)
// {
//     s[i]=str[i];
// }


for(i=0;s[i]!='\0';i++)
{
    ch=s[i];
    if((ch>='0' && ch<='9') || (ch>='A' && ch<='B') || (ch>='a' && ch<='z'))
    {
        arr[ch]=arr[ch]+1;
     
    }

    for(j=i+1;s[j]!='\0';j++)
    {
         if(s[j]==ch)
    {
        arr[ch]=arr[ch]+1;
       
        s[j]='*';  // you can also use delete insted of *


        // for(k=j;s[k]!='\0';k++)
        // s[k]=s[k+1];

        // j=j-1;

    }   
    }
}

max=arr[0];
for(k=0;k<=122;k++)
{
    if(arr[k]>max)
    max=arr[k];
 
}

for(i=0;s[i]!='\0';i++)	// max value printer for loop
    {
     
        if((arr[s[i]]== max))
        printf("%c",s[i]);
    
	}	// end of for loop which we used to print max a

}