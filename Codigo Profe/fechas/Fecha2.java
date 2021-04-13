package fechas;

public class Fecha2 {
	private int anho = 0;
	private int mes = 1;
	private int dia = 1;
	public static final int ENERO = 1;
	public static final int FEBRERO = 2;
	public static final int MARZO = 3;
	public static final int ABRIL= 4;
	public static final int MAYO = 5;
	public static final int JUNIO = 6;
	public static final int JULIO= 7;
	public static final int AGOSTO= 8;
	public static final int SEPTIEMBRE= 9;
	public static final int OCTUBRE = 10;
	public static final int NOVIEMBRE= 11;
	public static final int DICIEMBRE= 12;
	
	
	public static boolean esBisiesto(int anho) {
		if(anho%4==0 && anho%100!=0 || anho%400==0) {
			return true;
		}
		return false;
	}
	
	public boolean esBisiesto() {
		if(this.anho%4==0 && this.anho%100!=0 || this.anho%400==0) {
			return true;
		}
		return false;
	}
	
	public Fecha2() {
		super();
	}
	
	public Fecha2(int anho, int mes, int dia) throws FechaException {
		super();
		/*setAnho(anho);
		setMes(mes);
		setDia(dia);
		*/
		set(anho,mes,dia);
	}

	public Fecha2(Fecha2 f) throws FechaException {
		super();
		setAnho(f.anho);
		setMes(f.mes);
		setDia(f.dia);
	}
	
	
	public void setAnho(int anho) throws FechaException {
		if(anho<0) {
			throw new FechaException("No se aceptan años negativos");
		}
		this.anho=anho;
	
	}
	
	public int getAnho() {
		return this.anho;
	}
	public void setMes(int mes) throws FechaException {
		if (mes<ENERO || mes>DICIEMBRE) {
			throw new FechaException("mes incorrecto");
		}
		this.mes=mes;
	}
	public int getMes() {
		return this.mes;
	}
	public void setDia(int dia) throws FechaException {
		if (dia <1 || dia > 31) {
			throw new FechaException("día incorrecto");
		}
		if ((  this.mes==ABRIL 
			|| this.mes==JUNIO 
			|| this.mes==SEPTIEMBRE
			|| this.mes==NOVIEMBRE)
			&&(dia==31)) {
			throw new FechaException("Ese mes no tiene 31 días");
		}
		if (this.mes==FEBRERO) {
			if (!esBisiesto(this.anho) && dia>28) {
				throw new FechaException("Febrero tiene 28 días");
			}
			if (esBisiesto(this.anho) && dia>29) {
				throw new FechaException("Ni siendo año bisiesto febrero tiene "+dia+" días");
			}
		}
		this.dia=dia;
	}
	public int getDia() {
		return this.dia;
	}
	public void set(int anho, int mes, int dia) throws FechaException {
		setAnho(anho);
		setMes(mes);
		setDia(dia);
	}
	public void set(Fecha2 f) throws FechaException {
		setAnho(f.anho);
		setMes(f.mes);
		setDia(f.dia);
	}
	public String toString() {
		return String.valueOf(this.dia)+"/"+
				String.valueOf(this.mes)+"/"+
				String.valueOf(this.anho);
	}
	
	public boolean equals(Object o) {
		return super.equals(o);
	}
	
}

