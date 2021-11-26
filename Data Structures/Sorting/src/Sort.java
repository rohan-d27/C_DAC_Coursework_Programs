
public class Sort {

	public static void Insertion(int[] arr, boolean isDes) {
		
		for(int i=1; i<arr.length; i++)
		{
			int tmp = arr[i];
			int k = i-1;
			
			while(k >= 0)
			{
				if(isDes)
				{
					if(tmp > arr[k])
					{
						arr[k+1] = arr[k];
						k--;
					}
					else
						break;
				}
				else
				{
					if(tmp < arr[k])
					{
						arr[k+1] = arr[k];
						k--;
					}
					else
						break;
				}
			}
			arr[k+1] = tmp;
		}
	}
		
	public static void Selection(int[] arr, boolean isDes) {
		
		for(int j=0; j<arr.length-1; j++)
		{
			int tmp = arr[j];
			for(int i=j+1; i<arr.length; i++)
			{
				if(isDes)
				{
					//D
					if(arr[i] > tmp)
					{
						int x = arr[i];
						arr[i] = tmp;
						tmp = x;
					}
				}
				else
				{
					//A
					if(arr[i] < tmp)
					{
						int x = arr[i];
						arr[i] = tmp;
						tmp = x;
					}
				}
			}
			arr[j] = tmp;
		}
	}

	public static void Bubble(int[] arr, boolean isDes)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(isDes)
				{
					if(arr[j+1] >  arr[j])
					{
						int x = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = x;
					}
				}
				else
				{
					if(arr[j+1] <  arr[j])
					{
						int x = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = x;
					}
				}
			}
		}
	}
	
	public static void Quick(int[] arr)
	{
		quicksort(arr, 0, arr.length-1);
	}

	private static void quicksort(int[] arr, int l, int h) 
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

	private static int partition(int[] arr, int l, int h) {
		
		//int pi = arr[h];
		int j = l;
		int i = j-1;
		
		while(j <= h)
		{
			if(arr[j] < arr[h])
			{
				i++;
				//swap(arr[i], arr[j]);
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			j++;
		}
		i++;
		//swap(arr[i], arr[h]);
		int tmp = arr[i];
		arr[i] = arr[h];
		arr[h] = tmp;
		
		return i;
	}
}

