/*5. Write a Menu driven program to do
1.String copy
2.String Concat
3.String compare
4.String reverse
5.Convert to Upper case
6.Convert to Lower case*/


#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
	int i,c;
	char ch[10],bh[10];
	printf("\nEnter a string:\n");
	scanf("%s",&ch);
	void display(char ch[]);
	display(ch);
	printf("\nEnter a choice from the following:\n1.String Copy: \n2.String Compare: \n3.String Concat: \n4.Convert String to Upper Case: \n5.Convert String to Lower Case:\n");
	scanf("%d",&c);
	void copy(char ch[],char bh[]);
	void compare(char ch[],char bh[]);
	void concat(char ch[],char bh[]);
	void toUpper(char ch[],char bh[]);
	void toLower(char ch[],char bh[]);
	
	if(c==1)
	{
	   copy(ch,bh);
	}
	if(c==2)
	{
		compare(ch,bh);
	}
 	if(c==3)
	{
		concat(ch,bh);
	}
	if(c==4)
	{
		toUpper(ch,bh);			
	}
	if(c==5)
	{
		toLower(ch,bh);
		printf("After convertintg to lowercase:%s",bh);		
    }
	return 0;	
}
void display(char ch[])
{
	printf("\nYour string is:%s",ch);
}

void copy(char ch[],char bh[])
{
	int i=0;
	display(ch);
    while(ch[i]!='\0')
    {
    	bh[i]=ch[i];
    	i++;
    }
    printf("\nCopied string is:%s",bh);	
}

void compare(char ch[],char bh[])
{
		printf("\nEnter string to compare:\n");
		scanf("%s",&bh);
		int i=0;
		while(ch[i]!='\0')
		{
			if(bh[i]==ch[i])
			{
				
			}
			else
			{
				printf("\nstring is not same");
			}
			i++;
		}
		printf("\nstring is same ");	
}

void concat(char ch[],char bh[])
{
	    printf("\nEnter string to concat\n");
		scanf("%s",&bh);
		int i=0;
		strcat(ch,bh);
		printf("\n String after concat %s:",ch);	
}

void toUpper(char ch[],char bh[])
{
	        int i=0;
			while(ch[i]!='\0')
			{
				bh[i]=ch[i]-32;
				i++;
			}
			printf("After convertintg to Uppercase:%s",bh);	
}

void toLower(char ch[],char bh[])
{
	        int i=0;
			while(ch[i]!='\0')
			{
				bh[i]=ch[i]+32;
				i++;
			}
			ch[i]='\0';		
		
}

