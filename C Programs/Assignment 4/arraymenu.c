/*7. Write a menu driven program to read 5 array elements & then find out 
  A )how many of them are +ve
  b) how many of them are -ve
  c) how many of them are even
  d) how many of them are odd*/
 

#include <stdio.h>

int main()
{
  int count=0,count1=0,count2=0,count3=0;
  int arr[5],c;
  read_array(arr);
  display(arr);
  
  
	    while(1)
	  {
	  	
	  	printf("\n1.how many numbers are positive\n2.how many numbers are negative\n3.how many numbers are even\n4.how many numbers are odd\n5.Exit");
	  	printf("\nEnter the choice");
	  	scanf("%d",&c);
	  	if(c==5)
	  	{
	  	  break;	
	  	}
	        if(c==1)
	       {
	  		pos(arr,&count);
			printf("Number of postive element is %d",count);
	  		break;
	        }
			if(c==2)
	       {
	  	    neg(arr,&count1);
	  		printf("Number of negaive  element is %d",count1);
	  		break;
	        }
	        if(c==3)
	       {
	  		even(arr,&count2);
	  		printf("number of even elements is %d",count2);
			break;
	        }
	        if(c==4)
	       {
	  		odd(arr,&count3);
	  		printf("number of odd elements is %d",count3);
	  		break;
	        }
	return 0;
	}
}
void read_array(int arr[])
{
	int i;
	printf("\n\nEnter elements of the array \n");
	for(i=0;i<=4;i++)
	{
		scanf("%d",&arr[i]);	
	}	
}
void display(int arr[])
{
	int i;
	for(i=0;i<=4;i++)
	{
	printf("%d\t",arr[i]);
    }
}

void pos(int arr[],int *count)
{
	int i;
	//*count=0;
	for(i=0;i<=4;i++)
	{
		if(arr[i]>0)
		{
			*count=*count+1;
		}
	}
	
}
void neg(int arr[],int *count1)
{
	int i;
	*count1=0;
	for(i=0;i<=4;i++)
	{
		if(arr[i]<0)
		{
			*count1=*count1+1;
		}
	}
	
}


void even(int arr[],int *count2)
{
	int i;
	*count2=0;
	for(i=0;i<=4;i++)
	{
		if(arr[i]%2==0)
		{
			*count2=*count2+1;
		}
		
    }
    

}
void odd(int arr[],int *count3)
{
	int i;
	*count3=0;
	for(i=0;i<=4;i++)
	{
		if(arr[i]%2!=0)
		{
			*count3=*count3+1;
		}	
    }
}



