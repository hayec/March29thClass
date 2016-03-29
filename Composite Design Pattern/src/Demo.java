public class Demo 
{
	public static void main(String[] args) 
	{
		Song s1 = new Song("John", "Whatever Song");
		Opera o1 = new Opera("Jane", "Whatever Opera");
		PlayList p1 = new PlayList();
		p1.add(s1);
		p1.add(o1);
		p1.play();
	}
}
