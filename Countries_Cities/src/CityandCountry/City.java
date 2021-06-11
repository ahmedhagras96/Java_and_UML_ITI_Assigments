/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityandCountry;

/**
 *
 * @author Ahmed Hagras
 */
public class City {
    private String code, name, continent, Surface_Area;
    private int population;

    public City(String code, String name, String continent, String Surface_Area, int population) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.Surface_Area = Surface_Area;
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getSurface_Area() {
        return Surface_Area;
    }

    public int getPopulation() {
        return population;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setSurface_Area(String Surface_Area) {
        this.Surface_Area = Surface_Area;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    
}
