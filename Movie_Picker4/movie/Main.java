package movie;

import java.util.*; 

public class Main {
	private static Movie[] movies;
	//private Movie[] movieS;
	public static void main(String[] args) {
		//Movie(String n, double i, String l, String g, String d)
		Main m = new Main();
		m.run();
	}
	public Main(){
		movies = new Movie[5];
		movies[0] = new Movie("King Richard", 7.5,144,"Biography, Drama, Sport","A look at how tennis superstars Venus and Serena Williams became who they are after the coaching from their father Richard Williams.");
		movies[1] = new Movie("Moonrise Kingdom", 7.8,94,,"Comedy, Drama, Romance","A pair of young lovers flee their New England town, which causes a local search party to fan out to find them.");
		movies[2] = new Movie("Meet Joe Black", 7.2,178,"Drama, Fantasy, Romance","Death, who takes the form of a young man, asks a media mogul to act as a guide to teach him about life on Earth, and in the process, he falls in love with his guide's daughter.");
		movies[3] = new Movie("Almost Famous", 7.9,122,"Adventure, Comedy, Drama, Music","A high-school boy in the early 1970s is given the chance to write a story for Rolling Stone magazine about an up-and-coming rock band as he accompanies them on their concert tour.");
		movies[4] = new Movie("Vote this option last", 0.4,940,"Action, Adventure,Drama","Bruh.......");
	}
	public void run(){
		Home.main(null);
	}
	public static Movie[] getMovies(){
		return movies;
	}
	public static String printVotes(){
		String retur = "";
		for (Movie m : movies){
			retur += "" + m.getVotes() + " ";
		}
		return retur;
	}
	public static String printMovies(){
		String retur = "";
		for (Movie m : movies){
			retur += "" + m.toString() + " ";
		}
		return retur;
	}
	public static void submit(){
		orderM();
		printMovies();
		String[] s = new String[0];
		GUI2.main(s);
	}
	public static void orderM(){
		Arrays.sort(movies, new SortByVotes()); 
	}
		
}
