package main;

import CityandCountry.City;
import CityandCountry.Country;
import dao.CitiesAndCountries_CsvDao;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import dao.CitiesAndCountries_DAO;


public class Countries_Cities {

   
    public static void main(String[] args) {
        CitiesAndCountries_DAO DAO = new CitiesAndCountries_CsvDao();
        List<City> Cities = DAO.createCity("E:\\Ahmed programming\\ITI\\Java &UML programming\\Java_and_UML_ITI_Assigments\\Countries_Cities\\worldcities.csv");
        
        //sorting cities list using sortbyroll class
        class Sortbyroll implements Comparator<City>
        {
            // Used for sorting in ascending order of
            // roll number
            public int compare(City a, City b)
            {
                return b.getPopulation() - a.getPopulation();
            }
        }
        Collections.sort(Cities, new Sortbyroll());
        
        //printing cities after sorting
         for(City C:Cities)
         {
         System.out.println(C.getCode()+"  "+C.getName()+"  "+C.getContinent()+"  "+C.getSurface_Area()+"  " + C.getPopulation());
            }
         
         //printing countries
         List<Country> Countries = DAO.createCountry("E:\\Ahmed programming\\ITI\\Java &UML programming\\Java_and_UML_ITI_Assigments\\Countries_Cities\\worldcountries.csv");
         for(Country Co:Countries)
         {
         System.out.println(Co.getCode()+"  "+Co.getName());
            }
         
         //Making Map that contain country as key and list of cities of these country as value
         Map<String, List<String>> countriesMap = new HashMap<>();
         for(Country Co:Countries){
             List<String> countryCities = new LinkedList<>();
             for(City C:Cities){
                 if (Co.getCode().equals(C.getCode())){
                     countryCities.add(C.getName());
                 } 
             }
             countriesMap.put(Co.getName(), countryCities);
         }
         
         //printing countriesMap 
         System.out.println("\n//////////////////////////////////////////////\n");
         countriesMap.forEach((k, v) ->
                System.out.println("key=" + k + ", value=" + v));
         
    }
    
}
