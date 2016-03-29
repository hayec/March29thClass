package lazyinitialization;

public class MakeACaptain 
{
	private static MakeACaptain captain;
	private MakeACaptain(){}
	public static MakeACaptain getCaptain()//Synchronized keyword will prevent more than one thread from running the method simultaneously
	{
		if(captain == null) 
		{
			captain = new MakeACaptain();
		}
		else
		{
			System.out.println("We already have a captain");
		}
		return captain;
	}
	
}
