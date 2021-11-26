package lecture_code;

public class TestStatic {
	static int x=10;
	int y=200;
	
	
	
	public void increment()
	   {
		   x++;
		   System.out.println("x:"+x);
		   y++;//internally it made it as this.y++
		   System.out.println("y:"+y);///this.y
	   }

	public static void main(String[] args) {
	//increment and print both properties
		x++;
		   System.out.println("x: "+x);
   TestStatic obj=new TestStatic();
   obj.y++;
   System.out.println("y: "+obj.y);
	}

}
