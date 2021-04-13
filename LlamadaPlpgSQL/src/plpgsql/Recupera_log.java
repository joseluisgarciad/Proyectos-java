package plpgsql;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*import java.util.Date;*/
public class Recupera_log {

	  /* DATOS PARA LA CONEXION */
	  /** Nombre de la base de datos */
	  private String db = "PxQ";
	  /** Usuario postgreSQL */
	  private String user = "postgres";
	  /** Contraseña postgreSQL */
	  private String password = "admin";
	  /** Cadena de conexión */
	  private String url = "jdbc:postgresql://localhost:5432/"+db;
	  /** Conexion a base de datos */
	  Connection c = null;
	  /** Para obtener los resultados de las consultas SQL de la base de datos */
	 /* private ResultSet rs = null;*/
	  /** Para enviar comandos SQL a la base de datos */
	  Statement stmt = null;

	  /** Constructor de la clase
	 * Realiza una conexión a la base de datos de PostgreSQL
	 * @exception SQLException Los datos son incorrectos
	 * @exception ClassNotFoundException No existe libreria JDBC:Postgresql
	 */
	  public Recupera_log(){
	   this.url = "jdbc:postgresql://localhost:5432/"+db;
	       try{
	         //obtenemos el driver de para PostgreSQL
	         Class.forName("org.postgresql.Driver");
	         //obtenemos la conexión
	         c = DriverManager.getConnection(this.url, this.user , this.password );
	         c.setAutoCommit(false);
	         
	      }catch(SQLException e){
	         System.err.println( e.getMessage() );
	      }catch(ClassNotFoundException e){
	         System.err.println( e.getMessage() );
	      }
	  }

	/**
	 * Ejecuta la instruccion SQL para llamar a la función en postgreSQL
	 * @param Cedula_Identidad String que es el identificador de la persona
	 * @return String el resultado de la función
	 */
	public String Trae_registro( Integer annomes )
	{
	    String res="";
	    try {
	
	      stmt = c.createStatement();
	      String Sql = "SELECT NULLIF(id_anno_mes,0) AS id_anno_mes, ejecucion, NULLIF(contador,0) as contador, id_pais, id_sociedad_csl, id_proceso, id_subproceso, "
	      			+ "id_inductor_q, descripcion, id_usuario, fecha_cambios FROM t_log_ejecucion";
	      ResultSet rs = stmt.executeQuery(Sql);
/*NULLIF(tabla_pxq.pxq,0)*/
	      while ( rs.next() )   {
	    	  int id_anno_mes = rs.getInt("id_anno_mes");
	    	  String ejecucion = rs.getString("ejecucion");
	    	  int contador = rs.getInt("contador");
	    	  /*System.out.println(id_anno_mes + " - " + ejecucion + " - " + contador);*/
	    	  System.out.println(Registro(rs.getInt("id_anno_mes"), rs.getString("ejecucion"), rs.getInt("contador"), rs.getString("id_pais")
	    			  ,rs.getString("id_sociedad_csl"), rs.getString("id_proceso"), rs.getString("id_subproceso"), rs.getString("id_inductor_q")
	    			  ,rs.getString("descripcion"), rs.getString("id_usuario"), rs.getString("fecha_cambios")));
	        
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	     }
	   catch (SQLException ex) {
	        System.err.println( ex.getMessage() );
	   }
	   return res;
	}

	
	@SuppressWarnings("unchecked")
	public List Registro(int id_anno_mes, String ejecucion, int contador, String id_pais, String id_sociedad_csl,
						String id_proceso, String id_subproceso, String id_inductor_q, String descripcion,
						String id_usuario, String fecha_cambios) {
				

        
	        List ListaX = new ArrayList();
	        	ListaX.add(id_anno_mes);
	        	ListaX.add(ejecucion);
	        	ListaX.add(contador);
	        	ListaX.add(id_pais);
	        	ListaX.add(id_sociedad_csl);
	        	ListaX.add(id_proceso);
	        	ListaX.add(id_subproceso);
	        	ListaX.add(id_inductor_q);
	        	ListaX.add(descripcion);
	        	ListaX.add(id_usuario);
	        	ListaX.add(fecha_cambios);
	        	
	        return ListaX;
	        	
	    }



	}



	
	

