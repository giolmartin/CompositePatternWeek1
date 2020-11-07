import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.playlistName;
	}
	
	public void add(IComponent  component) {
		playlist.add(component);
		
	}

  // Your code goes here!


}
