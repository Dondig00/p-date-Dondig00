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



//Te dice si es el mismo año en ambas fechas
	public boolean isSameYear(Date n) {
	boolean isSameYear=false;
	System.out.println("¿Son el mismo año?");
	if (_year == n.getYear()){isSameYear=true;}
		return isSameYear;
	}
//Te dice si es el mismo mes en ambas fechas
	public boolean isSameMonth(Date n){
	boolean isSameMonth=false;
	System.out.println("¿Son el mismo mes?");
	if (_month == n.getMonth()){isSameMonth=true;}
		return isSameMonth;
	
	}
//Te dice si el dia es el mismo en las dos fechas
	public boolean isSameDay(Date n){
	boolean isSameDay=false;
	System.out.println("¿Es el mismo dia?");
	if (_day == n.getDay()){isSameDay=true;}
		return isSameDay;
	}
//Te dice si la fecha es la misma entre las dos
	public boolean isSame(Date n){
	boolean isSame=false;
	System.out.println("¿Es la misma fecha?");
	if(_day == n.getDay() && _month == n.getMonth() && _year == n.getYear() ){isSame=true;}
	return isSame;
	}

//Muestra por pantalla todas las fechas hasta que acabe el mes
	public int alldates(){
		int dia;
		dia = _day;
		
		if (_month == 1 || _month == 3 || _month == 5 || _month == 7 ||_month == 8 || _month == 10 || _month == 12){
			while(dia<=31){
				System.out.println(dia+" "+_month+" "+_year);
				dia++;
					}
			}
		else if (_month == 2){
			while(dia<=28){
				System.out.println(dia+" "+_month+" "+_year);
				dia++;
					}
			}
		else{
			while(dia<=30){
				System.out.println(dia+" "+_month+" "+_year);
				dia++;
					}
			}
		return 0 ;
}
	

//Te dice los meses con el mismo numero de dias que el mes de la fecha
	public StringBuffer Meses(){
		StringBuffer igual = new StringBuffer();
		igual.append(" ");
		if (_month == 1 || _month == 3 || _month == 5 || _month == 7 ||_month == 8 || _month == 10 || _month == 12){
			if(_month == 1){igual.append("Marzo,Mayo,Julio,Agosto,octubre,diciembre");}
			if(_month == 3){igual.append("Enero,Mayo,Julio,Agosto,octubre,diciembre");}
			if(_month == 5){igual.append("Enero,Marzo,Julio,Agosto,octubre,diciembre");}
			if(_month == 7){igual.append("Enero,Marzo,Mayo,Agosto,octubre,diciembre");}
			if(_month == 8){igual.append("Enero,Marzo,Mayo,Julio,octubre,diciembre");}
			if(_month == 10){igual.append("Enero,Marzo,Mayo,Julio,Agosto,diciembre");}
			if(_month == 12){igual.append("Enero,Marzo,Mayo,Julio,Agosto,octubre");}
				}
		else if (_month == 2){igual.append("Solo febrero tiene 28 dias");}
		else{
			if(_month == 4){igual.append("Junio,Septiembre,Noviembre");}
			if(_month == 6){igual.append("Abril,Septiembre,Noviembre");}
			if(_month == 9){igual.append("Abril,Junio,Noviembre");}
			if(_month == 11){igual.append("Abril,Junio,Septiembre");}
				}
		return igual;
			
}
//Te dice el numero de dias que llevan desde que empezo el año
	public int Resto(){
		int resto,dias,e,f,m,a,M,j,J,A,s,o,n;
		resto =0;
		e= 31;
		m= 31;
		M= 31;
		J= 31;
		A= 31;
		o= 31;
		f = 28;
		a= 30;
		j= 30;
		s= 30;
		n = 30;
		dias = _day;
		if(_month==1){resto=dias;}
		if(_month==2){resto=(dias+e);}
		if(_month==3){resto=(dias+e+f);}
		if(_month==4){resto=(dias+e+f+m);}
		if(_month==5){resto=(dias+e+f+m+a);}
		if(_month==6){resto=(dias+e+f+m+a+M);}
		if(_month==7){resto=(dias+e+f+m+a+M+j);}
		if(_month==8){resto=(dias+e+f+m+a+M+j+J);}
		if(_month==9){resto=(dias+e+f+m+a+M+j+J+A);}
		if(_month==10){resto=(dias+e+f+m+a+M+j+J+A+s);}
		if(_month==11){resto=(dias+e+f+m+a+M+j+J+A+s+o);}
		if(_month==12){resto=(dias+e+f+m+a+M+j+J+A+s+o+n);}
		return resto;

}
//Asigna el nombre dependiendo del mes
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

