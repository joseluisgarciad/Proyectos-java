
public class Utilidades {
	 static double pi = 13.1416;
	 
     public static int suma (int s1, int s2) {
        return s1+s2;
     }
     public int resta (int s1, int s2) {
         return s1-s2;
      }
     public int multiplicacion (int s1, int s2) {
         return s1*s2;
      }
     public int division (int s1, int s2) {
         return s1/s2;
      }
     
     static double mEUR = 0.86;
     static double mDolar = 1.16;	

     public static double Conversor (String DivO, String DivD, double s1) {
     		double resultado = 0;

     		if (DivO.equals("EUR")) { 
     			resultado = (mDolar*s1);
     		} else if  (DivO.equals("USD")) { 
     			resultado = (mEUR*s1);				
     		}
     		
     		return resultado;
     		
     	}
     
     public static int Contarvocales (String palabra) {

 		int contador = 0;
 		String vocales="aeiou?????AEIOU?????";
 		for(int i=0;i<palabra.length();i++){
             for(int j=0;j<vocales.length();j++){
                if(palabra.charAt(i)==vocales.charAt(j)){
                     contador++;
                 }

             }            
             
 	    }
 		return contador;
     }
     
     public static int Contarpalabras (String frase) {
 		int resultado = 0;
 		String[] fraseTroceada = frase.split(" ");
 		resultado = fraseTroceada.length;

         return resultado;            
     }
}     
/*     
     import javax.swing.JTextArea;
      
         public static void varios() {
              
             int[] vocales = new int[5];
             String frase = JOptionPane.showInputDialog(null, 
                     "Introduce una frase", 
                     "Contar el n?mero de vocales", 
                     JOptionPane.QUESTION_MESSAGE);
             char caracter;
             for(int i=0;i<frase.length();i++){
                 caracter = Character.toLowerCase(frase.charAt(i));
      
                 switch (caracter) {
                 case 'a':
                     vocales[0]++;
                     break;
                 case 'e':
                     vocales[1]++;
                     break;
                 case 'i':
                     vocales[2]++;
                     break;
                 case 'o':
                     vocales[3]++;
                     break;
                 case 'u':
                     vocales[4]++;
                     break;
                 default:
                     break;
                 }
             }
      
             JTextArea textArea = new JTextArea("");
             textArea.append("Vocal\tVeces\n");
             textArea.append("*********************\n");
             textArea.append("a\t" + vocales[0] + "\n");
             textArea.append("e\t" + vocales[1] + "\n");
             textArea.append("i\t" + vocales[2] + "\n");
             textArea.append("o\t" + vocales[3] + "\n");
             textArea.append("u\t" + vocales[4] + "\n");
              
             JOptionPane.showMessageDialog(null,
                     textArea,
                     "Apariciones vocales",
                     JOptionPane.INFORMATION_MESSAGE);
      
         }
     }
}
     */