package plpgsql;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class menu_opciones {
	 
	    public static void main(String[] args) throws IOException {
	 
	        Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion; //Guardaremos la opcion del usuario
            String resultado;
            Integer res_menu;
	    	
	        while (!salir) {
	            System.out.println("Menú de opciones");	 
	            System.out.println("1. Lanzamiento Función de insert (t_log_ejecucion, sin Retorno");
	            System.out.println("2. Lanzamiento Select (t_log_ejecucion) con retorno de datos");
	            System.out.println("3. Prueba menú grafico");
	            System.out.println("4. Prueba menú 2");	 
	            System.out.println("5. Encriptar contraseña");	 
	            System.out.println("6. Desencriptar contraseña");	 	  
	            System.out.println("7. Pedir fichero");
	            System.out.println("8. Pruebas Excel");
	            System.out.println("9. Salir");
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();

	                switch (opcion) {
	                    case 1:
	                    	 LlamadaPlpgSQL Plpgfunc = new LlamadaPlpgSQL();
	                    	 resultado = Plpgfunc.CallFunction(202108);  
	                         JOptionPane.showMessageDialog(null,"Correcto: " + resultado); 
	                        break;
	                    case 2:
	                        Recupera_log Plpgsql = new Recupera_log();	
	                    	resultado = Plpgsql.Trae_registro(202108); 
	                        break;
	                    case 3:
	                        Lista_seleccion meng = new Lista_seleccion();
	                        res_menu = meng.Lista();		
	                        break;
	                    case 4:
	                        Pruebas_menu pm = new Pruebas_menu();
	                        res_menu = pm.Menu;		
	                        break;	     
	                    case 5:
	                        DesEncriptar Enc = new DesEncriptar();
	                        resultado = Enc.Encriptar();	
	                        JOptionPane.showMessageDialog(null, resultado, "Texto encriptado", JOptionPane.DEFAULT_OPTION, null);
	                        break;	
	                    case 6:
	                        DesEncriptar DesEnc = new DesEncriptar();
	                        resultado = DesEnc.DesEncriptar();	
	                        JOptionPane.showMessageDialog(null, resultado, "Texto Desencriptado", JOptionPane.DEFAULT_OPTION, null);
	                        break;
	                    case 7:
	                        Abrir_fichero fich = new Abrir_fichero();
	                        resultado = fich.leerFichero();	
	                        JOptionPane.showMessageDialog(null, resultado, "Texto Desencriptado", JOptionPane.DEFAULT_OPTION, null);
	                        break;		                        
	                    case 8:
	                        PruebasExcel Excl = new PruebasExcel();
	                        Excl.AbrirExcel();	
	                        //JOptionPane.showMessageDialog(null, resultado, "Texto Desencriptado", JOptionPane.DEFAULT_OPTION, null);
	                        break;		                        
	                    case 9:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo números entre 1 y 9");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
	        }
	 
	    }


	 
	}


