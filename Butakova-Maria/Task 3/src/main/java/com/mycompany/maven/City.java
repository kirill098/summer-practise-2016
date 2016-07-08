package com.mycompany.maven;
// Generated 07.07.2016 16:47:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * City generated by hbm2java
 */
public class City  implements java.io.Serializable {


     private String name;
     private Integer population;
     private Integer area;
     private String country;
     private Set<Country> countries = new HashSet<Country>(0);

    public City() {
    }

	
    public City(String name) {
        this.name = name;
    }
    public City(String name, Integer population, Integer area, String country, Set<Country> countries) {
       this.name = name;
       this.population = population;
       this.area = area;
       this.country = country;
       this.countries = countries;
    }
   
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPopulation() {
        return this.population;
    }
    
    public void setPopulation(Integer population) {
        this.population = population;
    }
    public Integer getArea() {
        return this.area;
    }
    
    public void setArea(Integer area) {
        this.area = area;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public Set<Country> getCountries() {
        return this.countries;
    }
    
    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }




}

