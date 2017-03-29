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
	public boolean isSameDate(Date n){
	boolean isSameDate=false;
	System.out.println("¿Es la misma fecha?");
	if(_day == n.getDay() && _month == n.getMonth() && _year == n.getYear() ){isSameDate=true;}
	return isSameDate;
	}




	/*int dias(int dia){
	if(_day > 31){System.out.println("Ese dia no existe");
	dia =Teclado.readInteger();}
	_day = dia;
	return _day;
	}*/
	




























	public 	String toString() {
		StringBuffer salida = new StringBuffer();
		int dia,mes,ano;
		while (_month > 12){
			System.out.println("Ese mes no existe");
			mes=Teclado.readInteger();
			_month = mes;
			}
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
		salida.append(_day+"");
		salida.append(" "+_month);
		salida.append(" "+_year);
		return salida.toString();
		
		}


}

	
