/* WAP 
Reverse words in a String 
sample INPUT : This is POG class
OUTPUT : sihT si GOP ssalc

choice - C , Java(split->foreach->reverse).

char str[50] = "This is POG class\0"
char tar[10][20];

tar[0]= "This\0";
tar[1]="is\0";
tar[2]="POG\0";
tar[3]="class\0";

j=k=0;

for(i=0 ; str[i]!='\0' ; i++)
{
	if(str[i]!=32) { tar[j][k]=str[i]; k++; } 
	else { tar[j][k]='\0'; k=0; j++; }
}
*/

/*Ma'am soludtion  java solution.
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
T h i s   i s   P O G     c  l  a  s  s




reverse_letters(char[] str , int start , int end )     // actural length of str .... 0 to strlen-1;
{
	int ws ,we ;
	for(ws=we=start,we<end;we++)
	{
		if(str[we]==' ' ) continue;
		ws=we;
		while(str[we]!=' ' &&  we<end )
		{
			we++;
		}
		
		if(we!=end) we = we -1 ;
		reverse(str,ws,we);		
	}
}

reverse(char[]str , int start , int end ) 
{
	char temp;
	while(start<=end )
	{
		temp= str[start]
		str[start]= str[end];
		str[end]=temp;
		start++;
		end--;
	}

}



/*
Q2.
reverse words of string 
sample input : this is POG class 
sample output: class POG is this
  
use reverse_words_in_string POG program ...

1st iteration : ssalc GOP si sihT 
2nd iteration : class POG is This ................again send 1st iteration string to reverse function only.
*/


//Ashutosh's answer:-
/*
#include <stdio.h>
#include<string.h>
int main(int argc, char const *argv[])
{
	char str[50] ="This is POG class";

	char i=0;
	char start=0,end=0;
	for(i=0;i<=strlen(str);i++)//itreate over char arr
	{
		
		//check for space
		if(str[i] == 32 || str[i] == '\0'){
			end=i-1;
			
			//revers string
			while(start < end )
			{
				char temp= *(str+start);
				(str+start) =(str+end);
				*(str +end) =temp;
				
				start++;end--;
			}
			start =i+1;
			// end=i-1;

		}
	}

	printf("%s\n", str);
	return 0;
}
*/




























