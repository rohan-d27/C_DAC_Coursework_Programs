/*Write a program to accept details of the book display book
and calculate discount based on condition
if book price is > 500 then give 10% discount
and display the new price*/

/*using pointers*/



#include<stdio.h>


struct Book
{
	int bookid;
	char bookname[20];
	char authorname[20];
	float bookprice;	
};
int main()
{
	struct Book bk;
	accept(&bk);
	discount(&bk);
	return 0;
	
}
void accept(struct Book *bk)
{
	
	printf("Enter following details of the Book : \n1.Book Id: \n2.Book Name: \n3.Author Name: \n4.Book Price:\n");
	scanf("%d%s%s%f",&bk->bookid,&bk->bookname,&bk->authorname,&bk->bookprice);
	printf("\nYou have entered book details as following: \nBook Id: %d  \nBook Name:%s  \nAuthor Name:%s  \nBook Price:Rs %f",bk->bookid,bk->bookname,bk->authorname,bk->bookprice);
}
void discount(struct Book *bk)
{
	if(bk->bookprice>=500)
	{
		bk->bookprice=bk->bookprice-((bk->bookprice)/10);
		printf("\nCongrats!!! You got 10 percent discount final price is Rs %f ",bk->bookprice);
	}
	else
	{
		printf("\n Sorry!! You are not eligible for any discount.");
	}
	}
	
