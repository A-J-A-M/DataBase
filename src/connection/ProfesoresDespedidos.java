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
public class ProfesoresDespedidos
{
    private int cve_serv_pub;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String curp;
    private String rfc;
    private String fecha_salida;

    public ProfesoresDespedidos()
    {
    }

    public ProfesoresDespedidos(int cve_serv_pub, String nombre, String ap_paterno, String ap_materno, String curp, String rfc, String fecha_salida)
    {
        this.cve_serv_pub = cve_serv_pub;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.curp = curp;
        this.rfc = rfc;
        this.fecha_salida = fecha_salida;
    }

    /**
     * @return the cve_serv_pub
     */
    public int getCve_serv_pub()
    {
        return cve_serv_pub;
    }

    /**
     * @param cve_serv_pub the cve_serv_pub to set
     */
    public void setCve_serv_pub(int cve_serv_pub)
    {
        this.cve_serv_pub = cve_serv_pub;
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
     * @return the curp
     */
    public String getCurp()
    {
        return curp;
    }

    /**
     * @param curp the curp to set
     */
    public void setCurp(String curp)
    {
        this.curp = curp;
    }

    /**
     * @return the rfc
     */
    public String getRfc()
    {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc)
    {
        this.rfc = rfc;
    }
    

    @Override
    public String toString()
    {
        return "Profesores{" + "cve_serv_pub=" + getCve_serv_pub() + ", nombre=" + getNombre() + ", ap_paterno=" + getAp_paterno() + ", ap_materno=" + getAp_materno() + ", curp=" + getCurp() + ", rfc=" + getRfc() + ", fecha_salida=" + fecha_salida + '}';
    }

    /**
     * @return the fecha_salida
     */
    public String getFecha_salida() {
        return fecha_salida;
    }

    /**
     * @param fecha_salida the fecha_salida to set
     */
    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
}
