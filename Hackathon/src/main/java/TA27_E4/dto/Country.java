/**
 * 
 */
package TA27_E4.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "countries")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String country;
	private String region;
	private double population_millions;
	private double hdi;
	private double gdp_per_capita;
	private double cropland_footprint;
	private double grazing_footprint;
	private double forest_footprint;
	private double carbon_footprint;
	private double fish_footprint;
	private double total_ecological_footprint;
	private double cropland;
	private double grazing_land;
	private double forest_land;
	private double fishing_water;
	private double urban_land;
	private double total_biocapacity;
	private double biocapacity_deficit_or_reserve;
	private double earths_required;
	private double countries_required;
	private String data_quality;

}