package design.jukebox;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Jukebox {
	
	//Need something to look into the queue and see if a song is over
	//if so, pick up the next one from the queue and play that
	
	private static Queue<Song> playlist;
	private static Set<CD> cdCollection;
	
	public static Song getSong(String songId){
		//Given the song id, fetch the entire song object from collections
		for(CD cd : cdCollection){
			for(Song song : cd.getListOfSongs()){
				if(song.getSongId().equals(songId)){
					return song;
				}
			}
		}
		return null;
	}
	
	public static void displayAllSongs() {
		for(CD cd : cdCollection){
			for(Song song : cd.getListOfSongs()){
				System.out.println(song.getSongName());
			}
		}
	}

	public static void addToPlayList(Song song) {
		playlist = new PriorityQueue<Song>();
		playlist.add(song);
		System.out.println("Song added to playlist is " + song.getSongName());
	}

	public static void loadSongsIntoJukeBox() {
		cdCollection = new HashSet<CD>();
		
		CD cd1 = new CD();
		cd1.addSongsToCD1();
		cdCollection.add(cd1);
		
		CD cd2 = new CD();
		cd2.addSongsToCD2();
		cdCollection.add(cd2);
	}

}
