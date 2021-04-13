package plpgsql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*import java.util.Date;*/

public class LlamadaPlpgSQL {

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
	  private Connection conn = null;
	  /** Para obtener los resultados de las consultas SQL de la base de datos */
	  private ResultSet resultSet = null;
	  /** Para enviar comandos SQL a la base de datos */
	  private Statement statement = null;

	  /** Constructor de la clase
	 * Realiza una conexión a la base de datos de PostgreSQL
	 * @exception SQLException Los datos son incorrectos
	 * @exception ClassNotFoundException No existe libreria JDBC:Postgresql
	 */
	  public LlamadaPlpgSQL(){
	   this.url = "jdbc:postgresql://localhost:5432/"+db;
	       try{
	         //obtenemos el driver de para PostgreSQL
	         Class.forName("org.postgresql.Driver");
	         //obtenemos la conexión
	         conn = DriverManager.getConnection(this.url, this.user , this.password );
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
	public String CallFunction( Integer annomes )
	{
	    String res="";
	    try {
	    	/* java.util.Date fecha = new Date(); */ 
	      statement = conn.createStatement();
	      resultSet = statement.executeQuery("SELECT fp_escribir_log_ejecucion (202108, 'Java', '', \r\n"
	      		+ "				 '', '', '', '', 'Creación de registro desde Java', 'Jose'); ");
	      /**( */
	      while (resultSet.next())
	      {
	        res=resultSet.getString(1);
	      }
	     }
	   catch (SQLException ex) {
	        System.err.println( ex.getMessage() );
	   }
	   return res;
	}




	}





