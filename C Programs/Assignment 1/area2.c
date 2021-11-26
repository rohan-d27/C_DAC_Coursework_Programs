#include<stdio.h>
main(){
   int area;
   printf("\nEnter no. of your choice\n1 to find area of Triangle\n2 to ind area of Circle\n3 to find area of Rectangle");
   scanf("%d",&area);
   switch(area) {
      case 1: {
         float a,b,c;
         float area;
         printf("Enter base and height of triangle\n");
         scanf("%f%f",&a,&b,c);
         area=(a+b)/2;
         printf("Area of Triangle is %f\n",area);
         break;
      }
      case 2: {
         float radius,area;
         printf("Enter Radius of Circle\n");
         scanf("%f",&radius);
         area=(float)3.14159*radius*radius;
         printf("Area of Circle %f\n",area);
         break;
      }
      case 3: {
         float len,breadth,area;
         printf("Enter Length and Breadth of Rectangle\n");
         scanf("%f %f",&len,&breadth);
         area=(float)len*breadth;
         printf("Area of Rectangle is %f\n",area);
         break;
      }
      
   }
}