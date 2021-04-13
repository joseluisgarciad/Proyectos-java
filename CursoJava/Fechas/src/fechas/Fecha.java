package fechas;

public class Fecha {

	private int anho = 0;
	private int mes = 1;
	private int dia = 1;
	public static final int meses_Anho = 12;
	public static boolean esBisiesto(int anho) {
		return false;
	}

		
	public Fecha() {
		super();
	}

	public Fecha(int anho, int mes, int dia) {
		super();
		this.anho = anho;
		this.mes = mes;
		this.dia = dia;
	}

    public Fecha(Fecha f) {
    	
    }

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) throws FechaException {
		this.anho = anho;
		if (this.mes < 1 || this.mes > 12) {
			throw new FechaException("El mes debe estar comprendido entre 1 y 12");
		} else {
			
		}
			
		/*
		if (this.anho<1950) {
			throw new FechaException("El a�o no puede ser < 1950");
		} else {
			if (esbisiesto(this.anho) == true) {
				throw new FechaException("El a�o " + this.anho + " es bisiesto" );
			}
		}
		*/
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}


    public void set(int anho, int mes, int dia) {
    	
    }
    
    public void set(Fecha f) {
    	
    }
    
    public boolean esbisiesto(int anho) { 		
        if ((getAnho() % 4 == 0) && ((getAnho() % 100 != 0) || (getAnho() % 400 == 0))) {
        	return true;
        } else {
        	return false;
        }
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.anho + "/" + this.mes + "/" + this.dia + esbisiesto(getAnho());
	}

	public boolean equals(Object o) {
		return true;
	}
	
	
}
