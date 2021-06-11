package dao;

import CityandCountry.City;
import CityandCountry.Country;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CitiesAndCountries_CsvDao implements CitiesAndCountries_DAO {
    
    public CitiesAndCountries_CsvDao() {

    }
    
    @Override
    public List<String> readFromCSV(String row_file){
        File file = new File(row_file);
        List <String> lines = new ArrayList<>();
        
        try{
            lines = Files.readAllLines(file.toPath());    
        } catch (Exception ex) {
            System.out.println("An issue happen while reading from file "+ex);
        } 
        return lines;
    };
    
    
    public List<City> createCity(String row_file){
        List<String> lines = this.readFromCSV(row_file);
        List<City> Cities_list = new LinkedList<City>();
        for(int lineIdx =1;lineIdx < lines.size();lineIdx++){
            String line =lines.get(lineIdx);
            String[] fields = line.split(",");
            for(int fieldIndex =0; fieldIndex < fields.length; fieldIndex++){
                fields[fieldIndex] = fields[fieldIndex].trim(); 
            }
            City City = new City(fields[6],fields[0],fields[4],fields[8],Integer.parseInt(fields[7]));            
            Cities_list.add(City);
        };
        
        return Cities_list;
    };
    
    public List<Country> createCountry(String row_file){
        List<String> lines = this.readFromCSV(row_file);
        String[] fields;
        List<Country> Countries_list = new LinkedList<Country>();
        for(int lineIdx = 1;lineIdx < lines.size();lineIdx++ ){
            String line =lines.get(lineIdx);
            fields = line.split(",");
            for(int fieldIndex =0; fieldIndex < fields.length; fieldIndex++){
                fields[fieldIndex] = fields[fieldIndex].trim(); 
            }
            Country Country = new Country(fields[0],fields[1]);
            Countries_list.add(Country);
        };
        
        return Countries_list;
    };
    
}
