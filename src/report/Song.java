package report;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() {
		
	}

	public void setSong(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.println("Song= [title = " + title + ", artist= " + artist + ", album= " + album + ", composer= " + composer + ", year= " + year + ", track= " + track+ "]");
	}

}
