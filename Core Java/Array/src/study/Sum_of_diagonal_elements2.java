package study;

public class Sum_of_diagonal_elements2 { //second diagonal 02,11,20

	public static void main(String[] args) {
		int[][] arr= {{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
		int sum=0;
		int low=0;int high=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==low && j==high)
				{
					sum+=arr[i][j];
					low=low+1;
					high=high-1;
				}
				
			}
		}
		System.out.println(sum);
	}

}

