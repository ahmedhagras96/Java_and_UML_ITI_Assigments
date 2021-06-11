/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

/**
 *
 * @author Ahmed Hagras
 */
public class Pyramid {
    private String pharaoh,modern_name,site,height;
    
    public Pyramid(String pharaoh, String modern_name, String site, String height) {
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;
    }

    
    public String getPharaoh() {
        return pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getSite() {
        return site;
    }

    public String getHeight() {
        return height;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    
}
