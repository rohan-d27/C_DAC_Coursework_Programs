/* 
input : str[] = "1a 2 wc3 pnp2f 22n";

sample output : 
a f n
3


int main(void) 
{
	int i , cnt = 0;
	for (.....)
	{
	
		if( (str[i]>='0') &&  (str[i]<='9') )
		{
			if(str[i+1]>='A') && (str[i+1]<='Z') || (str[i+1]>='a') && (str[i+1]<='z')
			{
				pf(" %c " , str[i+1]); cnt++;
			
			}
		}
	}
	pf( " count : %d  ",cnt);
	
}
