package plpgsql;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class menu_opciones {
	 
	    public static void main(String[] args) {
	 
	        Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion; //Guardaremos la opcion del usuario
	    	Lista_seleccion l = new Lista_seleccion();	
	    	int respuesta = l.Lista();	
	    	
	        while (!salir) {
	            System.out.println("Menú de opciones");	 
	            System.out.println("1. Lanzamiento Función de insert (t_log_ejecucion, sin Retorno");
	            System.out.println("2. Lanzamiento Select (t_log_ejecucion) con retorno de datos");
	            System.out.println("3. Prueba menú grafico");
	            System.out.println("4. Prueba menú 2");	            
	            System.out.println("5. Salir");
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	                String resultado;
	                Integer res_menu;
	                switch (opcion) {
	                    case 1:
	                        System.out.println("Has seleccionado la opcion 1");
	                    	  LlamadaPlpgSQL Plpgfunc = new LlamadaPlpgSQL();
	                    	  resultado = Plpgfunc.CallFunction(202108);  
	                         JOptionPane.showMessageDialog(null,"Correcto: " + resultado); 
	                        break;
	                    case 2:
	                        System.out.println("Has seleccionado la opcion 2");
	                        Recupera_log Plpgsql = new Recupera_log();	
	                    	resultado = Plpgsql.Trae_registro(202108); 
	                        break;
	                    case 3:
	                        System.out.println("Has seleccionado la opcion 3");
	                        Lista_seleccion meng = new Lista_seleccion();
	                        res_menu = meng.Lista();		
	                        break;
	                    case 4:
	                        System.out.println("Has seleccionado la opcion 4");
	                        Pruebas_menu pm = new Pruebas_menu();
	                        res_menu = pm.Menu;		
	                        break;	                        
	                    case 5:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo números entre 1 y 5");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
	        }
	 
	    }


	 
	}


