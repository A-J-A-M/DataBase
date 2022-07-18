/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

/**
 *
 * @author jordi
 */
public class Tutores
{
    private int cve_tutor;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String parentesco;

    public Tutores()
    {
    }

    public Tutores(int cve_tutor, String nombre, String ap_paterno, String ap_materno, String parentesco)
    {
        this.cve_tutor = cve_tutor;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.parentesco = parentesco;
    }

    /**
     * @return the cve_tutor
     */
    public int getCve_tutor()
    {
        return cve_tutor;
    }

    /**
     * @param cve_tutor the cve_tutor to set
     */
    public void setCve_tutor(int cve_tutor)
    {
        this.cve_tutor = cve_tutor;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the ap_paterno
     */
    public String getAp_paterno()
    {
        return ap_paterno;
    }

    /**
     * @param ap_paterno the ap_paterno to set
     */
    public void setAp_paterno(String ap_paterno)
    {
        this.ap_paterno = ap_paterno;
    }

    /**
     * @return the ap_materno
     */
    public String getAp_materno()
    {
        return ap_materno;
    }

    /**
     * @param ap_materno the ap_materno to set
     */
    public void setAp_materno(String ap_materno)
    {
        this.ap_materno = ap_materno;
    }

    /**
     * @return the parentesco
     */
    public String getParentesco()
    {
        return parentesco;
    }

    /**
     * @param parentesco the parentesco to set
     */
    public void setParentesco(String parentesco)
    {
        this.parentesco = parentesco;
    }
    
}
