package movie;

public class Movie {
	private String name;
	private double imdb;
	private int length;
	private String genre;
	private String description;
	private int votes;
	public Movie(String n, double i, int l, String g, String d){
		name = n;
		imdb = i;
		length = l;
		genre = g;
		description = d;
		votes = 0;
	}
	public String getName(){
		return name;
	}
	public double getIMDB(){
		return imdb;
	}
	public int getLength(){
		return length;
	}
	public String getGenre(){
		return genre;
	}
	public String getDes(){
		return description;
	}
	public void addVotes(int v){
		votes += v;
	}
	public int getVotes(){
		return votes;
	}
	public String toString(){
		return /*"name: " +*/ name +  " | IMDB: " + imdb + " | Length " + length + " | Genre: " + genre;// + " About: " + description; 
	}
	public String finToString(){
		return name + " - " + votes;
	}
}
