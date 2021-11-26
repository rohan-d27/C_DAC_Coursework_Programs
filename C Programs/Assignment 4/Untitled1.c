/*Q1.Write a user defined function to calculate area and perimeter of a circle and display the result in main. (Make use of call by address).
void Find_AreaPeri(int radius,float *area,float *perimeter)*/

#include<stdio.h>

int main()
{
	float rad,area,peri;
	printf("Enter radius of circle ");
	scanf("%f",&rad);
	
	find_AreaPeri(&rad,&area,&peri);
	
	printf("Radius is %f",rad);
	printf("\nArea is %f",area);
	printf("\nPerimeter is %f",peri);
	return 0;
	
	

}
void find_AreaPeri(float *rad,float *area,float *peri)
{
	*area= 3.1415*(*rad)*(*rad);
	*peri= 2.0*3.1415*(*rad);
	return;
}




