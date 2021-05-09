package Pkg1;

public class srgf
{
	private boolean[] arr = new boolean[2]; // An instance variable
	public srgf() 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(" "+arr[i]);
		}
	}

	public static void main(String[] args) 
	{
		new srgf();
		String[] str = new String[2]; 
		for (int i = 0; i < str.length; i++) 
		{
			System.out.println(" " + str[i]);
		}
	}

}
