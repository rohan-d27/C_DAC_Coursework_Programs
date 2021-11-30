#include<stdio.h>
#include<unistd.h>
void editor()  //without threading
{
	while(1)
	{
		printf("editor code ");
	}
}
void spellchecker()
{
	while(1)
	{
		printf("spellchecker code");
	}
}
void main()
{
	editor();
	spellchecker();
}

