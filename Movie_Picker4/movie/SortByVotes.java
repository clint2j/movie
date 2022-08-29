package movie;
import java.util.*; 
//import java.lang.*; 
//import java.io.*; 
	public class SortByVotes implements Comparator<Movie> 
	{ 
	    // Used for sorting in ascending order of 
	    // roll number 
	    public int compare(Movie a, Movie b) 
	    { 
	        return a.getVotes() - b.getVotes(); 
	    } 
	}