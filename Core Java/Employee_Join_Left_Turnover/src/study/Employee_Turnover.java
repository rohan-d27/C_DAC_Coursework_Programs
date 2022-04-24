package study;

public class Employee_Turnover {

	public static void main(String[] args) {
		int[][][] arr = { { { 760, 0 }, { 280, 120 }, { 179, 92 }, { 148, 88 }, { 160, 72 }, { 193, 96 } },

				{ { 1200, 0 }, { 272, 120 }, { 240, 128 }, { 236, 96 }, { 256, 100 }, { 288, 112 } },

				{ { 880, 0 }, { 256, 104 }, { 240, 120 }, { 208, 100 }, { 192, 112 }, { 248, 144 } },

				{ { 1160, 0 }, { 200, 100 }, { 224, 104 }, { 248, 96 }, { 272, 88 }, { 260, 92 } },

				{ { 820, 0 }, { 184, 96 }, { 152, 88 }, { 196, 80 }, { 224, 120 }, { 200, 104 } } };
		
		String[] crr = {  "Manager" ,  "Technician" ,  "Operator" ,  "Accountant" ,  "Peon"  };
		
		maxTurnover(arr, crr);
	}

	private static void maxTurnover(int[][][] arr, String[] crr) {
		int i, j, k, max_i = 0;
		float turnover;
		float max_turnover = 0;
		int new_sum = 0,left_sum = 0;
		int working,max_new=0,max_left=0,max_working=0,max_new_dept = 0,max_left_dept=0,max_working_dept=0;
		
		for (i = 0; i < arr.length; i++) {
			new_sum = 0;
			left_sum = 0;
			for (j = 0; j < arr.length; j++) {

				for (k = 0; k < arr.length; k++) {
					if (k == 0) {
						new_sum += arr[i][j][k];
					}
					if (k == 1) {
						left_sum += arr[i][j][k];
					}

				}
			}
			working = new_sum - left_sum;
			turnover = (float) left_sum / (float) working;
			if(max_new<new_sum)
			{
				max_new=new_sum;
				max_new_dept=i;
			}
			if(max_left<left_sum)
			{
				max_left=left_sum;
				max_left_dept=i;
			}
			if (max_turnover < turnover) {
				max_turnover = turnover;
				max_i = i;
			}
			if(max_working<working) {
				max_working=working;
				max_working_dept=i;
				
			}
		}
		System.out.println("'"+crr[max_new_dept]+ "' department has maximum new employees");
		System.out.println("maximum employees left '"+crr[max_left_dept]+ "' department");
		System.out.println("'"+crr[max_working_dept]+ "' department has maximum no. of working employees");
		System.out.println("'"+crr[max_i] + "' departement has max turnover");
	}

}
