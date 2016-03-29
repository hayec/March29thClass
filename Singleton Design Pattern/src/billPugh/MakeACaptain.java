package billPugh;

public class MakeACaptain //Outer Class
{
	private MakeACaptain(){}
	private static class SingletonHelper //Inner Class
	{
		private static final MakeACaptain captain = new MakeACaptain();
	}
	public static MakeACaptain getCaptain()
	{
		return SingletonHelper.captain;
	}
}
