#include<stdio.h>
int main()
{
	
	char str[] = "This is POG Class";
	reverse_letters(str,0,strlen(str));
	printf("%s",str);
	
}
int reverse_letters(char str[],int start,int end)
{
	int ws,we;
	for(ws=we=start;we<end;we++)
	{
		if(str[we]==' ') continue;
		ws=we;
		while(str[we]!=' '&& we<end) we++;
		if(we!=end) we=we-1;
		reverse(str,ws,we);
 	}
return 0;
}
 int reverse(char str[],int start,int end)
 {
 	char temp;
 	while(start<=end)
 	{
 		temp=str[start];
 		str[start]=str[end];
 		str[end]=temp;
 		start++;
 		end--;
	 }
return 0;	 
 }
