import java.util.ArrayList;
public class PlayList 
{
	private ArrayList<IPlayable> list;
	public PlayList()
	{
		list = new ArrayList<>();
	}
	public void add(IPlayable item)
	{
		list.add(item);
	}
	public void play()
	{
		for(IPlayable o : list)
		{
			o.play();
		}
	}
}
