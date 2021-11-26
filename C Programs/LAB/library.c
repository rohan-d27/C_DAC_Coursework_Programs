/*Q2. Write a menu driven program in 'C' which shows the working of library.
The menu option should be Accept information for ‘n’ books 
from user and accordingly allocate memory to the structure.
i) Add book details.
ii) Display book details.
iii) List all books of given author.
iv) List the count of books in the library.
v) Exit.*/


#include<stdio.h>
#include<stdlib.h>

struct Book
{
	int id;
	char name[20];
	char author[20];
	int  price;	
};

int main()
{
	int n;
	printf("Enter number of books: ");
	scanf("%d",&n);
	struct Book b[n];
	accept(b,n);
	menu(b,n);
	void accept(struct Book b[],int n);
	void menu(struct Book b[],int n);
	void display (struct Book b[],int n);
	void listauthor (struct Book b[], int n);
	void listbook (struct Book b[], int n);



	return 0;
	
}
void menu(struct Book b[],int n)
{
	int c;
	void accept(struct Book b[],int n);
	void display (struct Book b[],int n);
	void listauthor (struct Book b[], int n);
	void listbook (struct Book b[], int n);
	printf("Enter your choice: \n1.Add book details \n2.Enter id to look book details \n3.List all books of given author \n4.List the count of books in the library \n");
	scanf("%d",&c);

	if(c==1)
	{
	
	    int n=n;
	   	printf("\n Enter following details:\n1.Book Id \n2.Book name \n3.Book Author \n4.Book Price: \n");
		scanf("%d%s%s%d",&b[n].id,&b[n].name,&b[n].author,&b[n].price);
		menu(b,n);
	}
	if(c==2)
	{
		display(b,n);
	}
	if(c==3)
	{
		listauthor(b,n);
	}
	if(c==4)
	{
		listbook(b,n);
	}
	display(b,n);
	listauthor(b,n);
	listbook(b,n);
}
void accept(struct Book b[],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("\n Enter following details:\n1.Book Id \n2.Book name \n3.Book Author \n4.Book Price:\n");
		scanf("%d%s%s%d",&b[i].id,&b[i].name,&b[i].author,&b[i].price);
		
	}
}

void display (struct Book b[], int n)
{
	int i,z;
	printf("Enter book id:");
	scanf("%d",&z);
	for(i=0;i<=n;i++)
	{
		if(b[i].id==z)
	{
		printf("\nBook id:%d \nBook name:%s \nBook Author:%s \nBook Price:%d ",b[i].id,b[i].name,b[i].author,b[i].price);
	}	
	}
	
}

void listauthor (struct Book b[], int n)
{
	int i;
	char m[20];
	printf("\nEnter Authors name: ");
	scanf("%s",&m);
	for(i=0;i<=n;i++)
	{
		if(b[i].author==m)
		{
			printf("\n%s\n",b[i].name);
		}	
	}
}

void listbook (struct Book b[], int n)
{
	int i;
	printf("There are total %d books in library",n);
	for(i=0;i<=n;i++)
	{
	 printf("\nBook id:%d \nBook name:%s \n Book Author:%s \nBook Price:%d ",b[i].id,b[i].name,b[i].author,b[i].price);
	
	}	
	
}

