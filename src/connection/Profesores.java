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
public class Profesores
{
    private int cve_serv_pub;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String curp;
    private String rfc;
    private double salario;
    private String licenciatura;
    private String ult_grad_est;
    private String cargo;

    public Profesores()
    {
    }

    public Profesores(int cve_serv_pub, String nombre, String ap_paterno, String ap_materno, String curp, String rfc, double salario, String licenciatura, String ult_grad_est, String cargo)
    {
        this.cve_serv_pub = cve_serv_pub;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.curp = curp;
        this.rfc = rfc;
        this.salario = salario;
        this.licenciatura = licenciatura;
        this.ult_grad_est = ult_grad_est;
        this.cargo = cargo;
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

    /**
     * @return the salario
     */
    public double getSalario()
    {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    /**
     * @return the licenciatura
     */
    public String getLicenciatura()
    {
        return licenciatura;
    }

    /**
     * @param licenciatura the licenciatura to set
     */
    public void setLicenciatura(String licenciatura)
    {
        this.licenciatura = licenciatura;
    }

    /**
     * @return the ult_grad_est
     */
    public String getUlt_grad_est()
    {
        return ult_grad_est;
    }

    /**
     * @param ult_grad_est the ult_grad_est to set
     */
    public void setUlt_grad_est(String ult_grad_est)
    {
        this.ult_grad_est = ult_grad_est;
    }

    /**
     * @return the cargo
     */
    public String getCargo()
    {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    @Override
    public String toString()
    {
        return "Profesores{" + "cve_serv_pub=" + cve_serv_pub + ", nombre=" + nombre + ", ap_paterno=" + ap_paterno + ", ap_materno=" + ap_materno + ", curp=" + curp + ", rfc=" + rfc + ", salario=" + salario + ", licenciatura=" + licenciatura + ", ult_grad_est=" + ult_grad_est + ", cargo=" + cargo + '}';
    }
}
