package design.jukebox;

import java.util.HashSet;
import java.util.Set;

public class CD {

	private Set<Song> listOfSongs;
	
	public Set<Song> getListOfSongs() {
		return listOfSongs;
	}

	public void setListOfSongs(Set<Song> listOfSongs) {
		this.listOfSongs = listOfSongs;
	}

	public void addSongsToCD1(){
		listOfSongs = new HashSet<Song>();
		
		Song s1 = new Song("1", "Hindi New Song", 120);
		Song s2 = new Song("2", "English new Song", 120);
		listOfSongs.add(s1);
		listOfSongs.add(s2);
	}
	
	public void addSongsToCD2(){
		listOfSongs = new HashSet<Song>();
		
		Song s1 = new Song("3", "Hindi Item Song", 120);
		Song s2 = new Song("4", "English Item Song", 120);
		listOfSongs.add(s1);
		listOfSongs.add(s2);
	}
	
}
