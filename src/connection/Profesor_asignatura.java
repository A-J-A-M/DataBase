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
public class Profesor_asignatura
{
    private int cve_Serv_pub;
    private String cve_asignatura;

    public Profesor_asignatura()
    {
    }

    public Profesor_asignatura(int cve_Serv_pub, String cve_asignatura)
    {
        this.cve_Serv_pub = cve_Serv_pub;
        this.cve_asignatura = cve_asignatura;
    }

    /**
     * @return the cve_Serv_pub
     */
    public int getCve_Serv_pub()
    {
        return cve_Serv_pub;
    }

    /**
     * @param cve_Serv_pub the cve_Serv_pub to set
     */
    public void setCve_Serv_pub(int cve_Serv_pub)
    {
        this.cve_Serv_pub = cve_Serv_pub;
    }

    /**
     * @return the cve_asignatura
     */
    public String getCve_asignatura()
    {
        return cve_asignatura;
    }

    /**
     * @param cve_asignatura the cve_asignatura to set
     */
    public void setCve_asignatura(String cve_asignatura)
    {
        this.cve_asignatura = cve_asignatura;
    }
    
}
