class B1
{
	public static void main(String[] args)
	{
		loop1:
		for(int i=0; i<2; i++)
	{
		System.out.println("loop1 begin" +"i:"+i);
		for(int j=0; j<5; j++)
		{
		System.out.println("loop2 begin" +"i:"+i+"j:"+j);
		if(j>2)
			{
			break loop1;
			}
		System.out.println("loop2 end" +"i:"+i+"j:"+j);
		}
		System.out.println("loop1 end" +"i:"+i);
	}
		System.out.println("main end");
	}
}
//within nested loop while using break or continue we can use loop statement.
//two indivual loop will not working in label
