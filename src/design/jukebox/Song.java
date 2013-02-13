package design.jukebox;

public class Song {
	
	private String songId;
	private String songName;
	private int songDuration;
	
	public Song(){
		
	}
	
	public Song(String songId, String songName, int songDuration){
		this.songId = songId;
		this.songName = songName;
		this.songDuration = songDuration; 
	}

	public String getSongId() {
		return songId;
	}

	public void setSongId(String songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public int getSongDuration() {
		return songDuration;
	}

	public void setSongDuration(int songDuration) {
		this.songDuration = songDuration;
	}

}
