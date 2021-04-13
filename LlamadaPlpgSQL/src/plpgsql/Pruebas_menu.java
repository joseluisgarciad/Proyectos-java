package plpgsql;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Pruebas_menu {
	
	public Integer Menu; {
		String[] carreras = {
            "Ingeniería en sistemas computacionales",
            "Ingeniería industrial",
            "Ingeniería en mecatrónica",
            "Ingeniería en informatica",
            "Ingeniería petroquímica"
        	};
        	/*MyIcon icon = new MyIcon();*/
        	String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);
	}    	
}
