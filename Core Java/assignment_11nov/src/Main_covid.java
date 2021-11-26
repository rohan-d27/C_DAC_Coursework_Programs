import java.util.Scanner;

public class Main_covid {


		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			int [] covid_cases_nov_week_1=new int [7]; //array 
			
			//System.out.println("Enter The Size of Array:");
			//int size=sc.nextInt();
			//int [] covid_cases_nov_week_1=new int [size];
			/*
			covid_cases_nov_week_1[0]=0; //to give input hardcod
			covid_cases_nov_week_1[1]=0;
			covid_cases_nov_week_1[2]=0;
			covid_cases_nov_week_1[3]=0;
			covid_cases_nov_week_1[4]=0;
			covid_cases_nov_week_1[5]=0;
			covid_cases_nov_week_1[6]=0;
			 */
			for(int i=0;i<covid_cases_nov_week_1.length;i++)
			{
				covid_cases_nov_week_1[i]=0;
			}
			

			for(int i=0;i<covid_cases_nov_week_1.length;i++)    //for loop to add element to array 
			{
				System.out.println("Enter The Covid  Cases Number of "+(i+1)+" November:");
				covid_cases_nov_week_1[i]=sc.nextInt();

			}

			getTotalActiveCases(covid_cases_nov_week_1);


		}

		private static void getTotalActiveCases(int[] covid_cases_nov_week_1) {

			int total=0;
			for(int i=0; i<covid_cases_nov_week_1.length;i++)  //to get sum of all elements of array
			{
				total=total+covid_cases_nov_week_1[i];
			}
			System.out.println("Sum Of All Cases Of 1'st Week Of November:"+total);
		}



	
}
