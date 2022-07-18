/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import cjb.ci.Mensaje;
import interfaces.Prb;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JFrame;

/**
 *
 * @author Jordi
 */
public class ConnSQL
{

    public Statement st;
    public String estado;
    public OracleSQL conn;

    public ConnSQL(String sid, String user, String password)
    {
        inicia(sid, user, password);
    }

    public void close()
    {
        try
        {
            st.close();
        } catch (Exception e)
        {
        }
    }

    public boolean inicia(String sid, String user, String password)
    {
        conn = new OracleSQL(sid, user, password);
        if (conn.Conecta())
        {
            st = conn.Consulta();
            estado = conn.getEstado();
            return true;
        }
        estado = conn.getEstado();
        return false;
    }

//    public void ListaTodos()
//    {
//        ResultSet rs;
//        try
//        {
//            rs = st.executeQuery("SELECT * FROM employees");
//            while (rs.next())
//            {
//                System.out.println(rs.getString("employee_id"));
//            }
//        } catch (Exception ex)
//        {
//            System.err.println("Error: " + ex.getMessage());
//        }
//    }
    public String ListaAlumnos()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("SELECT * FROM alumnos order by cve_alumno");
            s += "CVE_ALUMNO\tNOMBRE\tAP_PATERNO\tAP_MATERNO\tCURP\tFECHA_NAC\t\tPESO\tESTATURA\tEDAD\tTIPO_SANGRE\t\tULT_GRAD_EST\t"
                    + "GENERO\tCVE_DIRECCIONES\tCVE_TUTORES\n";
            while (rs.next())
            {
                Alumnos a = new Alumnos(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getDouble(7), rs.getDouble(8), rs.getInt(9),
                        rs.getString(10), rs.getString(11), rs.getString(12),
                        rs.getInt(13), rs.getInt(14));
                s += a.getCve_Alumno() + "\t";
                s += a.getNombre() + "\t";
                s += a.getAp_paterno() + "\t";
                s += a.getAp_materno() + "\t";
                s += a.getCurp() + "\t";
                s += a.getFecha_nac() + "\t";
                s += a.getPeso() + "\t";
                s += a.getEstatura() + "\t";
                s += a.getEdad() + "\t";
                s += a.getTipo_sangre() + "\t\t";
                s += a.getUlt_grad_Est() + "\t\t";
                s += a.getGenero() + "\t";
                s += a.getCve_direccion() + "\t\t";
                s += a.getCve_tutor() + "\n";

            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String ListaTutores()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("SELECT * FROM tutores order by cve_tutor");
            s += "CVE_TUTOR\tNOMBRE\tAP_PATERNO\tAP_MATERNO\tPARENTESCO\n";
            while (rs.next())
            {
                Tutores t = new Tutores(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                s += t.getCve_tutor() + "\t";
                s += t.getNombre() + "\t";
                s += t.getAp_paterno() + "\t";
                s += t.getAp_materno() + "\t";
                s += t.getParentesco() + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String ListaAsignaturas()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("SELECT * FROM asignaturas order by cve_Asignatura");
            s += "CVE_ASIGNATURA\tNOMBRE\n";
            while (rs.next())
            {
                Asignaturas a = new Asignaturas(rs.getString(1), rs.getString(2));
                s += a.getCve_asignatura() + "\t\t";
                s += a.getNombre() + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String ListaProfe_Asig()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("SELECT * FROM profesores_asignaturas");
            s += "CVE_SERV_PUB\tCVE_ASIGNATURA\n";
            while (rs.next())
            {
                Profesor_asignatura pa = new Profesor_asignatura(rs.getInt(1), rs.getString(2));
                s += pa.getCve_Serv_pub() + "\t\t";
                s += pa.getCve_asignatura() + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String ListaGrupos()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("SELECT * FROM grupos order by grado");
            s += "Grado\tGrupo\tCapacidad\tCant_Ocupada\tCant_Disponible\tNo_Hombres\tNo_Mujeres\n";
            while (rs.next())
            {
                Grupos a = new Grupos(rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),
                        rs.getInt(7));
                s += a.getGrado() + "\t";
                s += a.getGrupo() + "\t";
                s += a.getCapacidad() + "\t";
                s += a.getCant_ocupada() + "\t";
                s += a.getCant_disponible() + "\t\t";
                s += a.getNo_hombres() + "\t";
                s += a.getNo_mujeres() + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String ListaDirecciones_Alumnos()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("SELECT * FROM direcciones_Alumnos order by cve_direccion");
            s += "Cve_Direccion\tCalle\tColonia\tCodigo_Postal\tNum_Int\tNum_Ext\n";
            while (rs.next())
            {
                Direcciones_Alumnos a = new Direcciones_Alumnos(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
                s += a.getCve_direccion() + "\t";
                s += a.getCalle() + "\t";
                s += a.getColonia() + "\t";
                s += a.getCodigo_postal() + "\t";
                s += a.getNum_int() + "\t";
                s += a.getNum_ext() + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String ListaCalificaciones()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("SELECT * FROM calificaciones order by cve_alumno");
            s += "CVE ALUMNO\tCVE ASIGNATURA\tCICLO ESCOLAR\tPERIODO 1\tPERIODO 2\tPERIODO 3\tGRADO\tGRUPO\n";
            while (rs.next())
            {
                Calificaciones a = new Calificaciones(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getInt(7), rs.getString(8));
                s += a.getCve_alumno() + "\t";
                s += a.getCve_asignatura() + "\t\t";
                s += a.getCiclo_escolar() + "\t\t";
                s += a.getPeriodo_1() + "\t";
                s += a.getPeriodo_2() + "\t";
                s += a.getPeriodo_3() + "\t";
                s += a.getGrado() + "\t";
                s += a.getGrupo() + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String ListaProfesores()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("SELECT * FROM profesores order by cve_serv_pub");
            s += "CVE SERV PUB\tNOMBRE\tAP PATERNO\tAP MATERNO\tCURP\tRFC\t\tSALARIO\tLICENCIATURA\tULT GRAD EST\tCARGO\n";
            while (rs.next())
            {
                Profesores a = new Profesores(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getString(9), rs.getString(10));
                s += a.getCve_serv_pub() + "\t";
                s += a.getNombre() + "\t";
                s += a.getAp_paterno() + "\t";
                s += a.getAp_materno() + "\t";
                s += a.getCurp() + "\t";
                s += a.getRfc() + "\t";
                s += a.getSalario() + "\t";
                s += a.getLicenciatura() + "\t";
                s += a.getUlt_grad_est() + "\t";
                s += a.getCargo() + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String join()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("SELECT n.nombre, n.cve_serv_pub FROM profesores_asignaturas t "
                    + "RIGHT OUTER JOIN profesores n ON (n.cve_serv_pub = t.cve_serv_pub) MINUS "
                    + "SELECT n.nombre, n.cve_serv_pub FROM profesores_asignaturas t "
                    + "JOIN profesores n ON (n.cve_serv_pub = t.cve_serv_pub)");
            s += "NOMBRE\tCVE_SERV_PUB\n";
            while (rs.next())
            {
                s += rs.getString(1) + "\t";
                s += rs.getString(2) + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }

        return s;
    }

    public String califAlumnos(int cveAlum)
    {
        boolean f = false;
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("select a.nombre, asig.nombre, periodo_1, periodo_2, periodo_3 "
                    + "from alumnos a, calificaciones c, asignaturas asig "
                    + "where a.cve_alumno = c.cve_alumno "
                    + "and c.cve_asignatura = asig.cve_asignatura "
                    + "and a.cve_alumno = " + cveAlum);
            s += "NOMBRE\tASIGNATURA\tPERIODO 1\tPERIODO 2\tPERIODO 3\n";
            while (rs.next())
            {
                f = true;
                s += rs.getString(1) + "\t";
                s += rs.getString(2) + "\t";
                s += rs.getDouble(3) + "\t";
                s += rs.getDouble(4) + "\t";
                s += rs.getDouble(5) + "\n";
            }
            if (!f)
            {
                s = "";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String califAlumnosPr()
    {
        boolean f = false;
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("select nombre, ap_paterno "
                    + "from calificaciones natural join alumnos "
                    + "where (periodo_1 + periodo_2 + periodo_3)/3 > all("
                    + " select min((periodo_1+periodo_2+periodo_3)/3) "
                    + "from calificaciones "
                    + "group by cve_asignatura "
                    + "having min((periodo_1+periodo_2+periodo_3)/3) > 5)");
            s += "NOMBRE\tAP_PATERNO\n";
            while (rs.next())
            {
                f = true;
                s += rs.getString(1) + "\t";
                s += rs.getString(2) + "\n";
            }
            if (!f)
            {
                s = "";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String vistaSalN()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("select * from empvuAlu");
            s += "NOMBRE\tAP_PATERNO\tRFC\t\tNUEVO SALARIO TENTATIVO\n";
            while (rs.next())
            {

                s += rs.getString(1) + "\t";
                s += rs.getString(2) + "\t";
                s += rs.getString(3) + "\t";
                s += rs.getDouble(4) + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String cAlu()
    {
        boolean f = false;
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("select * from fullvu");
            s += "Nombre Profesor\t Ap_paterno\t Ap_materno\t Curp\t RFC\t\t Nombre Asignatura \n";
            while (rs.next())
            {
                f = true;
                s += rs.getString(1) + "\t\t";
                s += rs.getString(2) + "\t";
                s += rs.getString(3) + "\t";
                s += rs.getString(4) + "\t";
                s += rs.getString(5) + "\t";
                s += rs.getString(6) + "\n";
            }
            if (!f)
            {
                s = "";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String procedimiento(int cveTutor)
    {
        String s = "";
        try
        {
            CallableStatement cst = conn.getConn().prepareCall("{call alumnos_tutores(?,?)}");
            cst.setInt(1, cveTutor);
            cst.registerOutParameter(2, Types.VARCHAR);
            cst.execute();
            s = cst.getString(2);
            if (s.length() <= 34)
            {
                s = "";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String pasarMateria(int cveAlum, int cveAsig)
    {
        String s = "";
        try
        {
            CallableStatement cst = conn.getConn().prepareCall("{call calif(?,?,?)}");
            cst.setInt(1, cveAlum);
            cst.setInt(2, cveAsig);
            cst.registerOutParameter(3, Types.VARCHAR);
            cst.execute();
            s = cst.getString(3);
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String alumProf(int cveAlum, int cveProf)
    {
        String s = "";
        try
        {
            CallableStatement cst = conn.getConn().prepareCall("{call al_pr(?,?,?)}");
            cst.setInt(1, cveAlum);
            cst.setInt(2, cveProf);
            cst.registerOutParameter(3, Types.VARCHAR);
            cst.execute();
            s = cst.getString(3);
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public String procedimiento2(int cve_alum)
    {
        String s = "";
        try
        {
            CallableStatement cst = conn.getConn().prepareCall("{call dir_alum(?,?)}");
            cst.setInt(1, cve_alum);
            cst.registerOutParameter(2, Types.VARCHAR);
            cst.execute();
            s = cst.getString(2);
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public boolean buscaProfesor(int cveProf)
    {
        ResultSet rs;
        try
        {
            rs = st.executeQuery("select * from profesores where cve_serv_pub = " + cveProf);
            if (rs.next())
            {
                return true;
            } else
            {
                return false;
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public void eliminaProf(int cveServ)
    {
        try
        {
            st.executeUpdate("delete from profesores where CVE_SERV_PUB=" + cveServ);
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    public String profesoresDesp()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("select * from profesores_despedidos");
            s += "CVESERVPUB\tNOMBRE\tAP PATERNO\tAP MATERNO\tCURP\t\tRFC\t\tFECHA SALIDA\n";
            while (rs.next())
            {
                s += rs.getInt(1) + "\t";
                s += rs.getString(2) + "\t";
                s += rs.getString(3) + "\t";
                s += rs.getString(4) + "\t";
                s += rs.getString(5) + "\t";
                s += rs.getString(6) + "\t";
                s += rs.getDate(7) + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }

    public boolean  insertaProf(int cve, String nom, String ap_pat, String ap_mat, String curp, String rfc, double sal, String licenciatura, String ult, String cargo,JFrame frame)
    {
        try
        {
            st.executeUpdate("insert into profesores values(" + cve + ",'" + nom + "','" + ap_pat + "','" + ap_mat + "','"
                    + curp + "','" + rfc + "'," + sal + ",'" + licenciatura + "','" + ult + "','" + cargo + "')");
            return true;
        } catch (Exception e)
        {
            Mensaje.error(frame, "Error: " + e.getMessage());
        }
        return false;
    }

    public void cambiarSueldoProf(int cveServ, double salario)
    {
        try
        {
            st.executeUpdate("update profesores set salario=" + salario + " where cve_serv_pub=" + cveServ);
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    public String profesoresSueldo()
    {
        String s = "";
        ResultSet rs;
        try
        {
            rs = st.executeQuery("select * from cambio_sueldo");
            s += "Cve_serv_pub\tSalario_anterior\tSalario_cambiado\n";
            while (rs.next())
            {
                s += rs.getInt(1) + "\t";
                s += rs.getDouble(2) + "\t\t";
                s += rs.getDouble(3) + "\n";
            }
        } catch (Exception ex)
        {
            System.err.println("Error: " + ex.getMessage());
        }
        return s;
    }
}
