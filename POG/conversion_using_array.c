#include<stdio.h>

void convert(int num , int *arr);
void del(int *s,int p);
int convertBinToDec(int *a);


int main(void)
{
	int res,num,N,M,arr[100];
	printf("Enter values of N and M :");
	scanf(" %d %d",&N,&M);
	for(num=N+1;num<M;num++)
	{
		convert(num,arr);
		res=covertBinToDec(arr);
		printf(" %d",res);
	}
}





void convert(int num , int *arr)
{
	int rem,i=0,j,cnt=0,t;
	while(num>0)
	{
		rem=num%2;
		arr[i]=rem;
		i++;
		num = num/2;
	}
	arr[i]=-999;
	
	for(j=0,i=i-1 ; j<i ; i--,j++)
	{
		t = arr[i];
		arr[i]=arr[j];
		arr[j]=t;	
	}
	
	for(i=0;arr[i]!=-999;i++)
	{
		if( (arr[i]==arr[i+1]) && (arr[i+1]==arr[i+2]) )
		{
			cnt=3 ;
			for(j=i+3;arr[i]==arr[j]&&arr[j]!=-999;j++)
			{
				cnt= cnt+1;
				if( (cnt >=3) && (cnt%2 == 1) )
				{
					j=j-1;
					while(cnt>2)
					{
						del(arr,j);
						j--;
						cnt--;
					}
				}
				else if( (cnt>2) && (cnt%2==0) )
				{
					j--;
					while(cnt>1)
					{
						del(arr,j);
						j--;
						cnt--;
					}
				}
			}
			
		}
		i=j;
	}
	
}



void del(int *s,int p)
{
	int i ;
	for(i=p;s[i]!=-999;i++)
	s[i]=s[i+1];
}

int convertBinToDec(int *a)
{
	int i, num=0,base=1;
	for(i=0;i>=0;i--)
	{
		num = num + a[i]*base;
		base= base*2;
	}
	return num;
}
