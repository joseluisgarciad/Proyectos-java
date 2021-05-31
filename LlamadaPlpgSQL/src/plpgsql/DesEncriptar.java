package plpgsql;

import java.util.Scanner;

public class DesEncriptar {
	String Textoencriptado = "", Textodesencriptado = "",  mensaje = "";
	int clave;
	char ch;
	Scanner sn = new Scanner(System.in);
	
	public String Encriptar() {
		
        System.out.println("Dame un String a encriptar: ");
		mensaje = sn.nextLine();
        System.out.println("introduce la clave: ");
		clave = sn.nextInt();	                		
		
		for(int i = 0; i < mensaje.length(); ++i){
			ch = mensaje.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
				ch = (char)(ch + clave);
				
				if(ch > 'z'){
					ch = (char)(ch - 'z' + 'a' - 1);
				}
				
				Textoencriptado += ch;
			}
			else if(ch >= 'A' && ch <= 'Z'){
				ch = (char)(ch + clave);	
				
				if(ch > 'Z'){
					ch = (char)(ch - 'Z' + 'A' - 1);
				}
				
				Textoencriptado += ch;
			}
			else {
				Textoencriptado += ch;
			}
		}
		
		return Textoencriptado;
	}
	
	public String DesEncriptar() {

        System.out.println("Dame un String a Desencriptar: ");
		mensaje = sn.nextLine();
        System.out.println("introduce la clave: ");
		clave = sn.nextInt();	 		
		
		for(int i = 0; i < mensaje.length(); ++i){
			ch = mensaje.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch - clave);
	            
	            if(ch < 'a'){
	                ch = (char)(ch + 'z' - 'a' + 1);
	            }
	            
	            Textodesencriptado += ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch - clave);
	            
	            if(ch < 'A'){
	                ch = (char)(ch + 'Z' - 'A' + 1);
	            }
	            
	            Textodesencriptado += ch;
	        }
	        else {
	        	Textodesencriptado += ch;
	        }
		}
		
		return Textodesencriptado;
	}

	
}
