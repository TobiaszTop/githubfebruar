package opgave2;

import java.util.Scanner;

public class Song {
	private String title;
	private String artist;
	private int bpm;
	private Scanner scan;

	public Song(String title, String artist, int bpm) {
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}

	public String getTitle(){ return title; }
	public String getArtist(){ return artist; }
	public int getBpm(){ return bpm; }

	public void printSong(){
		System.out.println("*********************************");
		System.out.println("Titel     : " + title);
		System.out.println("Kunster   : " + artist);
		System.out.println("Hastighed : " + bpm + " (Bpm)");
		System.out.println("*********************************");
	}

	public void setBpm(int newBpm){
		bpm = newBpm;
	}

	public void tilpas(int guessBpm){
		if(bpm > guessBpm){
			System.out.println("hurtig");
		} else if(bpm < guessBpm) {
			System.out.println("langsom");
		} else {
			System.out.println("perfekt");
		}
	}

	public Song(){
		scan = new Scanner(System.in);
		boolean keepGoing = true;
		System.out.println("input title");
		this.title = scan.nextLine();
		System.out.println("input artist name");
		this.artist = scan.nextLine();
		while(keepGoing) {
			System.out.println("input bpm");
			String bpmString = scan.nextLine();
			keepGoing = false;
			try {
				this.bpm = Integer.parseInt(bpmString);
			} catch(NumberFormatException e){
				keepGoing = true;
			}

		}
		scan.close();
	}

}
