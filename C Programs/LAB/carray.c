
//shrinivas


#include <stdio.h>

int main()
{

	char name[100];
	
	printf("Enter your name: \n");
	//scanf("%s", name);
	gets(name);
	
	printf("Okey, your name is : %s\n", name);
	return 0;
}
