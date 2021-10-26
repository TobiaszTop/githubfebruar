package opgave2;

public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song("Lille Frække Frederik", "Bambse", 148);
		Song s2 = new Song("Never Gonna Give You Up", "Rick Astley", 113);

		s1.getTitle();
		s1.getArtist();
		s1.getBpm();
		s1.printSong();

		s1.setBpm(296);
		s1.getBpm();

		s1.tilpas(20);
		s1.tilpas(296);
		s1.tilpas(2000);

		Song s3 = new Song();
		s3.printSong();
		// TODO
	}
}
