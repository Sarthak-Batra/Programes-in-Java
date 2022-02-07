class Pattern {
	public static void main(String arg[]){
	int i , j ;
	for(i=1;i<=10;i++)
	{
		for(j=1;j<=9;j++)
		{
			if(j>=6-i && j<=4+i && j>=i-4&& j<=14-i)  
			System.out.print("*");
		    else
		    System.out.print(" ");
		}
		System.out.print("\n");
		
	}
}
}