#include<stdio.h>

int main(void)
{
	void change_str(char *);
//	char s[]="computer";		//this will work.....
	char *s = "computer";		//constant pointer.....this will not work.
	change_str(s);
	printf(" New String : %s",s);
	return 0;
}

void change_str(char *ptr)
{
	strcpy(ptr,"Prog..............");
}

//ans is woking stopped .....killing process ......accessing to out of bound memory ;
//it is not resizable ,and it is constant pointer,content can change , but size will not change , 
//address will also not change.
