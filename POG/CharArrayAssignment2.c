/*Char array assignment1_2 :
WAP that takes two strings from user and determine if they are anagram of each other or not;
Two words are called as anagram when second word is made after rearranging characters of first word.
e.g.   'cat' and 'act' are anagram.
		'dog' and 'god' are anagram.
		'goderty' and 'ertygod' are anagram.
Logic :
1. length should be same.
2. sort both words as array of character and then match both Strings , if they are same then anagram is true.
3. traverse first string ,remove the occurance of character from second string. Second string should be '\0' after the loop.  or we can also replace found character with * .
4. shifting the elements of second string  matches char in first string.
*/
//mystrlen , mystrcpy , mystrcmp , mystrcat , mystrrev , ispalindrome 

//#logic 4
#include <stdio.h>
#include <string.h>
int main(void)
{
	char str1[] = "moov";
	char str2[] = "voom";
	
	if(strlen(str1)!=strlen(str2))
	return 0;
	
	int flag = 0;
	int i,j ;
	char ch;
	for (i=0;str1[i]!='\0';i++)
	{
		for(j=0;str2[j]!='\0';j++)
		{
			if(str1[i]==str2[j])
			{
				flag=1;
				ch=str2[i];
				str2[i]=str2[j];
				str2[j]=ch;
				if(strcmp(str1,str2)==0) return 1;
			}
			
		}
		if(flag==0) return 0;
	}
	return 0;
}





















