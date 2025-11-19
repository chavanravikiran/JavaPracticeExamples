package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import StringExample.CompareEqualsAndOperators;

public class CityPopulationsStream {
	public static void main(String[] args) {
		
		List<CityPopulation> list = new ArrayList<>();
		list.add(new CityPopulation("Pune",100d,"Maharashtra"));
		list.add(new CityPopulation("Mumbai",150d,"Maharashtra"));
		list.add(new CityPopulation("Chennai",80d,"Chenai"));
		list.add(new CityPopulation("Pind Panjab",120d,"Panjab"));
		list.add(new CityPopulation("Uri",60d,"Shrinagar"));
		list.add(new CityPopulation("Uri",60d,"Shrinagar"));
		
		//calculate City count
		Long cityCount = list.stream()
//		.map(CityPopulation::getCityName)
		.map(x->x.getCityName())
		.distinct()
		.count();
		
		System.out.println("City Count "+cityCount);
	}
}

class CityPopulation{
	
	private String cityName;
	private Double population;
	private String Capital;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Double getPopulation() {
		return population;
	}
	public void setPopulation(Double population) {
		this.population = population;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	
	public CityPopulation(String cityName, Double population, String capital) {
		super();
		this.cityName = cityName;
		this.population = population;
		Capital = capital;
	}
	
	public CityPopulation() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}