/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro_package;

import java.util.ArrayList;
import pyramids_package.PyramidCSVDAO;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import pyramid.Pyramid;

/**
 *
 * @author Ahmed Hagras
 */
public class MainClass {
     public static void main(String[] args){
         PyramidCSVDAO pDAO = new PyramidCSVDAO();
         List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("E:\\Ahmed programming\\ITI\\Java &UML programming\\Java_and_UML_ITI_Assigments\\Pyramids_Ass\\pyramids.csv");
         for(Pyramid p:pyramids)
         {
         System.out.println(p.getPharaoh()+"  "+p.getModern_name()+"  "+p.getSite()+"  "+p.getHeight()+"  ");
            }
         
         //Excersise 4
         List<Double> heights = pyramids.stream().map(Pyramid -> Pyramid.getHeight()).collect(Collectors.toList());
         System.out.println(heights);
         double lowerQuartile = heights.stream().sorted().collect(toList()).get((int)(heights.size()* 1/4));
         double median = heights.stream().sorted().collect(toList()).get((int)(heights.size()* 1/2));
         double upperQuartile = heights.stream().sorted().collect(toList()).get((int)(heights.size()* 3/4));
         System.out.println("lower Quartile is : "+lowerQuartile + " ,Median is : "+ median + " and upperQuartile is : " + upperQuartile );
     }
        
}
