

public class MathOperations {
	
	static Number addition(Number a, Number b)
	{
		Number answer = new Number();
		answer.setNum(  a.getNum() + b.getNum()  );
		return answer;
	}
	
	static Number sub(Number a, Number b)
	{
		Number answer = new Number();
		answer.setNum(  a.getNum() - b.getNum()  );
		return answer;
	}
	
	static Number mul(Number a, Number b)
	{
		Number answer = new Number();
		answer.setNum(  a.getNum() * b.getNum()  );
		return answer;
	}
	
	/*static int sub(int a, int b)
	{
		int ret = a-b;
		return ret;
	}
	
	static int mul(int a, int b)
	{
		int ret = 0;
		for(int i=0; i<b; i++)
			ret += addition(a, a);
		
		return ret;
	}*/	
	
}
