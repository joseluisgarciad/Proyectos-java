package plpgsql;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import java.io.FileDescriptor;

import org.apache.poi.ss.usermodel.Cell;


public class PruebasExcel {



	public void AbrirExcel() throws IOException {
		String rutaArchivo="c:\\Users\\0015648\\Documents\\Prueba2.xlsx" ;
	    File f = new File(rutaArchivo);
	    InputStream inp = new FileInputStream(f);
	    Workbook wb = WorkbookFactory.create(inp);
	    Sheet sheet = wb.getSheetAt(0);
	    
	    Integer iFila = 0;
	    Integer iColumna = 0;
	    String ValorS = "";
	    Integer ValorI = 0;
	    String SQL = "INSERT INTO t_prueba_java (";
	    
	    // Area de cabecera
	    
	    do {
	    	Row Fila = sheet.getRow(iFila);
	    	Cell Columna = Fila.getCell(iColumna);
	    	if(Columna==null) break;
        	ValorS = Columna.getStringCellValue();
        	if(iColumna==0) {;
        		SQL = SQL + ValorS + ", ";
        	} else {	
        		SQL = SQL + ValorS;
        	}
        	System.out.println("Valor de la cabecera es " + ValorS);
        	iColumna++;
        	
	    } while (true);
	    
	    SQL = SQL + ") VALUES (";
	    
	    iFila = 1; // Area de datos
	    iColumna = 0;
	    
	    do {
	    	Row Fila = sheet.getRow(iFila);
	    	if(Fila==null) break;
	    	Cell Columna = Fila.getCell(iColumna);
	    	if(Columna==null) break;
	            switch (iColumna) {
	            case 0:
	            	ValorS = Columna.getStringCellValue();
	            	System.out.println("Valor de la celda es " + ValorS);
	            	SQL = SQL + "'" + Columna.getStringCellValue() + "'" ;
	                break;
	            case 1:
	            	ValorI = (int) Columna.getNumericCellValue();
	            	System.out.println("Valor de la celda es " + ValorI);
	            	SQL = SQL + "," + "'" + Columna.getNumericCellValue() + "'";
	            	break;
	            	
	            }	
	            iColumna++;
            do {
            	Row Fila2 = sheet.getRow(iFila);
            //	if (Fila2==null) break;
            	Cell Columna2 = Fila2.getCell(iColumna);
            	if (Columna2==null) break;
            	
            		switch (iColumna) {
		            case 0:
		            	ValorS = Columna2.getStringCellValue();
		            	System.out.println("Valor de la celda es " + ValorS);
		            	SQL = SQL + "'" + Columna.getStringCellValue() + "'" ;
		                break;
		            case 1:
		            	ValorI = (int) Columna2.getNumericCellValue();
		            	System.out.println("Valor de la celda es " + ValorI) ;
		            	SQL = SQL + "," + "'" + Columna2.getNumericCellValue() + "'" ;
		            	break;
	            	}	

            		iColumna++;
            		SQL = SQL + "),(";
            	} while (true);
            	iColumna = 0;
            	iFila++;
	    	} while (true);
	        
	        SQL = SQL.substring(0,(SQL.length()-2));
	    	SQL = SQL + ";";
	    	System.out.println(SQL);
            Integer resultado = 0;
            
	    	String SQL_Creacion_tabla = "CREATE TABLE IF NOT EXISTS t_prueba_java"
	    			+ "( nombre Text,"
	    			+ "	telefono Numeric,"
	    			+ "	id_sociedad_csl Text,"
	    			+ "	PRIMARY KEY (nombre)"
	    			+ ");";
	    	
	    	LlamadaPlpgSQL Sqlcreacion = new LlamadaPlpgSQL();
	    	resultado = Sqlcreacion.LanzaSQL(SQL_Creacion_tabla);
	    	System.out.println(resultado);
	    	
	    	LlamadaPlpgSQL SqlInsert = new LlamadaPlpgSQL();
	    	resultado = SqlInsert.LanzaSQL(SQL);
	    	System.out.println(resultado);
	    	
	    	
	}
}
