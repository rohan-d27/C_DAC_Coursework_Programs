/*Char array assignment1_1 :
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
//user defined : mystrlen , mystrcpy , mystrcmp , mystrcat , mystrrev , ispalindrome 


#include <stdio.h>

int mystrlen(char a[]);
char* sort(char a[] , int len);
int mystrcmp(char *s1,char *s2);

int main(void)
{
	char str1[] ="goderty";
	char str2[] ="ertygod";
	
	int len1 = mystrlen(str1);
	int len2 = mystrlen(str2);
//	printf("Length of str1 : %d",len1);
//	printf("\nLength of str2 : %d",len2);
	
	char * STR3 = sort(str1 , len1);
	char * STR4 = sort(str2 , len2);
//	printf("\n %s ",STR3);
//	printf("\n %s ",STR4);

	if(mystrcmp(STR3,STR4) ==0)	printf("They are anagrams of each other :)");
	else printf("OOPS...they are not anagrams of each other :(");
	

	
}

int mystrlen(char a[]) 		//OR  	int mystrlen(char * a) 
{
	int i;
	for(i=0 ; a[i]!='\0' ;i++);
	
	return i;
	
}

char* sort(char a[] , int len)
{
	int i , j;
	char temp;
	for(i=0 ; i<len-1 ; i++)
	{
		for(j=i+1;j<len;j++)
		{
			if((a[i])>(a[j]))
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		
	}
	return a;
}

int mystrcmp(char *s1,char *s2)
{
	int i=0;
	while( s1[i]!='\0' && s2[i] !='\0')
	{
		if(s1[i]==s2[i]) i++;
		else if (s1[i]>s2[i]) return 1;
		else return -1;
	}
	return 0;
}

// Ashutosh's answer :-
/*

#include <stdio.h>
#include <string.h>

int ifequal(char *str1,char *str2){
	int i;
	for(i=0;str1[i]==str2[i];i++)
		if(str1[i]=='\0') return 1;
	return (str1[i]-str2[i]);

	// int i=0,j=0,cnt=0;


	// while(str1[i] == str2[j]){i++;j++; cnt++;	printf(" in ifequal %c \n",str1[i] );}
	// if(cnt == strlen(str1)) return 1;
	// else	return 0;

}
int anagram(char *str1,char *str2){
	int  i; //index for str1
	int  j; //index for str2

	for(i=0;i<strlen(str1);i++){
		printf(" in anagram %c \n",str1[i]);
		for(j=0;j<strlen(str2);j++){
			//check if same swap with index i
			if(str1[i] == str2[j]){
				char temp =str2[i];
				str2[i] =str2[j];
				str2[j] = temp;
			}
		}
	}
	//if str1 == str2 return 1
			int  eq =ifequal(str1,str2);
			if(eq == 1) return 1;

	return 0;
}
int main(int argc, char const *argv[])
{
	char str1[50];
	char str2[50];

	//input
	printf("Enter string 1 \n");
	gets(str1);
	printf("Enter String 2 \n");
	gets(str2);

	//check length
	if(strlen(str1) == strlen(str2)){
		//if string equal 
		int is_anagram=anagram(str1,str2);
		if(is_anagram == 1)
			printf("Is Anagram\n");
		else
			printf("Not Anagram\n");
	}


	// printf("%d\n",strlen(str1) );
	//check length

	// int i=0;
	// int 
	// while(str1[i] != '\0' && str2[]){i++;}


	return 0;
}
*/

