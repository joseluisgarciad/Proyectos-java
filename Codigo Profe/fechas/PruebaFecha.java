package fechas;

public class PruebaFecha {

	public static final int MAX_FECHAS = 100;

	public static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {
		Fecha2 fec1,fec2;
		
		try {
			fec1 = new Fecha2(2000,6,13);
			fec2 = new Fecha2(2000,6,14);
			fec2.setDia(13);
			fec2=fec1;
			System.out.println(fec1.equals(fec2));
			System.out.println(fec1==fec2);
		} catch (FechaException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		for (int i = 0; i < MAX_FECHAS; i++) {
			Fecha2 f;
			int anho=random(1, 2007);
			int mes=random(Fecha2.ENERO, Fecha2.DICIEMBRE);
			int dia=random(1, 31);
			try {
				f = new Fecha2(anho,mes,dia);
				System.out.println("Fecha correcta: " + f.toString());
			} catch (Exception e) {
				System.out.println("EXCEPTION: "+String.valueOf(dia)+"/"+
						String.valueOf(mes)+"/"+
						String.valueOf(anho)+" " + e.getMessage());
			}
		}
	}

}
