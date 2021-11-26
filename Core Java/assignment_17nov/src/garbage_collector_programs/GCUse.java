package garbage_collector_programs;

public class GCUse {

	public static void main(String[] args) {
		MyBigData[] arr = new MyBigData[1000000];
		for(int i= 0;i<100000;i++)
		{
			arr[i]=new MyBigData();
			//MyBigData obj = new MyBigData(); 
			System.out.println(i);
			//System.gc();
		}

	}

}
class MyBigData
{	long[] arr = new long[100000];	
	@Override
	public void finalize() throws Throwable {
		System.out.println(" GC will SWEEP this "+this +" ");
		
	}
}