
public class Number {

	private int num;
	
	public Number(){
		num=0;
	}
	
	public Number(int num){
		this.num = num;
	}
	
	/*public Number(int anum){
		num = anum;
	}*/

	public void setNum(int num){
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
	
	public String toString(){
		String str = "Num=" + num;
		return str;
	}
}
