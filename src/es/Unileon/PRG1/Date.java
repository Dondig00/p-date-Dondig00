package es.unileon.prg.tema6;


public class Date {
	private int _day;
	private int _month;
	private int _year;
	
	public Date(int day, int month, int year){
		this._day = day;
		this._month = month;
		this._year = year;
	}
	void setDay(int newDay) {
		_day = newDay;

	}
	void setMonth(int newMonth){
		_month = newMonth;
	}
	void setYear(int newYear){
		_year = newYear;
	}

	public int getDay(){
		return _day;
	}
	public int getMonth(){
		return _month;
	}
	public int getYear(){
		return _year;
	}




	public boolean isSameYear(Date n) {
	boolean isSameYear=false;
	System.out.println("¿Son el mismo año?");
	if (_year == n.getYear()){isSameYear=true;}
		return isSameYear;
	}
	public boolean isSameMonth(Date n){
	boolean isSameMonth=false;
	System.out.println("¿Son el mismo mes?");
	if (_month == n.getMonth()){isSameMonth=true;}
		return isSameMonth;
	
	}
	public boolean isSameDay(Date n){
	boolean isSameDay=false;
	System.out.println("¿Es el mismo dia?");
	if (_day == n.getDay()){isSameDay=true;}
		return isSameDay;
	}
	public boolean isSame(Date n){
	boolean isSame=false;
	System.out.println("¿Es la misma fecha?");
	if(_day == n.getDay() && _month == n.getMonth() && _year == n.getYear() ){isSame=true;}
	return isSame;
	}




	
	






	public StringBuffer Mes() {
		StringBuffer nombre = new StringBuffer();
		nombre.append(" ");
		if(_month == 1){nombre.append("Enero");}
		if(_month == 2){nombre.append("Febrero");}
		if(_month == 3){nombre.append("Marzo");}
		if(_month == 4){nombre.append("Abril");}
		if(_month == 5){nombre.append("Mayo");}
		if(_month == 6){nombre.append("Junio");}
		if(_month == 7){nombre.append("Julio");}
		if(_month == 8){nombre.append("Agosto");}
		if(_month == 9){nombre.append("Septiembre");}
		if(_month == 10){nombre.append("Octubre");}
		if(_month == 11){nombre.append("Noviembre");}
		if(_month == 12){nombre.append("Diciembre");}
 		return nombre;



	}


	public int Month(){
	int dia;
	if(_month == 2){
		while(_day > 28){
			System.out.println("Ese dia no existe");
			dia =Teclado.readInteger();
			_day = dia;
			}
		}
		else if (_month == 1 || _month == 3 || _month == 5 || _month == 7 ||_month == 8 || _month == 10 || _month == 12){
		while (_day > 31){
			System.out.println("Ese dia no existe");
			dia =Teclado.readInteger();
			_day = dia;
			}
		}
		else{while (_day > 30){
			System.out.println("Ese dia no existe");
			dia =Teclado.readInteger();
			_day = dia;
			}
		}

		return _day;
}

	public StringBuffer Season(){
		StringBuffer season = new StringBuffer();
		season.append("Estacion: ");
		if(_month >= 3 && _month < 6){ season.append("Primavera");}
		if(_month >= 6 && _month < 9){ season.append("Verano");}
		if(_month >= 9 && _month < 12){ season.append("Otoño");}
		if(_month == 12 || _month < 3){ season.append("Invierno");}
		return season;

		
	}



	public int end(){
		int fin = 12-_month;
		return fin;
		}










	public 	String toString() {
		StringBuffer salida = new StringBuffer();
		int dia,mes,ano;
		while (_month > 12){
			System.out.println("Ese mes no existe");
			mes=Teclado.readInteger();
			_month = mes;
			}
		_day = Month();
		
		salida.append(_day+"");
		salida.append(" "+_month);
		salida.append(" "+_year);
		salida.append(" "+Mes());
		salida.append(" "+Season());
		salida.append(" "+"quedan "+end()+" "+"meses");
		return salida.toString();
		
		}


}

	
