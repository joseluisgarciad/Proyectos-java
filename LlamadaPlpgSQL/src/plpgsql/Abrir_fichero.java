package plpgsql;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFileChooser;

public class Abrir_fichero {
	
  @SuppressWarnings("deprecation")
public String leerFichero() {
	String cadena = null;
		  
	JFileChooser chooser = new JFileChooser();
	if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		cadena = chooser.getSelectedFile().toString();
		System.out.println(chooser.getSelectedFile());


	 	
	return cadena;
  }	  
}
