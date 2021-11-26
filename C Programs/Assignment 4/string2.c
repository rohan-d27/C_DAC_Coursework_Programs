/*2. Write a program to read a string and find out the n number of vowels in that string.*/



#include<stdio.h>
int main()
{
	char ch[100];
	printf("Enter your string : ");
	scanf("%s",&ch);
	printf("\n\nYou have entered %s ",ch);
     vowel(ch);

	return 0;
}
void vowel(char *ch)
{
	int i,v=0;
	
    for(i=0;ch[i];i++)
	{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
			   v++;	
			}
			
	}
		printf("\n\nthere are %d vowels in the String ",v);


}

