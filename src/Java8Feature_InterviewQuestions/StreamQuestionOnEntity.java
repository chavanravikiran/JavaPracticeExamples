package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamQuestionOnEntity {
	public static void main(String[] args) {
		List<Movies> movies = new LinkedList<>();
		movies.add(new Movies("Pritam and Pedro", "Ravi", 20.5, 3.4, 
				List.of("Amit", "Rahul", "Karan")));

		movies.add(new Movies("KGF", "Prashanth Neel", 80.0, 9.5, 
				List.of("Yash", "Srinidhi", "Anant")));

		movies.add(new Movies("Bahubali", "S. S. Rajamouli", 180.0, 9.7,
				List.of("Prabhas", "Rana Daggubati", "Anushka Shetty")));

		movies.add(new Movies("RRR", "S. S. Rajamouli", 300.0, 9.2, 
				List.of("NTR Jr.", "Ram Charan", "Alia Bhatt")));

		movies.add(new Movies("Pushpa", "Sukumar", 250.0, 8.8,
				List.of("Allu Arjun", "Rashmika Mandanna", "Fahadh Faasil")));

		movies.add(new Movies("3 Idiots", "Rajkumar Hirani", 55.0, 9.6,
				List.of("Aamir Khan", "R. Madhavan", "Sharman Joshi")));

		System.out.println(movies);
		
		//1. find out all movies name and return list
		List<String> movieNamesList = movies.stream()
		.map(x->x.getMovieName())
		.collect(Collectors.toList());
//		.forEach(System.out::println);
		
		System.out.println("Movies Name : "+movieNamesList);
		
		//2. find out all Actors name and return list
		System.out.println("find out all Actors name and return list : "+movies.stream()
		.flatMap(x->x.getActors().stream())
		.collect(Collectors.toList()));
		
		//3. Find Out Movie name and respective Actors List
		Map<String, List<String>> movieActors = movies.stream()
		.collect(Collectors.toMap(x->x.getMovieName(), x->x.getActors()));
		
		System.out.println("Find Out Movie name and respective Actors List :"+movieActors);
		
		//4. Movie Rating is great than 7
		List<Movies> rating = movies.stream()
		.filter(x->x.getRating()>=7.0)
		.collect(Collectors.toList());
		
		System.out.println("Rating is great than : "+rating);
	}
}

class Movies {

	String movieName;
	String auther;
	Double budget;
	Double rating;
	List<String> actors;

	public Movies(String movieName, String auther, Double budget, Double rating, List<String> actors) {
		super();
		this.movieName = movieName;
		this.auther = auther;
		this.budget = budget;
		this.rating = rating;
		this.actors = actors;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getAuther() {
		return auther;
	}

	public Double getBudget() {
		return budget;
	}

	public Double getRating() {
		return rating;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movies [movieName=" + movieName + ", auther=" + auther + ", budget=" + budget + ", rating=" + rating
				+ ", actors=" + actors + "]";
	}

}