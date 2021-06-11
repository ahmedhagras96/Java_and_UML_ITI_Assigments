/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro_package;

import pyramids_package.PyramidCSVDAO;
import java.util.List;
import pyramid.Pyramid;

/**
 *
 * @author Ahmed Hagras
 */
public class MainClass {
     public static void main(String[] args){
         PyramidCSVDAO pDAO = new PyramidCSVDAO();
         List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("E:\\Ahmed programming\\ITI\\Java &UML programming\\session 2\\pyramids.csv");
         for(Pyramid p:pyramids)
         {
         System.out.println(p.getPharaoh()+"  "+p.getModern_name()+"  "+p.getSite()+"  "+p.getHeight()+"  ");
            }
     }
        
}