//Corrige si el mes no tiene ese dia y te pida que escribas uno nuevo hasta que sea valido
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
//Te dice la estacion en la que se encuentra el mes elegido
	public StringBuffer Season(){
		StringBuffer season = new StringBuffer();
		season.append("Estacion: ");
		if(_month >= 3 && _month < 6){ season.append("Primavera");}
		if(_month >= 6 && _month < 9){ season.append("Verano");}
		if(_month >= 9 && _month < 12){ season.append("Otoño");}
		if(_month == 12 || _month < 3){ season.append("Invierno");}
		return season;

		
	}


//Te dice el numero de meses que quedan para que acabe el año
	public int end(){
		int fin = 12-_month;
		return fin;
		}
//Te dice el numero de intentos para que genere una fecha aleatoria en ese mismo año igual a la nuestra
	public int random(){
		int dia,mes,i;
		dia = 0;
		mes = 0;
		i = 0;
			while(_day != dia && _month != mes){
					mes = (int) (Math.random()*12) +1;
					if(mes == 1 ||mes == 3||mes == 5||mes == 7||mes == 8||mes == 10||mes == 12){dia = (int) (Math.random()*31)+1;}
					else if(mes == 4 ||mes == 6||mes == 9||mes == 11){dia = (int) (Math.random()*30)+1;}
					else{dia = (int) (Math.random()*28)+1;}
					i++;
		    	}
		
		return i;
	}
//Te dice el dia de la semana siempre pensando que el primer dia del año es lunes
	public StringBuffer Week(){
		StringBuffer week = new StringBuffer();
		int dia,e,f,ma,a,Ma,ju,Ju,A,se,o,n,resul;
		int L,M,X,J,V,S,D;
		resul = 0;
		L=1;M=2;X=3;J=4;V=5;S=6;D=7;
		dia = _day;
		e= 31;ma= 31;Ma= 31;Ju= 31;A= 31;o= 31;
		f = 28;a= 30;ju= 30;se= 30;n = 30;
		week.append("El dia es: ");
		if(_month==1){dia=_day;}
		if(_month==2){dia=(_day+e);}
		if(_month==3){dia=(_day+e+f);}
		if(_month==4){dia=(_day+e+f+ma);}
		if(_month==5){dia=(_day+e+f+ma+a);}
		if(_month==6){dia=(_day+e+f+ma+a+Ma);}
		if(_month==7){dia=(_day+e+f+ma+a+Ma+ju);}
		if(_month==8){dia=(_day+e+f+ma+a+Ma+ju+Ju);}
		if(_month==9){dia=(_day+e+f+ma+a+Ma+ju+Ju+A);}
		if(_month==10){dia=(_day+e+f+ma+a+Ma+ju+Ju+A+se);}
		if(_month==11){dia=(_day+e+f+ma+a+Ma+ju+Ju+A+se+o);}
		if(_month==12){dia=(_day+e+f+ma+a+Ma+ju+Ju+A+se+o+n);}
		while(dia != resul){
			if(dia == L){week.append("Es lunes");resul = L;}
				if(dia == M ){week.append("Es martes");resul = M;}
				if(dia == X){week.append("Es miercoles");resul = X;}
				if(dia == J){week.append("Es jueves");resul = J;}
				if(dia == V){week.append("Es viernes");resul = V;}
				if(dia == S){week.append("Es sabado");resul = S;}
				if(dia == D){week.append("Es domingo");resul = D;}
				L=L+7;M=M+7;X=X+7;J=J+7;V=V+7;S=S+7;D=D+7;
		}
			
			
		
		
		return week;

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
		//salida.append(" "+alldates());
		return salida.toString();
		
		}


}

	
