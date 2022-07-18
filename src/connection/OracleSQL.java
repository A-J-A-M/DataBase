/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;

public class OracleSQL {

    private Connection conn;
    private String user;
    private String password;
    private String url;
    private String estado;

    /**
     * Constructor que nos permite inicializar todo para establecer una conexión
     * y obtener los detalles de esta.
     *
     * @param sid String con el SID de la Base de Datos.
     * @param user String con el usuario a donde nos deseamos conectar.
     * @param password String con la contraseña del usuario anteriormente
     * mencionado.
     */
    public OracleSQL(String sid, String user, String password) {
        this.url = "jdbc:oracle:thin:@localhost:1521:" + sid;
        this.user = user;
        this.password = password;
    }

    /**
     * Método que nos permite establecer una conexión con la Base de Datos,
     * ademas permite poner el estado de el intento.
     *
     * @return boolean, true en caso de una conexión correcta, false en caso
     * contrario.
     */
    public boolean Conecta() {
        try {
            setConn(DriverManager.getConnection(getUrl(), getUser(), getPassword()));
            setEstado("Se estableció la conexion con:" + getUrl() + " | User: " + getUser() + " | Password : " + getPassword());
        } catch (SQLException ex) {
            setEstado(ex.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Método que nos permite obtener una sentencia con la que podemos
     * comunicarnos con ORACLE SQL.
     *
     * @return Statement al que podemos introducir comandos SQL.
     */
    public Statement Consulta() {
        try {
            Statement sentencia = getConn().createStatement();
            return sentencia;
        } catch (SQLException e) {
            return null;
        }
    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
