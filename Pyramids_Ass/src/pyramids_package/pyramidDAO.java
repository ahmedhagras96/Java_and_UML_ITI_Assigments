/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids_package;

import java.util.List;
import pyramid.Pyramid;
/**
 *
 * @author Ahmed Hagras
 */
public interface  pyramidDAO {
    List<Pyramid> readPyramidsFromCSV(String row_file);
   
}
