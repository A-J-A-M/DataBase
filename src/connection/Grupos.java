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
public class Grupos
{
    private int grado;
    private String grupo;
    private int capacidad;
    private int cant_ocupada;
    private int cant_disponible;
    private int no_hombres;
    private int no_mujeres;

    public Grupos()
    {
    }

    public Grupos(int grado, String grupo, int capacidad, int cant_ocupada, int cant_disponible,int no_hombres, int no_mujeres)
    {
        this.grado = grado;
        this.grupo = grupo;
        this.capacidad = capacidad;
        this.cant_ocupada = cant_ocupada;
        this.cant_disponible = cant_disponible;
        this.no_hombres = no_hombres;
        this.no_mujeres = no_mujeres;
    }

    /**
     * @return the grado
     */
    public int getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(int grado) {
        this.grado = grado;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the cant_ocupada
     */
    public int getCant_ocupada() {
        return cant_ocupada;
    }

    /**
     * @param cant_ocupada the cant_ocupada to set
     */
    public void setCant_ocupada(int cant_ocupada) {
        this.cant_ocupada = cant_ocupada;
    }

    /**
     * @return the cant_disponible
     */
    public int getCant_disponible() {
        return cant_disponible;
    }

    /**
     * @param cant_disponible the cant_disponible to set
     */
    public void setCant_disponible(int cant_disponible) {
        this.cant_disponible = cant_disponible;
    }

    /**
     * @return the no_hombres
     */
    public int getNo_hombres() {
        return no_hombres;
    }

    /**
     * @param no_hombres the no_hombres to set
     */
    public void setNo_hombres(int no_hombres) {
        this.no_hombres = no_hombres;
    }

    /**
     * @return the no_mujeres
     */
    public int getNo_mujeres() {
        return no_mujeres;
    }

    /**
     * @param no_mujeres the no_mujeres to set
     */
    public void setNo_mujeres(int no_mujeres) {
        this.no_mujeres = no_mujeres;
    }
    
    @Override
    public String toString()
    {
        return "Grupos{" + "grado=" + grado + ", grupo=" + grupo + ", capacidad=" + capacidad + ", cant_ocupada=" + cant_ocupada + ", cant_disponible=" + cant_disponible + ", no_hombres=" + no_hombres + ", no_mujeres=" + no_mujeres + '}';
    }
}
