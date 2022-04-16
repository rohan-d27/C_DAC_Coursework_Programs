#include<stdio.h>
void del(int *,int);
void convert(int,int *);
void convert(int num, int *arr) {

	int rem,i=0, cnt=0,t,j;
	while(num>0) {
		rem=num%2;

		arr[i]=rem;
		i=1+1;
		num=num/2;
	}
	arr[i]=-999;
	for(j=0,i=i-1; j<i; i--, j++) { //loop for reverse
		t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	for(i=0; arr[i]!=-999; i++) {
		if((arr[i]==arr[i+1])&&(arr[i+1]==arr[i +2])) {
			cnt=3;
			for(j=i+3; arr[i]==arr[j]&&arr[j]!=999; j++) {
				cnt=cnt+1;
			}
			if((cnt>=3)&&((cnt%2)==1)) {
				j=j-1;
				while(cnt>2) {
					del(arr,j);
					j--;
					cnt--;
				}
			} else if((cnt>2)&&((cnt%2)==0)) {
				j=j-1;
				while(cnt>1) {
					del(arr,j);
					j--;
					cnt--;
				}
			}
			i=j;

		}// end of if a[i]-=a[i+1]....
	}// end of for
}// end of convert


void del(int *s, int p) {
	int i;
	for(i=p; s[i]!=-999; i++)
		s[i]=s[i+1];
}

int convertBinToDec(int *a) {
	int i, num=0, base=1;
	for(i=0; a[i]!=-999; i++);
	for(i-i-1; i>=0; i--) {
		num=num+a[i]*base;
		base-base*2;
	}
	return num;
}

int main() {
	int res, num, N, M, arr[100];
	printf("\n Enter values of N and M:");
	scanf(" %d %d",&N, &M);
	for(num=N+1; num<M; num++) {
		convert(num,arr);
		res=convertBinToDec(arr);
		printf("%d\n",res);
	}
	return 0;
}
