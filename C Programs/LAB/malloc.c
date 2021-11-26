/*malloc function - (void *)malloc (size of ((datatype));*/

int main()
{
	int *ptr=(int *)malloc (sizeof(int)*5);   //heap
    int i;   
    for(i=0;i<5;i++)
{
	ptr[i]=10;
}
    printf("\nData in memory is :");
    for(i=0;i<5;i++)
{
	printf("\n%d",ptr[i]);
}
   free(ptr);

}

