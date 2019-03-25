package report;

public class SongMain {

	public static void main(String[] args) {
		Song song = new Song();
		song.setSong("Dancing Queen", "ABBA", "The Albums", "Benny Andersson, Björn Ulvaeus, Stig Anderson", 1976, 4);
		song.show();
	}

}
