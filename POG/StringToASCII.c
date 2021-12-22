/* write a program to convert user input string into ASCII 
output the string characters with their ASCII ..

NOTE : no APIs to be used . 
1.characters are stored in ASCII.
*/
#include <stdio.h>
int main(void)
{
	char str[50];
	int i;
	printf("Enter the string : ");
	gets(str);
	for(i=0 ;str[i]!='\0' ; i++)
	printf("\n %c  -  %d",str[i],str[i]);
	
	return 0;	
}
