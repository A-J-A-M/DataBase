/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import connection.*;

/**
 *
 * @author jordi
 */
public class Alumnos
{
    private int cve_Alumno;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String curp;
    private String fecha_nac;
    private double peso;
    private double estatura;
    private int edad;
    private String tipo_sangre;
    private String ult_grad_Est;
    private String genero;
    private int cve_direccion;
    private int cve_tutor;

    public Alumnos()
    {
    }

    public Alumnos(int cve_Alumno, String nombre, String ap_paterno, String ap_materno, String curp, String fecha_nac, double peso, double estatura, int edad, String tipo_sangre, String ult_grad_Est, String genero, int cve_direccion, int cve_tutor)
    {
        this.cve_Alumno = cve_Alumno;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.curp = curp;
        this.fecha_nac = fecha_nac;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.tipo_sangre = tipo_sangre;
        this.ult_grad_Est = ult_grad_Est;
        this.genero = genero;
        this.cve_direccion = cve_direccion;
        this.cve_tutor = cve_tutor;
    }

    /**
     * @return the cve_Alumno
     */
    public int getCve_Alumno()
    {
        return cve_Alumno;
    }

    /**
     * @param cve_Alumno the cve_Alumno to set
     */
    public void setCve_Alumno(int cve_Alumno)
    {
        this.cve_Alumno = cve_Alumno;
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
     * @return the fecha_nac
     */
    public String getFecha_nac()
    {
        return fecha_nac;
    }

    /**
     * @param fecha_nac the fecha_nac to set
     */
    public void setFecha_nac(String fecha_nac)
    {
        this.fecha_nac = fecha_nac;
    }

    /**
     * @return the peso
     */
    public double getPeso()
    {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    /**
     * @return the estatura
     */
    public double getEstatura()
    {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura)
    {
        this.estatura = estatura;
    }

    /**
     * @return the edad
     */
    public int getEdad()
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    /**
     * @return the tipo_sangre
     */
    public String getTipo_sangre()
    {
        return tipo_sangre;
    }

    /**
     * @param tipo_sangre the tipo_sangre to set
     */
    public void setTipo_sangre(String tipo_sangre)
    {
        this.tipo_sangre = tipo_sangre;
    }

    /**
     * @return the ult_grad_Est
     */
    public String getUlt_grad_Est()
    {
        return ult_grad_Est;
    }

    /**
     * @param ult_grad_Est the ult_grad_Est to set
     */
    public void setUlt_grad_Est(String ult_grad_Est)
    {
        this.ult_grad_Est = ult_grad_Est;
    }

    /**
     * @return the genero
     */
    public String getGenero()
    {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    /**
     * @return the cve_direccion
     */
    public int getCve_direccion()
    {
        return cve_direccion;
    }

    /**
     * @param cve_direccion the cve_direccion to set
     */
    public void setCve_direccion(int cve_direccion)
    {
        this.cve_direccion = cve_direccion;
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
}
