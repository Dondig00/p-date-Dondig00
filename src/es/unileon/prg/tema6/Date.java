
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




	int isSameYear(Date n) {
	if (_year == n.getYear()){System.out.println("Mismo año");}
	return 0;
	}
	int isSameMonth(Date n){
	if (_month == n.getMonth()){System.out.println("Mismo mes");}
	return 0;
	}
	/*int isSameDay(Date n){
	if (_day == n.getDay()){System.out.println("Mismo dia");}
	return 0;
	}*/

	
	
	




























	/*public 	String toString() {
		StringBuffer salida = new StringBuffer();
		
		salida.append(_day);
		salida.append(_month);
		salida.append(_year);
		return salida.toString();
		
		}*/


}

	
