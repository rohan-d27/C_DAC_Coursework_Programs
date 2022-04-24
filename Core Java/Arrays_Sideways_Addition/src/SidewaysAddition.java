/*For 3*3 matrix only*/
public class SidewaysAddition {
 
	public static void main(String[] args) {
		int [][] mat= { {10,20,30},
						{40,50,60},
						{70,80,90} };
		int n=3;//3*3 matrix
		int st=mat[0][0];
		int bt=mat[2][2];
		int secondary=0;
		int beforeSecondary=0;
		int afterSecondary=0;
		  for (int i = 0; i <= 2; i++) {
		 
            for (int j = 0; j < n; j++)  {
            	 if ((i + j) == (n - 1)) //sum of secondary diagonal element
            	 { 
            		 secondary += mat[i][j];
            	 }
            	 if((i+j)==(n-2))
            	 {
            		 beforeSecondary+=mat[i][j];
            	 }
            	 if((i+j)==n)
            	 {
            		 afterSecondary+=mat[i][j];
            	 }
            }
			
		}
		  System.out.println(st+" "+beforeSecondary+" "+secondary+" "+afterSecondary+" "+bt );
	}
	
}
