/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

/**
 *
 * @author John PV
 */
public class Direcciones_Alumnos
{
    private String cve_direccion;
    private String calle;
    private String colonia;
    private int codigo_postal;
    private int num_int;
    private int num_ext;

    public Direcciones_Alumnos()
    {
    }

    public Direcciones_Alumnos(String cve_direccion, String calle, String colonia, int codigo_postal, int num_int,int num_ext)
    {
        this.cve_direccion = cve_direccion;
        this.calle = calle;
        this.colonia = colonia;
        this.codigo_postal = codigo_postal;
        this.num_int = num_int;
        this.num_ext = num_ext;
    }

    /**
     * @return the cve_direccion
     */
    public String getCve_direccion() {
        return cve_direccion;
    }

    /**
     * @param cve_direccion the cve_direccion to set
     */
    public void setCve_direccion(String cve_direccion) {
        this.cve_direccion = cve_direccion;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the codigo_postal
     */
    public int getCodigo_postal() {
        return codigo_postal;
    }

    /**
     * @param codigo_postal the codigo_postal to set
     */
    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    /**
     * @return the num_int
     */
    public int getNum_int() {
        return num_int;
    }

    /**
     * @param num_int the num_int to set
     */
    public void setNum_int(int num_int) {
        this.num_int = num_int;
    }

    /**
     * @return the num_ext
     */
    public int getNum_ext() {
        return num_ext;
    }

    /**
     * @param num_ext the num_ext to set
     */
    public void setNum_ext(int num_ext) {
        this.num_ext = num_ext;
    }
    
       @Override
    public String toString()
    {
        return "Direcciones_Alumnos{" + "cve_direccion=" + cve_direccion + ", calle=" + calle + ", colonia=" + colonia + ", codigo_postal=" + codigo_postal + ", num_int=" + num_int + ", num_ext=" + num_ext + '}';
    }
}
