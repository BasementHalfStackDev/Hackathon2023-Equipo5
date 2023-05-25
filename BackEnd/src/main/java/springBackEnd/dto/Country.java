/**
 * 
 */
package springBackEnd.dto;

import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "countries")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String country;
	private String region;
	private Double population_millions;
	private Double hdi;
	private String gdp_per_capita;
	private Double cropland_footprint;
	private Double grazing_footprint;
	private Double forest_footprint;
	private Double carbon_footprint;
	private Double fish_footprint;
	private Double total_ecological_footprint;
	private Double cropland;
	private Double grazing_land;
	private Double forest_land;
	private Double fishing_water;
	private Double urban_land;
	private Double total_biocapacity;
	private Double biocapacity_deficit_or_reserve;
	private Double earths_required;
	private Double countries_required;
	private String data_quality;
	@OneToMany(mappedBy = "country")
	private List<User> users;
	
	// Constructors
	public Country () {
		
	}
	
	
	
	public Country(Long id, String country, String region, Double population_millions, Double hdi,
			String gdp_per_capita, Double cropland_footprint, Double grazing_footprint, Double forest_footprint,
			Double carbon_footprint, Double fish_footprint, Double total_ecological_footprint, Double cropland,
			Double grazing_land, Double forest_land, Double fishing_water, Double urban_land, Double total_biocapacity,
			Double biocapacity_deficit_or_reserve, Double earths_required, Double countries_required,
			String data_quality, List<User> users) {
		this.id = id;
		this.country = country;
		this.region = region;
		this.population_millions = population_millions;
		this.hdi = hdi;
		this.gdp_per_capita = gdp_per_capita;
		this.cropland_footprint = cropland_footprint;
		this.grazing_footprint = grazing_footprint;
		this.forest_footprint = forest_footprint;
		this.carbon_footprint = carbon_footprint;
		this.fish_footprint = fish_footprint;
		this.total_ecological_footprint = total_ecological_footprint;
		this.cropland = cropland;
		this.grazing_land = grazing_land;
		this.forest_land = forest_land;
		this.fishing_water = fishing_water;
		this.urban_land = urban_land;
		this.total_biocapacity = total_biocapacity;
		this.biocapacity_deficit_or_reserve = biocapacity_deficit_or_reserve;
		this.earths_required = earths_required;
		this.countries_required = countries_required;
		this.data_quality = data_quality;
		this.users = users;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	public Double getPopulation_millions() {
		return population_millions;
	}



	public void setPopulation_millions(Double population_millions) {
		this.population_millions = population_millions;
	}



	public Double getHdi() {
		return hdi;
	}



	public void setHdi(Double hdi) {
		this.hdi = hdi;
	}



	public String getGdp_per_capita() {
		return gdp_per_capita;
	}



	public void setGdp_per_capita(String gdp_per_capita) {
		this.gdp_per_capita = gdp_per_capita;
	}



	public Double getCropland_footprint() {
		return cropland_footprint;
	}



	public void setCropland_footprint(Double cropland_footprint) {
		this.cropland_footprint = cropland_footprint;
	}



	public Double getGrazing_footprint() {
		return grazing_footprint;
	}



	public void setGrazing_footprint(Double grazing_footprint) {
		this.grazing_footprint = grazing_footprint;
	}



	public Double getForest_footprint() {
		return forest_footprint;
	}



	public void setForest_footprint(Double forest_footprint) {
		this.forest_footprint = forest_footprint;
	}



	public Double getCarbon_footprint() {
		return carbon_footprint;
	}



	public void setCarbon_footprint(Double carbon_footprint) {
		this.carbon_footprint = carbon_footprint;
	}



	public Double getFish_footprint() {
		return fish_footprint;
	}



	public void setFish_footprint(Double fish_footprint) {
		this.fish_footprint = fish_footprint;
	}



	public Double getTotal_ecological_footprint() {
		return total_ecological_footprint;
	}



	public void setTotal_ecological_footprint(Double total_ecological_footprint) {
		this.total_ecological_footprint = total_ecological_footprint;
	}



	public Double getCropland() {
		return cropland;
	}



	public void setCropland(Double cropland) {
		this.cropland = cropland;
	}



	public Double getGrazing_land() {
		return grazing_land;
	}



	public void setGrazing_land(Double grazing_land) {
		this.grazing_land = grazing_land;
	}



	public Double getForest_land() {
		return forest_land;
	}



	public void setForest_land(Double forest_land) {
		this.forest_land = forest_land;
	}



	public Double getFishing_water() {
		return fishing_water;
	}



	public void setFishing_water(Double fishing_water) {
		this.fishing_water = fishing_water;
	}



	public Double getUrban_land() {
		return urban_land;
	}



	public void setUrban_land(Double urban_land) {
		this.urban_land = urban_land;
	}



	public Double getTotal_biocapacity() {
		return total_biocapacity;
	}



	public void setTotal_biocapacity(Double total_biocapacity) {
		this.total_biocapacity = total_biocapacity;
	}



	public Double getBiocapacity_deficit_or_reserve() {
		return biocapacity_deficit_or_reserve;
	}



	public void setBiocapacity_deficit_or_reserve(Double biocapacity_deficit_or_reserve) {
		this.biocapacity_deficit_or_reserve = biocapacity_deficit_or_reserve;
	}



	public Double getEarths_required() {
		return earths_required;
	}



	public void setEarths_required(Double earths_required) {
		this.earths_required = earths_required;
	}



	public Double getCountries_required() {
		return countries_required;
	}



	public void setCountries_required(Double countries_required) {
		this.countries_required = countries_required;
	}



	public String getData_quality() {
		return data_quality;
	}



	public void setData_quality(String data_quality) {
		this.data_quality = data_quality;
	}



	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "User")
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	

}
