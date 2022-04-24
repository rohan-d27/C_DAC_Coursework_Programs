import java.util.Scanner;
/*prime rangers

you are given [L,R] you are required to determine the prime rangers in this range.
The definition of prime rangers is that frequency of the smallest prime digit must be greater than or equal to the 
frequency of the second smallest prime digit in a number the frequency of the second smallest prime digit is greater than 
or equal to the frequency of the third smallest prime digit in a number and so on
Note:
the number of prime rangers may become very large therefore print the prime ranger modulo 10^9+7
input format:
the first line contains an integer T denoting the number of test cases
next T lines contains two spaced seperated integer L and R denoting the range in which you have to find the prime rangers

output format:
print number of prime rangers modulo 10^9+7

constraints :
1<=T<=5
1<=L<=R<=10^18

sample input1:
2
1 10
31 32

sample output1
7
1

explanation:
testcase1:
the number 3 5 and 7 are not prime rangers because in these numbers frequency of 2 is 0 but the 
frequency of the prime number greater than 2 is 1

testcase2:

the number 32 is a prime ranger because the frequency of 2 is 1 and the frequency of 3 is 1 
which satisfies the condition that the frequency of the smallest prime digit 2 is greater than equal to the 
frequency of the second smallest prime digit.
 * */
public class PrimeRanger {

	static void findRange(int a,int b) {
		int i=0;
		boolean res;
		int pr=0;
		for(i=a;i<=b;i++) {
		res=returnRR(i);
		if(res) {
		pr++;
		}

			}
			System.out.println(pr);
		}

		private static boolean returnRR(int i) {
			// TODO Auto-generated method stub
			int count2=0;
			int count3=0;
			int count5=0;
			int count7=0;
			while(i>0) {
				int num=i%10;
		        if(num == 2){
		            count2 ++;
		        }
		        else if (num == 3){
		            count3 ++;
		        }
		        else if (num == 5){
		            count5 ++;
		        }
		        else if (num == 7){
		            count7 ++;
		        }
		        i = i/10;
		    }
		    if (count2 >= count3 && count3 >= count5 && count5 >= count7)
		    {
		        return true;
		    }
		    else
		    {
		        return false;
		    }

		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			for(int i=0;i<a;i++){
			
			int p1=	sc.nextInt();
			
			int p2 = sc.nextInt();
			findRange(p1,p2);

		        }
			sc.close();
			}
		

}
