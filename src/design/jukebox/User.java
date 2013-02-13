package design.jukebox;

import java.util.Scanner;

public class User {

	//Searches for a song from the database
	//Selects a song and hits add to Playlist
	
	public static void main(String[] args){
		
		Jukebox.loadSongsIntoJukeBox();
		
		System.out.println("Please select a song. Here are the options");
		Jukebox.displayAllSongs();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the id of the song you would like to play");
		String songId = in.nextLine();
		if(null != songId) {
			Song song = Jukebox.getSong(songId);
			Jukebox.addToPlayList(song);
		}
	}
}
