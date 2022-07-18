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
public class Asignaturas
{
    private String cve_asignatura;
    private String nombre;

    public Asignaturas()
    {
    }

    public Asignaturas(String cve_asignatura, String nombre)
    {
        this.cve_asignatura = cve_asignatura;
        this.nombre = nombre;
    }

    /**
     * @return the cve_Serv_pub
     */
    public String getCve_asignatura()
    {
        return cve_asignatura;
    }

    /**
     * @param cve_Serv_pub the cve_Serv_pub to set
     */
    public void setCve_asignatura(String cve_asignatura)
    {
        this.cve_asignatura = cve_asignatura;
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
    
}
