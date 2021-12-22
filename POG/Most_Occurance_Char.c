//WAP a program to print  most frequent character(s) in a string .
/*
validation : if input string is less than 2 char then print invalid input.(make functions if possible)
consider only letters and digits. Also consider uppercase and lowercase different.

input : "This is demo class"
output : 
T - 1 , h - 1 , i - 2 , s - 4 , d - 1 , e - 1.
A-Z = 26 , a - z = 26 , 0 - 9 = 10 ;
arr[0] - arr[9] --> counters of digits 0-9 ;
arr[10] - arr[35] --> counters of  A to Z ;
arr[36] - arr[61] --> counters of  a to z ;

_____________________________________________________________________
arr[122] .....................ASCII of z is 122

arr[48] will hold counter of 0's ........bcz ASCII of 0 is 48.


*/
#include<stdio.h>
#include<string.h>

void printmostfrequentchar(char *str);

int main(void)
{
	char str[]="AAAAAAA000009999zzzaaaaZZZZZ";
	printmostfrequentchar(str);
	
	return 0;
}

void printmostfrequentchar(char *str)
{
	int arr[62],i,j,k,max=0;
	char ch;
	char s[100];
	strcpy(s,str);
	for(i=0;i<62;i++)
	{
		arr[i]=0;
	}
	
	for(i=0;s[i]!='\0';i++)
	{
		ch=s[i];
		if( ch>=48 && ch <=57 )
			arr[ch-48]=arr[ch-48] + 1;
	
		else if( ch>=65 && ch<=90 )
			arr[ch-55]=arr[ch-55] + 1;
		
		else if( ch>=97 && ch <=122 )
			arr[ch-61]=arr[ch-61] + 1;
		

		for(j=i+1;s[j]!='\0';j++)
		{
			if( ch==s[j])
			{
				if( ch>=48 && ch <=57 )
					arr[ch-48]=arr[ch-48] + 1;
				
				else if( ch>=65 && ch<=90 )
					arr[ch-55]=arr[ch-55] + 1;
				
				else if( ch>=97 && ch <=122 )
					arr[ch-61]=arr[ch-61] + 1;	
					
				for(k=j;s[k]!='\0';k++)
					s[k]=s[k+1];
					
				j=j-1;
					
			}
		}
	}
	
	max=arr[0];
	for(i=1;i<62;i++)
	{
		if(arr[i]>max)
		max=arr[i];
	}
	
	for(i=0;s[i]!='\0';i++)
	{
		if( s[i]>=48 && s[i]<=57)
		{
			if( arr[s[i]-48]==max )
			{
				printf(" %c , ",s[i]);
			}
		}
		
		else if( arr[s[i]>=65] && arr[s[i]<=90] )
		{
			if( arr[s[i]-55]==max)
			{
				printf(" %c , ",s[i]);	
			}
		}
		
		else if( arr[s[i]>=97] && arr[s[i]<=122] )
		{
			if( arr[s[i]-61]==max)
			{
				printf(" %c , ",s[i]);	
			}
		}
	}
}














































