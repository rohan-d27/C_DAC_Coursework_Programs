

public class Sort {

	public static void Selection(Student[] arr) {

		for(int j=0; j<arr.length-1; j++)
		{
			Student tmp = arr[j];
			for(int i=j+1; i<arr.length; i++)
			{



				if(arr[i].getRollNo() < tmp.getRollNo())
				{
					Student x = arr[i];
					arr[i] = tmp;
					tmp = x;
				}


			}
			arr[j] = tmp;
		}

	}
	public static void Insertion(Student[] arr) {

		for(int i=1; i<arr.length; i++)
		{
			Student tmp = arr[i];
			int k = i-1;

			while(k >= 0)
			{
				
				
					if(tmp.getRollNo() < arr[k].getRollNo())
					{
						arr[k+1] = arr[k];
						k--;
					}
					else
						break;
			
						
			}
			arr[k+1] = tmp;
		}
	}
	public static void Bubble(Student[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				
				
					if(arr[j+1].getRollNo() <  arr[j].getRollNo())
					{
						Student x = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = x;
					}
			}
			}

		}
		public static void Quick(Student[] arr)
		{
			quicksort(arr, 0, arr.length-1);
		}

		private static void quicksort(Student[] arr, int l, int h) 
		{
			if(l < h)
			{
				int loc = partition(arr, l, h);
				//Sort left side of the location
				quicksort(arr, l, loc-1);
				//Sort right side of the location
				quicksort(arr, loc+1, h);
			}
		}

		private static int partition(Student[] arr, int l, int h) {

			int j = l;
			int i = j-1;

			while(j <= h)
			{
				
				if(arr[j].getRollNo() < arr[h].getRollNo())
				{
					i++;

					Student tmp = arr[i];
					 arr[i] = arr[j];
					arr[j] = tmp;
				}
				
				j++;
			}
			i++;

			Student tmp = arr[i];
			arr[i] = arr[h];
			arr[h] = tmp;

			return i;
		}

	}




