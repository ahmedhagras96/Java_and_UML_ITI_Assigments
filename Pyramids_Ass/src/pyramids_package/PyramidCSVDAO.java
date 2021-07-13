/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids_package;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyramid.Pyramid;

/**
 *
 * @author Ahmed Hagras
 */
public class PyramidCSVDAO implements pyramidDAO {
    List<Pyramid> Pyramids;
    String[] fields;
    
    public PyramidCSVDAO(){
//        File pyramid_file = new File(rowFileName);
    }

    
    @Override
    public  List<Pyramid> readPyramidsFromCSV(String row_file){
        this.Pyramids = new ArrayList<Pyramid>();
        //acess the data from csv filr
        File pyramid_file = new File(row_file);
        
        //read all data lines from csvfile and save them in alist
        List <String> lines = new ArrayList<String>();
        
        try{
            lines = Files.readAllLines(pyramid_file.toPath());    
        } catch (Exception ex) {
            System.out.println("An issue happen while reading from file "+ex);
        }
        //extract all pyramids info and save them in a list
        for (int lineIdx=1; lineIdx < lines.size(); lineIdx++){
            String line =lines.get(lineIdx);
            String[] fields = line.split(",");
            for(int fieldIndex =0; fieldIndex < fields.length; fieldIndex++){
                fields[fieldIndex] = fields[fieldIndex].trim(); 
            }
            Pyramid Pyramid = new Pyramid(fields[0],fields[2],fields[4],Double.parseDouble(fields[7]));
            Pyramids.add(Pyramid);
        }

        return Pyramids;
    }
    
}
