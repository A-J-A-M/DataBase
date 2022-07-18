package connection;

/**
 *
 * @author John PV
 */
public class Calificaciones
{
    private int cve_alumno;
    private String cve_asignatura;
    private String ciclo_escolar;
    private double periodo_1;
    private double periodo_2;
    private double periodo_3;
    private int grado;
    private String grupo;

    public Calificaciones()
    {
    }

    public Calificaciones(int cve_alumno, String cve_asignatura, String ciclo_escolar, double periodo_1, double periodo_2, double periodo_3, int grado, String grupo)
    {
        this.cve_alumno = cve_alumno;
        this.cve_asignatura = cve_asignatura;
        this.ciclo_escolar = ciclo_escolar;
        this.periodo_1 = periodo_1;
        this.periodo_2 = periodo_2;
        this.periodo_3 = periodo_3;
        this.grado = grado;
        this.grupo = grupo;
    }

    /**
     * @return the cve_alumno
     */
    public int getCve_alumno()
    {
        return cve_alumno;
    }

    /**
     * @param cve_alumno the cve_alumno to set
     */
    public void setCve_alumno(int cve_alumno)
    {
        this.cve_alumno = cve_alumno;
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

    /**
     * @return the ciclo_escolar
     */
    public String getCiclo_escolar()
    {
        return ciclo_escolar;
    }

    /**
     * @param ciclo_escolar the ciclo_escolar to set
     */
    public void setCiclo_escolar(String ciclo_escolar)
    {
        this.ciclo_escolar = ciclo_escolar;
    }

    /**
     * @return the periodo_1
     */
    public double getPeriodo_1()
    {
        return periodo_1;
    }

    /**
     * @param periodo_1 the periodo_1 to set
     */
    public void setPeriodo_1(double periodo_1)
    {
        this.periodo_1 = periodo_1;
    }

    /**
     * @return the periodo_2
     */
    public double getPeriodo_2()
    {
        return periodo_2;
    }

    /**
     * @param periodo_2 the periodo_2 to set
     */
    public void setPeriodo_2(double periodo_2)
    {
        this.periodo_2 = periodo_2;
    }

    /**
     * @return the periodo_3
     */
    public double getPeriodo_3()
    {
        return periodo_3;
    }

    /**
     * @param periodo_3 the periodo_3 to set
     */
    public void setPeriodo_3(double periodo_3)
    {
        this.periodo_3 = periodo_3;
    }

    /**
     * @return the grado
     */
    public int getGrado()
    {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(int grado)
    {
        this.grado = grado;
    }

    /**
     * @return the grupo
     */
    public String getGrupo()
    {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }

    @Override
    public String toString()
    {
        return "Calificaciones{" + "cve_alumno=" + cve_alumno + ", cve_asignatura=" + cve_asignatura + ", ciclo_escolar=" + ciclo_escolar + ", periodo_1=" + periodo_1 + ", periodo_2=" + periodo_2 + ", periodo_3=" + periodo_3 + ", grado=" + grado + ", grupo=" + grupo + '}';
    }
}
